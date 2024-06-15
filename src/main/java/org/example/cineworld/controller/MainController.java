package org.example.cineworld.controller;

import org.example.cineworld.model.Movie;
import org.example.cineworld.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/news")
    public String news() {
        return "news";
    }

    @GetMapping("/poster")
    public String poster() {
        return "poster";
    }

    @GetMapping("/rating")
    public String rating() {
        return "rating";
    }

    @GetMapping("/enter")
    public String enter() {
        return "enter";
    }

    @GetMapping("/movie/{id}")
    public String movie(@PathVariable("id") Long id, Model model) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid movie Id:" + id));
        model.addAttribute("movie", movie);
        return "movie";
    }

    @GetMapping("/new1")
    public String new1() {
        return "new1";
    }

    @GetMapping("/new2")
    public String new2() {
        return "new2";
    }

    @GetMapping("/new3")
    public String new3() {
        return "new3";
    }

    @GetMapping("/new4")
    public String new4() {
        return "new4";
    }
}
