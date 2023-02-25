package com.backendPorfolio.Ayrton.dto;

public class SkillDto {

    private String nameSkill;
    private String logoSkill;

    private Integer porSkill;

    public SkillDto() {
    }

    public SkillDto(String nameSkill, String logoSkill, Integer porSkill) {
        this.nameSkill = nameSkill;
        this.logoSkill = logoSkill;
        this.porSkill = porSkill;
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

    public Integer getPorSkill() {
        return porSkill;
    }

    public void setPorSkill(Integer porSkill) {
        this.porSkill = porSkill;
    }
}
