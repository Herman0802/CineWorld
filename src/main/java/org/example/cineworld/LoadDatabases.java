package org.example.cineworld;

import org.example.cineworld.model.Movie;
import org.example.cineworld.model.News;
import org.example.cineworld.repository.MoviesRepository;
import org.example.cineworld.repository.NewsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.time.LocalDate;

@Configuration
public class LoadDatabases {

    @Bean
    CommandLineRunner initMoviesDatabase(MoviesRepository repository, ResourceLoader resourceLoader) {
        return args -> {
            String description1 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/one_flew_cuckoos_nest/description.txt").getURI())));
            String review1 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/one_flew_cuckoos_nest/review.txt").getURI())));

            String description2 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/ghost_writer/description.txt").getURI())));
            String review2 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/ghost_writer/review.txt").getURI())));

            String description3 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/phantom_thread/description.txt").getURI())));
            String review3 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/phantom_thread/review.txt").getURI())));

            String description4 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/no_country_old_men/description.txt").getURI())));
            String review4 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/movies/no_country_old_men/review.txt").getURI())));

            repository.save(Movie.builder()
                    .title("One Flew Over the Cuckoo's Nest")
                    .director("Milos Forman")
                    .releaseDate(LocalDate.of(1975, 11, 19))
                    .budget(3_000_000)
                    .boxOffice(108_981_275)
                    .description(description1)
                    .trailerUrl("https://www.youtube.com/embed/OXrcDonY-B8")
                    .imdbRating(8.70f)
                    .votes(1_077_015)
                    .review(review1)
                    .personalRating(9F)
                    .build());

            repository.save(Movie.builder()
                    .title("The Ghost Writer")
                    .director("Roman Polanski")
                    .releaseDate(LocalDate.of(2010, 2, 12))
                    .budget(45_000_000)
                    .boxOffice(60_222_298)
                    .description(description2)
                    .trailerUrl("https://www.youtube.com/embed/B3NrIz5lwVo")
                    .imdbRating(7.20f)
                    .votes(171_171)
                    .review(review2)
                    .personalRating(8f)
                    .build());

            repository.save(Movie.builder()
                    .title("Phantom Thread")
                    .director("Paul Thomas Anderson")
                    .releaseDate(LocalDate.of(2017, 12, 11))
                    .budget(35_000_000)
                    .boxOffice(47_158_342)
                    .description(description3)
                    .trailerUrl("https://www.youtube.com/embed/xNsiQMeSvMk")
                    .imdbRating(7.40f)
                    .votes(146_338)
                    .review(review3)
                    .personalRating(8f)
                    .build());

            repository.save(Movie.builder()
                    .title("No Country for Old Men")
                    .director("Ethan Coen, Joel Coen")
                    .releaseDate(LocalDate.of(2007, 5, 19))
                    .budget(25_000_000)
                    .boxOffice(171_627_166)
                    .description(description4)
                    .trailerUrl("https://www.youtube.com/embed/38A__WT3-o0")
                    .imdbRating(8.20f)
                    .votes(1_067_391)
                    .review(review4)
                    .personalRating(10f)
                    .build());

            repository.save(Movie.builder()
                    .title("The Shawshank Redemption")
                    .releaseDate(LocalDate.of(1994, 9, 10))
                    .imdbRating(9.3f)
                    .votes(2_906_089)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("The Godfather")
                    .releaseDate(LocalDate.of(1972, 3, 14))
                    .imdbRating(9.2f)
                    .votes(2_025_081)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("The Dark Knight")
                    .releaseDate(LocalDate.of(2008, 7, 14))
                    .imdbRating(9.0f)
                    .votes(2_887_344)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("The Godfather Part II")
                    .releaseDate(LocalDate.of(1974, 12, 12))
                    .imdbRating(9.0f)
                    .votes(1_371_409)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("12 Angry Men")
                    .releaseDate(LocalDate.of(1957, 4, 10))
                    .imdbRating(9.0f)
                    .votes(871_241)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Schindler's List")
                    .releaseDate(LocalDate.of(1993, 11, 30))
                    .imdbRating(9.0f)
                    .votes(1_459_255)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("The Lord of the Rings: The Return of the King")
                    .releaseDate(LocalDate.of(2003, 12, 1))
                    .imdbRating(9.0f)
                    .votes(1_989_946)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Pulp Fiction")
                    .releaseDate(LocalDate.of(1994, 5, 21))
                    .imdbRating(8.9f)
                    .votes(2_233_975)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("The Lord of the Rings: The Fellowship of the Ring")
                    .releaseDate(LocalDate.of(2001, 12, 10))
                    .imdbRating(8.9f)
                    .votes(2_018_40)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("The Good, the Bad and the Ugly")
                    .releaseDate(LocalDate.of(1966, 12, 23))
                    .imdbRating(8.8f)
                    .votes(815_319)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Forrest Gump")
                    .releaseDate(LocalDate.of(1994, 6, 23))
                    .imdbRating(8.8f)
                    .votes(2_271_748)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("The Bikeriders")
                    .releaseDate(LocalDate.of(2024, 6, 21))
                    .build()
            );

            repository.save(Movie.builder()
                    .title("The Exorcism")
                    .releaseDate(LocalDate.of(2024, 6, 21))
                    .build()
            );


            repository.save(Movie.builder()
                    .title("Something in the Water")
                    .releaseDate(LocalDate.of(2024, 6, 21))
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Kalki 2898-AD")
                    .releaseDate(LocalDate.of(2024, 6, 27))
                    .build()
            );


            repository.save(Movie.builder()
                    .title("Kinds of Kindness")
                    .releaseDate(LocalDate.of(2024, 6, 28))
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Horizon: An American Saga - Chapter 1")
                    .releaseDate(LocalDate.of(2024, 6, 28))
                    .build()
            );

            repository.save(Movie.builder()
                    .title("A Quiet Place: Day One")
                    .releaseDate(LocalDate.of(2024, 6, 28))
                    .build()
            );

            repository.save(Movie.builder()
                    .title("MaXXXine")
                    .releaseDate(LocalDate.of(2024, 7, 5))
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Kill")
                    .releaseDate(LocalDate.of(2024, 7, 5))
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Unicorns")
                    .releaseDate(LocalDate.of(2024, 7, 5))
                    .build()
            );
        };
    }

