package com.backendPorfolio.Ayrton.Controller;

import com.backendPorfolio.Ayrton.Entity.Experience;
import com.backendPorfolio.Ayrton.Services.ExperienceService;
import com.backendPorfolio.Ayrton.dto.ExperienceDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
@CrossOrigin(origins = "*")
public class ExperienceController {

    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getExperiences(){
        List<Experience> experiences = experienceService.getExperiences();
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<Experience> addExperience(@RequestBody Experience experience) {
        Experience newExperience = experienceService.addExperience(experience);
        return new ResponseEntity<>(newExperience, HttpStatus.OK);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<?> editEducation (@PathVariable("id") Long id, @RequestBody ExperienceDto experienceDto){
        Experience experience = experienceService.findById(id).get();
        experience.setNameExperience(experienceDto.getNameExperience());
        experience.setJobTitle(experienceDto.getJobTitle());
        experience.setDescriptionExperience(experienceDto.getDescriptionExperience());
        experience.setTime(experienceDto.getTime());
        var experienceUpdated = experienceService.save(experience);
        return new ResponseEntity<>(experienceUpdated, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long id) {
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
