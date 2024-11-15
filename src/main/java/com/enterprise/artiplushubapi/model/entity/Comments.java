package com.enterprise.artiplushubapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createAt;

    @ManyToOne
    @JoinColumn(name = "readers_id", referencedColumnName = "Id"
            ,foreignKey = @ForeignKey(name = "FK_comments_readers"))
    private Readers readers_id;

    @ManyToOne
    @JoinColumn(name = "articles_id", referencedColumnName = "Id"
            ,foreignKey = @ForeignKey(name = "FK_comments_articles"))
    private Articles articles_id;
}

