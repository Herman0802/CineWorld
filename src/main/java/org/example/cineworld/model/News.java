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
    private String contentImageUrl;
    private LocalDate publicationDate;

    @Column(length = 1500)
    private String content;

    private String source;
}
