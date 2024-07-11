package edu.dio.santanderdevweek.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int level;
    private String rarity;
    private String type;

    @OneToMany
    List<PassiveSkill> passiveSkillList;
    @OneToMany
    List<ActiveSkill> activeSkillList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<PassiveSkill> getPassiveSkillList() {
        return passiveSkillList;
    }

    public void setPassiveSkillList(List<PassiveSkill> passiveSkillList) {
        this.passiveSkillList = passiveSkillList;
    }

    public List<ActiveSkill> getActiveSkillList() {
        return activeSkillList;
    }

    public void setActiveSkillList(List<ActiveSkill> activeSkillList) {
        this.activeSkillList = activeSkillList;
    }
}
