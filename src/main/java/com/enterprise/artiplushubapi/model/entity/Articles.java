package com.enterprise.artiplushubapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "articles")
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "slug", columnDefinition = "TEXT")
    private String slug;

    @ManyToOne
    @JoinColumn(name = "creator_id", referencedColumnName = "Id"
            , foreignKey = @ForeignKey(name = "FK_article_creator"))
    private Creators creator_id;

    @Column(name = "file_path")
    private Integer file_path;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "Id"
            ,foreignKey = @ForeignKey(name = "FK_article_categories"))
    private Categories category_id;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;
}

