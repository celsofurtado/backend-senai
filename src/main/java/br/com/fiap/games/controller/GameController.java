package br.com.fiap.games.controller;

import br.com.fiap.games.model.Game;
import br.com.fiap.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/games")
    public List<Game> getAll(){
        return gameRepository.findAll();
    }

    @GetMapping("/games/{id}")
    public Game getGame(@PathVariable Long id){
        return gameRepository.findById(id).get();
    }

    @PostMapping("/games")
    public Game saveGame(@RequestBody Game game){
        return gameRepository.save(game);
    }

}
