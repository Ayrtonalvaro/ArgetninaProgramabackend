package com.backendPorfolio.Ayrton.Services;

import com.backendPorfolio.Ayrton.Entity.Project;
import com.backendPorfolio.Ayrton.Repository.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> findProjects() {
        return projectRepository.findAll();
    }

    public Project editProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject (Long id) {
        projectRepository.deleteById(id);
    }

    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    public void save(Project project) {
        projectRepository.save(project);
    }




}
