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
            String description1 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/movie1_description.txt").getURI())));
            String review1 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/movie1_review.txt").getURI())));

            String description2 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/movie2_description.txt").getURI())));
            String review2 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/movie2_review.txt").getURI())));

            String description3 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/movie3_description.txt").getURI())));
            String review3 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/movie3_review.txt").getURI())));

            String description4 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/movie4_description.txt").getURI())));
            String review4 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/movie4_review.txt").getURI())));

            repository.save(Movie.builder()
                    .title("Пролетая над гнездом кукушки")
                    .director("Милош Форман")
                    .releaseYear(1975)
                    .budget(3_000_000)
                    .boxOffice(108_981_275)
                    .imdbRating(8.70F)
                    .votes(795_217)
                    .trailerUrl("https://www.youtube.com/embed/yMnXpoudToM")
                    .description(description1)
                    .review(review1)
                    .personalRating(9F)
                    .build());

            repository.save(Movie.builder()
                    .title("Призрак")
                    .director("Роман Полански")
                    .releaseYear(2009)
                    .budget(45_000_000)
                    .boxOffice(60_222_298)
                    .imdbRating(7.20F)
                    .votes(143_851)
                    .trailerUrl("https://www.youtube.com/embed/DOf4TGqPDTI")
                    .description(description2)
                    .review(review2)
                    .personalRating(8F)
                    .build());

            repository.save(Movie.builder()
                    .title("Призрачная нить")
                    .director("Пол Томас Андерсон")
                    .releaseYear(2017)
                    .budget(35_000_000)
                    .boxOffice(47_158_342)
                    .imdbRating(7.60F)
                    .votes(70_430)
                    .trailerUrl("https://www.youtube.com/embed/6hMVSCkh-kc")
                    .description(description3)
                    .review(review3)
                    .personalRating(8F)
                    .build());

            repository.save(Movie.builder()
                    .title("Старикам тут не место")
                    .director("Итан Коэн, Джоэл Коэн")
                    .releaseYear(2007)
                    .budget(25_000_000)
                    .boxOffice(171_627_166)
                    .imdbRating(8.10F)
                    .votes(763_933)
                    .trailerUrl("https://www.youtube.com/embed/ln1cucVVLSY")
                    .description(description4)
                    .review(review4)
                    .personalRating(10F)
                    .build());
        };
    }
}
