package com.hair.ryan_hair_back.controller;

import com.hair.ryan_hair_back.model.Closure;
import com.hair.ryan_hair_back.service.ClosureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("api/closures")
public class ClosureController {
    @Autowired
    private ClosureService closureService;

    public void ClosureController(ClosureService closureService) {
        this.closureService = closureService;
    }

    @GetMapping()
    public ResponseEntity<Iterable<Closure>> getAllClosures() {
        return ResponseEntity.status(HttpStatus.OK).body(closureService.getAllClosures());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Closure> getClosureById(@PathVariable("id") final Long id) {
        Optional<Closure> closure = closureService.getClosureById(id);
        if (closure.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(closure.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping()
    public ResponseEntity<Closure> createClosure(@RequestBody Closure closure) {
        return ResponseEntity.status(HttpStatus.CREATED).body(closureService.saveOrUpdateClosure(closure));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Closure> updateClosure(@PathVariable("id") final Long id, @RequestBody Closure closure) {
        Optional<Closure> c = closureService.getClosureById(id);
        if (c.isPresent()) {
            Closure currentClosure = c.get();

            Date closureStart = closure.getClosureStart();
            if (closureStart != null) {
                currentClosure.setClosureStart(closureStart);
            }
            Date closureEnd = c.get().getClosureEnd();
            if (closureEnd != null) {
                currentClosure.setClosureEnd(closureEnd);
            }
            closureService.saveOrUpdateClosure(currentClosure);
            return ResponseEntity.status(HttpStatus.CREATED).body(currentClosure);

        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClosure(@PathVariable("id") final Long id) {
        closureService.deleteClosureById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Le creneau de fermeture exceptionnelle a été supprimé");
    }

}
