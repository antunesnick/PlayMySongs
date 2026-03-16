package edu.unoeste.playmysongs.Repositories;

import edu.unoeste.playmysongs.Models.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends MongoRepository<Music, String> {

    List<Music> findByTitleContainingIgnoreCase(String title);

}
