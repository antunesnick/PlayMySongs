package edu.unoeste.playmysongs.Repositories;

import edu.unoeste.playmysongs.Models.Style;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends MongoRepository<Style, String> {



}
