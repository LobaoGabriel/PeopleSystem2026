package br.edu.faculdade.albuns1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Albuns1Controller {

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "API de álbuns musicais — no ar!";
    }

    @GetMapping("/destaque")
    public Albums destaque() {
        return new Albums("Random Access Memories", "Daft Punk", 2013);
    }

    @GetMapping("/albums")
    public List<Albums> albums() {
        return List.of(
                new Albums("Random Access Memories", "Daft Punk", 2013),
                new Albums("Discovery", "Daft Punk", 2001),
                new Albums("To Pimp a Butterfly", "Kendrick Lamar", 2015),
                new Albums("Abbey Road", "The Beatles", 1969)
        );
    }
}