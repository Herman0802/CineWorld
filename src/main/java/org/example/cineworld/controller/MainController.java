package org.example.cineworld.controller;

import org.example.cineworld.model.Movie;
import org.example.cineworld.model.News;
import org.example.cineworld.repository.MovieRepository;
import org.example.cineworld.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {
    private final MovieRepository movieRepository;
    private final NewsRepository newsRepository;

    @Autowired
    public MainController(MovieRepository movieRepository, NewsRepository newsRepository) {
        this.movieRepository = movieRepository;
        this.newsRepository = newsRepository;
    }

    @RequestMapping({"/", "/reviews"})
    public String index() {
        return "reviews";
    }

    @GetMapping("/movie/{id}")
    public String movie(@PathVariable("id") Long id, @RequestParam("source") String source, Model model) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid movie Id:" + id));

        // Podział opisu i recenzji na akapity na podstawie pojedynczego znaku nowej linii
        String[] descriptionParagraphs = movie.getDescription().split("\\r?\\n");
        String[] reviewParagraphs = movie.getReview().split("\\r?\\n");

        model.addAttribute("movie", movie);
        model.addAttribute("descriptionParagraphs", descriptionParagraphs);
        model.addAttribute("reviewParagraphs", reviewParagraphs);
        model.addAttribute("source", source);
        return "movie";
    }

    @GetMapping("/news")
    public String news(Model model) {
        List<News> newsList = newsRepository.findAll();
        model.addAttribute("newsList", newsList);
        return "news";
    }

    @GetMapping("/news/{id}")
    public String newsDetail(@PathVariable("id") Long id, Model model) {
        News news = newsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid news Id:" + id));

        // Podział treści na akapity na podstawie pojedynczego znaku nowej linii
        String[] paragraphs = news.getContent().split("\\r?\\n");
        model.addAttribute("news", news);
        model.addAttribute("paragraphs", paragraphs);

        return "newsDetails";
    }

    @GetMapping("/rating")
    public String rating(Model model) {
        List<Movie> movies = movieRepository.findAll().stream()
                .sorted(Comparator.comparing(Movie::getImdbRating).reversed()
                        .thenComparing(Comparator.comparing(Movie::getVotes).reversed()))
                .collect(Collectors.toList());
        model.addAttribute("movies", movies);
        return "rating";
    }

    @GetMapping("/poster")
    public String poster(Model model) {
        List<Movie> upcomingMovies = movieRepository.findAll().stream()
                .filter(movie -> (movie.getReleaseDate() != null) && movie.getReleaseDate().isAfter(LocalDate.now()))
                .sorted(Comparator.comparing(Movie::getReleaseDate))
                .collect(Collectors.toList());
        model.addAttribute("movies", upcomingMovies);
        return "poster";
    }

    @GetMapping("/enter")
    public String enter() {
        return "enter";
    }
}
