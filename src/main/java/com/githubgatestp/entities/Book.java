package com.githubgatestp.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Book {
    private Long id;
    private String title;
    private String author;
    private String publishedDate;

}
