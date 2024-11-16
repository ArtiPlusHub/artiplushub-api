package com.enterprise.artiplushubapi.api;

import com.enterprise.artiplushubapi.model.entity.Creators;
import com.enterprise.artiplushubapi.service.AdminCreatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/creators")
@RequiredArgsConstructor
public class AdminCreatorController {
    private final AdminCreatorService adminCreatorService;

    @GetMapping
    public ResponseEntity<List<Creators>> listCreators() {
        return ResponseEntity.ok(adminCreatorService.getAll());
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Creators>> paginateCreators(
            @PageableDefault(size=5, sort="firstname") Pageable pageable){
        Page<Creators> Creators = adminCreatorService.paginate(pageable);
        return new ResponseEntity<Page<Creators>>(Creators, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Creators> getCreatorById(@PathVariable("id") Integer id) {
        Creators Creator = adminCreatorService.findById(id);
        return new  ResponseEntity<Creators>(Creator, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Creators> createCreator(@RequestBody Creators Creators) {
        Creators newCreator = adminCreatorService.create(Creators);
        return new ResponseEntity<>(newCreator, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Creators> updateCreator(@PathVariable("id") Integer id, @RequestBody Creators Creators) {
        Creators updatedCreator = adminCreatorService.update(id, Creators);
        return new ResponseEntity<>(updatedCreator, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Creators> deleteCreator(@PathVariable("id") Integer id) {
        adminCreatorService.delete(id);
        return new ResponseEntity<Creators>(HttpStatus.NO_CONTENT);
    }
    
}
