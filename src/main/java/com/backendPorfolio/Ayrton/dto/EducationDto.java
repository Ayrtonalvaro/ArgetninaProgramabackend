package com.backendPorfolio.Ayrton.dto;



public class EducationDto {

    private String nameEducacation;
    private String descriptionEducaction;
    private String titleEducation;
    private String time;

    public EducationDto() {
    }

    public EducationDto(String nameEducacation, String descriptionEducaction, String titleEducation, String time) {
        this.nameEducacation = nameEducacation;
        this.descriptionEducaction = descriptionEducaction;
        this.titleEducation = titleEducation;
        this.time = time;
    }

    public String getNameEducacation() {
        return nameEducacation;
    }

    public void setNameEducacation(String nameEducacation) {
        this.nameEducacation = nameEducacation;
    }

    public String getDescriptionEducaction() {
        return descriptionEducaction;
    }

    public void setDescriptionEducaction(String descriptionEducaction) {
        this.descriptionEducaction = descriptionEducaction;
    }

    public String getTitleEducation() {
        return titleEducation;
    }

    public void setTitleEducation(String titleEducation) {
        this.titleEducation = titleEducation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
