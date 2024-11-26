package amo11k.com.track_my_gaming.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GameService {

    @Value("${rawg.api.key}")
    private String apiKey; // La clave API de RAWG

    private final String baseUrl = "https://api.rawg.io/api/games";

    public String getGamesByName(String gameName) {
        String url = baseUrl + "?key=" + apiKey + "&search=" + gameName;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class); // Devuelve los resultados en formato JSON
    }
}

