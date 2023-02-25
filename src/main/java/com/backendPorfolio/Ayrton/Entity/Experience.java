package com.backendPorfolio.Ayrton.Entity;



import javax.persistence.*;

@Entity
@Table(name = "experiences")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_experience")
    private String nameExperience;
    @Column (name = "description_experience")
    private String descriptionExperience;
    @Column (name = "job_title")
    private String jobTitle;
    @Column(name = "time")
    private String time;

    public Experience() {
    }

    public Experience(String nameExperience, String descriptionExperience, String time, String jobTitle) {
        this.nameExperience = nameExperience;
        this.descriptionExperience = descriptionExperience;
        this.jobTitle = jobTitle;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
