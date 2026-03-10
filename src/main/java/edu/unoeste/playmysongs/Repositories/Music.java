package edu.unoeste.playmysongs.Repositories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@RequiredArgsConstructor
@Repository
public class Music {

    private String title;
    private String style;
    private String artist;
    private String musicFile;

}
