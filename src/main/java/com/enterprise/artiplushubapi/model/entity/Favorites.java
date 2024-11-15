package com.enterprise.artiplushubapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "favorites")
public class Favorites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "reader_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_purchase_readers"))
    private Readers reader;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<CollectionArticles> collectionArticle;
}