    @Bean
    CommandLineRunner initNewsDatabase(NewsRepository newsRepository, ResourceLoader resourceLoader) {
        return args -> {
            String content1 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/news/inside-out-2.txt").getURI())));
            String content2 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/news/martin-scorsese.txt").getURI())));
            String content3 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/news/shanghai-film-festival.txt").getURI())));
            String content4 = new String(Files.readAllBytes(Paths.get(resourceLoader.getResource("classpath:data/news/quentin-tarantino-robert-de-niro.txt").getURI())));

            newsRepository.save(News.builder()
                    .title("\"Inside Out 2\" Set for Record-Breaking Box Office Debut")
                    .coverImageUrl("/images/news/inside_out_2/cover.jpg")
                    .publicationDate(LocalDate.of(2024, 6, 15))
                    .contentImageUrl("/images/news/inside_out_2/content.jpg")
                    .content(content1)
                    .source("Variety")
                    .build());

            newsRepository.save(News.builder()
                    .title("Martin Scorsese to Explore Ancient Shipwrecks and Sicilian Heritage in New Documentary")
                    .coverImageUrl("/images/news/martin_scorsese/cover.jpg")
                    .publicationDate(LocalDate.of(2024, 6, 16))
                    .contentImageUrl("/images/news/martin_scorsese/content.jpg")
                    .content(content2)
                    .source("Variety")
                    .build());

            newsRepository.save(News.builder()
                    .title("Shanghai Film Festival Red Carpet Shines with International Stars and Local Talent")
                    .coverImageUrl("/images/news/shanghai_film_festival/cover.jpg")
                    .publicationDate(LocalDate.of(2024, 6, 15))
                    .contentImageUrl("/images/news/shanghai_film_festival/content.jpg")
                    .content(content3)
                    .source("Variety")
                    .build());

            newsRepository.save(News.builder()
                    .title("Quentin Tarantino Reflects on Working with Robert De Niro in \"Jackie Brown\"")
                    .coverImageUrl("/images/news/quentin_tarantino_robert_de_niro/cover.jpg")
                    .publicationDate(LocalDate.of(2024, 6, 14))
                    .contentImageUrl("/images/news/quentin_tarantino_robert_de_niro/content.jpg")
                    .content(content4)
                    .source("Variety")
                    .build());
        };
    }
}
