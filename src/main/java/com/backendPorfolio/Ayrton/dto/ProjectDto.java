package com.backendPorfolio.Ayrton.dto;

public class ProjectDto {

    private String title;
    private String linkGithub;
    private String linkDeploy;
    private String urlImg;

    public ProjectDto(String title, String linkGithub, String linkDeploy, String urlImg) {
        this.title = title;
        this.linkGithub = linkGithub;
        this.linkDeploy = linkDeploy;
        this.urlImg = urlImg;
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
