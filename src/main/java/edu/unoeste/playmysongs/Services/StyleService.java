package edu.unoeste.playmysongs.Services;

import edu.unoeste.playmysongs.Models.Style;
import edu.unoeste.playmysongs.Repositories.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StyleService {

    @Autowired
    StyleRepository styleRepository;

    public List<Style> getAllStyles() {
        return styleRepository.findAll();
    }
}
