package edu.unoeste.playmysongs.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "styles")
public class Style {
    String nome;
    String desc;
}
