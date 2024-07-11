package edu.dio.santanderdevweek.domain.model;

import jakarta.persistence.Entity;

@Entity
public class ActiveSkill extends Skill {

    String Color;
    int cooldown;


}
