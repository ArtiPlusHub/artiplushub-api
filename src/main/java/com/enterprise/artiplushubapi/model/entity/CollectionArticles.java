package com.enterprise.artiplushubapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "collection_articles")
@IdClass(CollectionArticlePK.class)
public class CollectionArticles {
    @Id
    private int favoriteId;
    @Id
    private int articleId;

    @Column(name = "added_date", nullable = false)
    private LocalDateTime added_date;
}

