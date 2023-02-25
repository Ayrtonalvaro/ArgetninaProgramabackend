package com.backendPorfolio.Ayrton.Controller;


import com.backendPorfolio.Ayrton.Entity.Project;
import com.backendPorfolio.Ayrton.Services.ProjectService;

import com.backendPorfolio.Ayrton.dto.ProjectDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = "*")
public class ProjectController {

    private final ProjectService projectService;


    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Project>> getProjects() {
        List<Project> projects = projectService.findProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Project> addProject(@RequestBody ProjectDto projectDto){
        Project newProject = new Project(projectDto.getTitle(),projectDto.getLinkGithub(),projectDto.getLinkDeploy(),projectDto.getUrlImg());
        projectService.addProject(newProject);
        return new ResponseEntity<>(newProject, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> editProject(@PathVariable("id") Long id, @RequestBody ProjectDto projectDto){
        Project project = projectService.findById(id).get();

        project.setTitle(projectDto.getTitle());
        project.setLinkGithub(projectDto.getLinkGithub());
        project.setLinkDeploy(projectDto.getLinkDeploy());
        project.setUrlImg(projectDto.getUrlImg());
        projectService.save(project);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id) {
        projectService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
