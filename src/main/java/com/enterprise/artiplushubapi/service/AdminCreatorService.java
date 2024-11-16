package com.enterprise.artiplushubapi.service;

import com.enterprise.artiplushubapi.model.entity.Creators;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
public interface AdminCreatorService {
    List<Creators> getAll();
    Page<Creators> paginate(Pageable pageable);
    Creators findById(int id);
    Creators create(Creators creator);
    Creators update(int id, Creators updateCreator);
    void delete(int id);
}
