package amo11k.com.track_my_gaming.controller;

import amo11k.com.track_my_gaming.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    public String searchGames(@RequestParam String name) {
        return gameService.getGamesByName(name); // Llama al servicio y devuelve los juegos en formato JSON
    }
}
