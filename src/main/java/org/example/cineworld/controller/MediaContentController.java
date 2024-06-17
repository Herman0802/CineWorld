package org.example.cineworld.controller;

import org.example.cineworld.model.Movie;
import org.example.cineworld.model.News;
import org.example.cineworld.repository.MoviesRepository;
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
public class MediaContentController {
    private final MoviesRepository moviesRepository;
    private final NewsRepository newsRepository;

    @Autowired
    public MediaContentController(MoviesRepository moviesRepository, NewsRepository newsRepository) {
        this.moviesRepository = moviesRepository;
        this.newsRepository = newsRepository;
    }

    @RequestMapping({"/", "/reviews"})
    public String reviews() {
        return "reviews";
    }

    @GetMapping("/movie/{id}")
    public String movie(@PathVariable("id") Long id, @RequestParam("source") String source, Model model) {
        Movie movie = moviesRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid movie Id:" + id));

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
        newsList.sort(Comparator.comparing(News::getPublicationDate).reversed());
        model.addAttribute("newsList", newsList);
        return "news";
    }

    @GetMapping("/news/{id}")
    public String newsDetails(@PathVariable("id") Long id, Model model) {
        News news = newsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid news Id:" + id));

        String[] paragraphs = news.getContent().split("\\r?\\n");
        model.addAttribute("news", news);
        model.addAttribute("paragraphs", paragraphs);

        return "news-details";
    }

    @GetMapping("/rating")
    public String rating(Model model) {
        List<Movie> movies = moviesRepository.findAll().stream()
                .filter(movie -> (movie.getImdbRating() != 0) && (movie.getVotes() != 0))
                .sorted(Comparator.comparing(Movie::getImdbRating).reversed()
                        .thenComparing(Comparator.comparing(Movie::getVotes).reversed()))
                .collect(Collectors.toList());
        model.addAttribute("movies", movies);
        return "rating";
    }

    @GetMapping("/premieres")
    public String poster(Model model) {
        List<Movie> upcomingMovies = moviesRepository.findAll().stream()
                .filter(movie -> (movie.getReleaseDate() != null) && movie.getReleaseDate().isAfter(LocalDate.now()))
                .sorted(Comparator.comparing(Movie::getReleaseDate))
                .collect(Collectors.toList());
        model.addAttribute("movies", upcomingMovies);
        return "premieres";
    }

    @GetMapping("/enter")
    public String enter() {
        return "enter";
    }
}
