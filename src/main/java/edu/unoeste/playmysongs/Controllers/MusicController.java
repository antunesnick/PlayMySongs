package edu.unoeste.playmysongs.Controllers;

import edu.unoeste.playmysongs.Models.Music;
import edu.unoeste.playmysongs.Services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:8080")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @PostMapping("add-music")
    public ResponseEntity<Object> addMusic(
            @RequestParam("title") String title,
            @RequestParam("artist") String artist,
            @RequestParam("style") String style,
            @RequestParam("file") MultipartFile file) {
        final String UPLOAD_FOLDER = "musics" + File.separator;
        if(title == null || artist == null || file == null)
            return ResponseEntity.badRequest().build();
        String archiveName = title.toLowerCase().replaceAll("\\s", "") +
                "_" + style.toLowerCase().replaceAll("\\s", "") +
                "_" + artist.toLowerCase().replaceAll("\\s", "") +
                ".mp3";

        File outputFile = new File(UPLOAD_FOLDER +archiveName);
        File uploadFolder = new File(UPLOAD_FOLDER);
        if(!uploadFolder.exists())
            uploadFolder.mkdir();
        try {
            file.transferTo(new File(uploadFolder.getAbsolutePath() + File.separator + archiveName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Music music = new Music(title, style, artist, archiveName);

        musicService.insertMusic(music);


        return ResponseEntity.ok("");
    }


    @GetMapping("find-music/{musicName}")
    public ResponseEntity<Object> findMusic(@PathVariable String musicName) {
        if(musicName.isBlank())
            return ResponseEntity.badRequest().build();

        List<Music> musics = musicService.findMusic(musicName);
        if(musics != null)
            return ResponseEntity.ok().body(musicService.findMusic(musicName));

        return ResponseEntity.notFound().build();
    }


    @GetMapping("get-music-styles")
    public ResponseEntity<Object> getStyles() {
        return ResponseEntity.ok().body(musicService.getStyles());
    }


}

