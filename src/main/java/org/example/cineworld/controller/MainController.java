package org.example.cineworld.controller;

import org.example.cineworld.model.Movie;
import org.example.cineworld.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    private final MovieRepository movieRepository;

    @Autowired
    public MainController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @RequestMapping({"/", "/reviews"})
    public String index() {
        return "reviews";
    }

    @GetMapping("/movie/{id}")
    public String movie(@PathVariable("id") Long id, @RequestParam("source") String source, Model model) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid movie Id:" + id));
        model.addAttribute("movie", movie);
        model.addAttribute("source", source);
        return "movie";
    }

    @GetMapping("/news")
    public String news() {
        return "news";
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

    @GetMapping("/rating")
    public String rating(Model model) {
        List<Movie> movies = movieRepository.findAll();
        model.addAttribute("movies", movies);
        return "rating";
    }

    @GetMapping("/poster")
    public String poster() {
        return "poster";
    }

    @GetMapping("/enter")
    public String enter() {
        return "enter";
    }
}
