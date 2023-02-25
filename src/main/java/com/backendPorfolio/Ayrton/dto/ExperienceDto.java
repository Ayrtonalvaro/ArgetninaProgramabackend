package com.backendPorfolio.Ayrton.dto;

public class ExperienceDto {
    private String nameExperience;
    private String descriptionExperience;

    private String jobTitle;
    private String time;

    public ExperienceDto() {
    }

    public ExperienceDto(String nameExperience, String descriptionExperience, String jobTitle, String time) {
        this.nameExperience = nameExperience;
        this.descriptionExperience = descriptionExperience;
        this.jobTitle = jobTitle;
        this.time = time;
    }

    public String getNameExperience() {
        return nameExperience;
    }

    public void setNameExperience(String nameExperience) {
        this.nameExperience = nameExperience;
    }

    public String getDescriptionExperience() {
        return descriptionExperience;
    }

    public void setDescriptionExperience(String descriptionExperience) {
        this.descriptionExperience = descriptionExperience;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
