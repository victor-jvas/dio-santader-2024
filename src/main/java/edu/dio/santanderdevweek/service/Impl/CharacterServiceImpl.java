package edu.dio.santanderdevweek.service.Impl;

import edu.dio.santanderdevweek.domain.model.CharacterModel;
import edu.dio.santanderdevweek.domain.repository.CharacterRepository;
import edu.dio.santanderdevweek.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    CharacterRepository characterRepository;


    @Override
    public CharacterModel findById(Long id) {
        return characterRepository.findById(id).orElse(null);
    }

    @Override
    public List<CharacterModel> findAll() {
        return characterRepository.findAll();
    }

    @Override
    public void save(CharacterModel CharacterModel) {
        characterRepository.save(CharacterModel);
    }

    @Override
    public void update(CharacterModel CharacterModel) {
       characterRepository.save(CharacterModel);
    }

    @Override
    public void delete(Long id) {
        CharacterModel CharacterModel = this.findById(id);
        characterRepository.delete(CharacterModel);
    }
}
