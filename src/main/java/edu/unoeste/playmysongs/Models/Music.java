package edu.unoeste.playmysongs.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Music {
    String title;
    String style;
    String artist;
    String file;
}
