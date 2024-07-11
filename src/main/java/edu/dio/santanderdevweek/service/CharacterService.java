package edu.dio.santanderdevweek.service;

import java.util.List;

public interface CharacterService {

    Character findById(Long id);
    List<Character> findAll();
    Character save(Character character);
    Character update(Character character);
    Character delete(Long id);
}
