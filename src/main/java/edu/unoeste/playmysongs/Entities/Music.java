package edu.unoeste.playmysongs.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public class Music {
    String title;
    String style;
    String artist;
    String file;
}
