package edu.dio.santanderdevweek.controller;

import edu.dio.santanderdevweek.domain.model.CharacterModel;
import edu.dio.santanderdevweek.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    CharacterService characterService;


    @GetMapping("/{id}")
    public ResponseEntity<CharacterModel> findById(@PathVariable Long id) {
        return ResponseEntity.ok(characterService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<CharacterModel>> findAll() {
        return ResponseEntity.ok(characterService.findAll());
    }

    @PostMapping
    public ResponseEntity<CharacterModel> save(@RequestBody CharacterModel character) {
        characterService.save(character);
        return ResponseEntity.ok(character);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Character> delete(@PathVariable Long id) {
        characterService.delete(id);
        return ResponseEntity.ok().build();
    }


}
