package com.backendPorfolio.Ayrton.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameSkill ;
    private String logoSkill;

    private Integer porSkill;
    public Skill() {
    }

    public Skill(String nameSkill, String logoSkill, Integer porSkill) {
        this.nameSkill = nameSkill;
        this.logoSkill = logoSkill;
        this.porSkill = porSkill;
    }

    public Integer getPorSkill() {
        return porSkill;
    }

    public void setPorSkill(Integer porSkill) {
        this.porSkill = porSkill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public String getLogoSkill() {
        return logoSkill;
    }

    public void setLogoSkill(String logoSkill) {
        this.logoSkill = logoSkill;
    }
}
