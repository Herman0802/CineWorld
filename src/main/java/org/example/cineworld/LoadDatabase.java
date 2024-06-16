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
                    .imdbRating(8.70f)
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
                    .imdbRating(7.20f)
                    .votes(143_851)
                    .trailerUrl("https://www.youtube.com/embed/DOf4TGqPDTI")
                    .description(description2)
                    .review(review2)
                    .personalRating(8f)
                    .build());

            repository.save(Movie.builder()
                    .title("Призрачная нить")
                    .director("Пол Томас Андерсон")
                    .releaseYear(2017)
                    .budget(35_000_000)
                    .boxOffice(47_158_342)
                    .imdbRating(7.60f)
                    .votes(70_430)
                    .trailerUrl("https://www.youtube.com/embed/6hMVSCkh-kc")
                    .description(description3)
                    .review(review3)
                    .personalRating(8f)
                    .build());

            repository.save(Movie.builder()
                    .title("Старикам тут не место")
                    .director("Итан Коэн, Джоэл Коэн")
                    .releaseYear(2007)
                    .budget(25_000_000)
                    .boxOffice(171_627_166)
                    .imdbRating(8.10f)
                    .votes(763_933)
                    .trailerUrl("https://www.youtube.com/embed/ln1cucVVLSY")
                    .description(description4)
                    .review(review4)
                    .personalRating(10f)
                    .build());

            repository.save(Movie.builder()
                    .title("Побег из Шоушенка")
                    .releaseYear(1994)
                    .imdbRating(9.191f)
                    .votes(482972)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Зеленая миля")
                    .releaseYear(1999)
                    .imdbRating(9.134f)
                    .votes(452180)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Форрест Гамп")
                    .releaseYear(1994)
                    .imdbRating(9.013f)
                    .votes(442015)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Список Шиндлера")
                    .releaseYear(1993)
                    .imdbRating(8.884f)
                    .votes(245318)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("1+1")
                    .releaseYear(2011)
                    .imdbRating(8.835f)
                    .votes(470241)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Леон")
                    .releaseYear(1994)
                    .imdbRating(8.776f)
                    .votes(370691)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Начало")
                    .releaseYear(2010)
                    .imdbRating(8.774f)
                    .votes(506779)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Король Лев")
                    .releaseYear(1994)
                    .imdbRating(8.757f)
                    .votes(314937)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Бойцовский клуб")
                    .releaseYear(1999)
                    .imdbRating(8.714f)
                    .votes(431745)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Иван Васильевич меняет профессию")
                    .releaseYear(1973)
                    .imdbRating(8.708f)
                    .votes(334909)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Жизнь прекрасна")
                    .releaseYear(1997)
                    .imdbRating(8.675f)
                    .votes(156233)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Достучаться до небес")
                    .releaseYear(1997)
                    .imdbRating(8.648f)
                    .votes(346509)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Крестный отец")
                    .releaseYear(1972)
                    .imdbRating(8.636f)
                    .votes(212276)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Криминальное чтиво")
                    .releaseYear(1994)
                    .imdbRating(8.628f)
                    .votes(318400)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Престиж")
                    .releaseYear(2006)
                    .imdbRating(8.621f)
                    .votes(388212)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Игры разума")
                    .releaseYear(2001)
                    .imdbRating(8.620f)
                    .votes(321120)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Операция «Ы» и другие приключения Шурика")
                    .releaseYear(1965)
                    .imdbRating(8.620f)
                    .votes(290579)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Гладиатор")
                    .releaseYear(2000)
                    .imdbRating(8.586f)
                    .votes(297294)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Интерстеллар")
                    .releaseYear(2014)
                    .imdbRating(8.585f)
                    .votes(396120)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Властелин колец: Возвращение Короля")
                    .releaseYear(2003)
                    .imdbRating(8.582f)
                    .votes(322860)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Назад в будущее")
                    .releaseYear(1985)
                    .imdbRating(8.572f)
                    .votes(320890)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Карты, деньги, два ствола")
                    .releaseYear(1998)
                    .imdbRating(8.556f)
                    .votes(274411)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Бриллиантовая рука")
                    .releaseYear(1968)
                    .imdbRating(8.526f)
                    .votes(266254)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Матрица")
                    .releaseYear(1999)
                    .imdbRating(8.524f)
                    .votes(341836)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Поймай меня, если сможешь")
                    .releaseYear(2002)
                    .imdbRating(8.513f)
                    .votes(313689)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Отступники")
                    .releaseYear(2006)
                    .imdbRating(8.513f)
                    .votes(293099)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Пианист")
                    .releaseYear(2002)
                    .imdbRating(8.513f)
                    .votes(188023)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("В бой идут одни «старики»")
                    .releaseYear(1973)
                    .imdbRating(8.502f)
                    .votes(142212)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Властелин колец: Братство кольца")
                    .releaseYear(2001)
                    .imdbRating(8.500f)
                    .votes(313876)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Тайна Коко")
                    .releaseYear(2017)
                    .imdbRating(8.500f)
                    .votes(86954)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("ВАЛЛ·И")
                    .releaseYear(2008)
                    .imdbRating(8.499f)
                    .votes(300151)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Большой куш")
                    .releaseYear(2000)
                    .imdbRating(8.495f)
                    .votes(267368)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Властелин колец: Две крепости")
                    .releaseYear(2002)
                    .imdbRating(8.489f)
                    .votes(297707)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Американская история X")
                    .releaseYear(1998)
                    .imdbRating(8.489f)
                    .votes(233189)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Джентльмены удачи")
                    .releaseYear(1971)
                    .imdbRating(8.484f)
                    .votes(235217)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Пираты Карибского моря: Проклятие Черной жемчужины")
                    .releaseYear(2003)
                    .imdbRating(8.473f)
                    .votes(345185)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Остров проклятых")
                    .releaseYear(2009)
                    .imdbRating(8.470f)
                    .votes(382494)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Темный рыцарь")
                    .releaseYear(2008)
                    .imdbRating(8.466f)
                    .votes(352371)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Титаник")
                    .releaseYear(1997)
                    .imdbRating(8.462f)
                    .votes(382528)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("12 разгневанных мужчин")
                    .releaseYear(1956)
                    .imdbRating(8.449f)
                    .votes(77152)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Запах женщины")
                    .releaseYear(1992)
                    .imdbRating(8.446f)
                    .votes(173682)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Пробуждение")
                    .releaseYear(1990)
                    .imdbRating(8.443f)
                    .votes(106733)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("В джазе только девушки")
                    .releaseYear(1959)
                    .imdbRating(8.441f)
                    .votes(187085)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Хатико: Самый верный друг")
                    .releaseYear(2008)
                    .imdbRating(8.437f)
                    .votes(278168)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Эта замечательная жизнь")
                    .releaseYear(1947)
                    .imdbRating(8.431f)
                    .votes(42827)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Огни большого города")
                    .releaseYear(1931)
                    .imdbRating(8.429f)
                    .votes(44301)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Хороший, плохой, злой")
                    .releaseYear(1966)
                    .imdbRating(8.425f)
                    .votes(99125)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("Унесённые призраками")
                    .releaseYear(2001)
                    .imdbRating(8.423f)
                    .votes(208906)
                    .build()
            );

            repository.save(Movie.builder()
                    .title("...А зори здесь тихие")
                    .releaseYear(1972)
                    .imdbRating(8.423f)
                    .votes(99214)
                    .build()
            );
        };
    }
}
