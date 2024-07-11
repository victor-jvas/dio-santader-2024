package edu.dio.santanderdevweek.service;

import edu.dio.santanderdevweek.domain.model.CharacterModel;

import java.util.List;

public interface CharacterService {

    CharacterModel findById(Long id);
    List<CharacterModel> findAll();
    void save(CharacterModel character);
    void update(CharacterModel character);
    void delete(Long id);
}
