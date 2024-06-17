package org.example.cineworld.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String coverImageUrl;
    private LocalDate publicationDate;
    private String contentImageUrl;

    @Column(length = 1500)
    private String content;

    private String source;
}
