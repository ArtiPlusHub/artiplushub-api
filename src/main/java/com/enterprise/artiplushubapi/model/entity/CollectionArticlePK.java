package com.enterprise.artiplushubapi.model.entity;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class CollectionArticlePK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_CollectionArticle_article"))
    private Articles articles;

    @ManyToOne
    @JoinColumn(name = "favorites_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_CollectionArticle_favorites"))
    private Favorites favorites;
}
