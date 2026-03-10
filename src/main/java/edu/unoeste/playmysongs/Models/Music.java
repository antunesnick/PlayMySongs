package edu.unoeste.playmysongs.Models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Music {

    private String title;
    private String style;
    private String artist;
    private String musicFile;

}
