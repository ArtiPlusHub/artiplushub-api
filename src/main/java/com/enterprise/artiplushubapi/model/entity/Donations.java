package com.enterprise.artiplushubapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "donations")
public class Donations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "amount")
    private Float amount;

    @Column(name = "created_at", nullable = false)
    private String created_at;

    @Column(name = "user_id", nullable = false)
    private Integer user_Id;
}

