package com.enterprise.artiplushubapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "purchases")
public class Purchases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private Float total;

    @Column(name = "user_id", nullable = false)
    private Integer user_Id;

    @OneToMany
    @JoinColumn(name = "donation_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_purchase_donations"))
    private Donations donation_id;

    @Column(name = "created_at", nullable = false)
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;

    @ManyToOne
    @JoinColumn(name = "reader_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_purchase_readers"))
    private Readers reader;
}

