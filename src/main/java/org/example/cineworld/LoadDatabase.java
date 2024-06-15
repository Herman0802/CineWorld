package org.example.cineworld;

import org.example.cineworld.model.Movie;
import org.example.cineworld.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

import java.nio.file.Files;
import java.nio.file.Paths;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(MovieRepository repository, ResourceLoader resourceLoader) {
        return args -> {
            String description = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:movie1_description.txt").getURI())));
            String review = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:movie1_review.txt").getURI())));

            repository.save(Movie.builder()
                    .title("Пролетая над гнездом кукушки")
                    .director("Милош Форман")
                    .releaseYear(1975)
                    .budget("$3 000 000")
                    .boxOffice("$108 981 275")
                    .kinopoiskRating("8.554 (215 979)")
                    .imdbRating("8.70 (795 217)")
                    .trailerUrl("https://www.youtube.com/embed/yMnXpoudToM")
                    .description(description)
                    .review(review)
                    .personalRating("9/10")
                    .build());
            // Dodaj więcej filmów, jeśli potrzebne
        };
    }
}
