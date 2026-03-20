package edu.unoeste.playmysongs.Services;

import edu.unoeste.playmysongs.Models.Music;
import edu.unoeste.playmysongs.Repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    MusicRepository musicRepository;

    public void insertMusic(Music music) {
        musicRepository.save(music);
    }

    public List<Music> findMusic(String key) {
        return musicRepository.findMusicByArtistOrTitleOrStyleContainingIgnoreCase(key);
    }

}
