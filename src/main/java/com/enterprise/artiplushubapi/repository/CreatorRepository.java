package com.enterprise.artiplushubapi.repository;

import com.enterprise.artiplushubapi.model.entity.Creators;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creators, Integer> {

}
