package edu.unoeste.playmysongs.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "songs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Music {
    @Id
    private String id;
    private String title;
    private String style;
    private String artist;
    private String file;

    public Music(String title, String style, String artist, String file) {
        this.title = title;
        this.style = style;
        this.artist = artist;
        this.file = file;
    }
}