package com.backendPorfolio.Ayrton.Services;

import com.backendPorfolio.Ayrton.Entity.Experience;

import com.backendPorfolio.Ayrton.Repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExperienceService {
    private final ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public Experience addExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    public List<Experience> getExperiences () {
        return experienceRepository.findAll();
    }

    public Experience editExperience (Experience experience) {
        return experienceRepository.save(experience);
    }

    public void deleteExperience (Long id) {
        experienceRepository.deleteById(id);
    }

    public Optional<Experience> findById(Long id) {
        return experienceRepository.findById(id);
    }

    public Experience save(Experience experience) {
        return experienceRepository.save(experience);
    }
}
