package com.enterprise.artiplushubapi.service.impl;

import com.enterprise.artiplushubapi.model.entity.Creators;
import com.enterprise.artiplushubapi.repository.CreatorRepository;
import com.enterprise.artiplushubapi.service.AdminCreatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminCreatorServiceImpl implements AdminCreatorService{
    private final CreatorRepository creatorRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Creators> getAll() {
        return creatorRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Page<Creators> paginate(Pageable pageable) {
        return creatorRepository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    @Override
    public Creators findById(int id) {
        return creatorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Creator not found"));
    }

    @Transactional
    @Override
    public Creators create(Creators creator) {
        creator.setCreated_at(LocalDateTime.now());
        return creatorRepository.save(creator);
    }

    @Transactional
    @Override
    public Creators update(int id, Creators updateCreator) {
        Creators creatorsFromDb = findById(id);
        creatorsFromDb.setFirstName(updateCreator.getFirstName());
        creatorsFromDb.setLastName(updateCreator.getLastName());
        creatorsFromDb.setBiography(updateCreator.getBiography());
        creatorsFromDb.setUpdated_at(LocalDateTime.now());
        return creatorRepository.save(creatorsFromDb);
    }

    @Transactional
    @Override
    public void delete(int id) {
        Creators creator = findById(id);
        creatorRepository.delete(creator);
    }
}
