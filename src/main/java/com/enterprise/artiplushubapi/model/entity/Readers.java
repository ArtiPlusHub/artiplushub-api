package com.enterprise.artiplushubapi.model.entity;
import com.enterprise.artiplushubapi.model.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "readers")
public class Readers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Column(name = "created_at", nullable = false)
    private String created_at;

    @Column(name = "updated_at")
    private String updated_at;

    @Column(name = "user_id", nullable = false)
    private Integer user_id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;


}
