package edu.dio.santanderdevweek.domain.repository;

import edu.dio.santanderdevweek.domain.model.CharacterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterModel, Long> {
}
