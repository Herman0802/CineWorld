package org.example.cineworld.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

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
    private int releaseYear;
    private long budget;
    private long boxOffice;
    private float imdbRating;
    private int votes;
    private String trailerUrl;

    @Column(length = 1000)
    private String description;
    @Column(length = 4000)
    private String review;

    private float personalRating;

    public boolean hasReview() {
        return (this.review != null) && !this.review.isEmpty();
    }
}
