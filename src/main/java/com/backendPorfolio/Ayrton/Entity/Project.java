package com.backendPorfolio.Ayrton.Entity;

import javax.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_title")
    private String title;
    @Column(name = "link_github")
    private String linkGithub;
    @Column(name = "link_deploy")
    private String linkDeploy;
    @Column(name = "link_urlImg")
    private String urlImg;

    public Project() {
    }

    public Project(String title, String linkGithub, String linkDeploy, String urlImg) {
        this.title = title;
        this.linkGithub = linkGithub;
        this.linkDeploy = linkDeploy;
        this.urlImg = urlImg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkGithub() {
        return linkGithub;
    }

    public void setLinkGithub(String linkGithub) {
        this.linkGithub = linkGithub;
    }

    public String getLinkDeploy() {
        return linkDeploy;
    }

    public void setLinkDeploy(String linkDeploy) {
        this.linkDeploy = linkDeploy;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
