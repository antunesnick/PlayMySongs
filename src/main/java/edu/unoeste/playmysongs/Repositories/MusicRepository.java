package edu.unoeste.playmysongs.Repositories;

import edu.unoeste.playmysongs.Models.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends MongoRepository<Music, String> {

    List<Music> findByTitleContainingIgnoreCase(String title);

    @Query("{ '$or': [ { 'artist': { $regex: ?0, $options: 'i' } }, { 'title': { $regex: ?0, $options: 'i' } }, { 'style': { $regex: ?0, $options: 'i' } } ] }")
    List<Music> findMusicByArtistOrTitleOrStyleContainingIgnoreCase(String key);

}
