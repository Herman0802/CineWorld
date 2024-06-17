package org.example.cineworld.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String director;
    private LocalDate releaseDate;
    private long budget;
    private long boxOffice;

    @Column(length = 1000)
    private String description;

    private String trailerUrl;
    private float imdbRating;
    private int votes;
    private float personalRating;

    @Column(length = 4000)
    private String review;

    public boolean hasReview() {
        return (this.review != null) && !this.review.isEmpty();
    }
}
