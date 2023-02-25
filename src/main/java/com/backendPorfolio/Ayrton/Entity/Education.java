package com.backendPorfolio.Ayrton.Entity;


import javax.persistence.*;

@Entity
@Table(name= "educations")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_education")
    private String nameEducacation;
    @Column(name = "description_education")
    private String descriptionEducaction;

    @Column(name = "title_education")
    private String titleEducation;
    @Column(name = "time")
    private String time;


    public Education() {
    }

    public Education(String nameEducacation, String descriptionEducaction, String titleEducation, String time) {
        this.nameEducacation = nameEducacation;
        this.descriptionEducaction = descriptionEducaction;
        this.time = time;
        this.titleEducation = titleEducation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitleEducation() {
        return titleEducation;
    }

    public void setTitleEducation(String titleEducation) {
        this.titleEducation = titleEducation;
    }
}
