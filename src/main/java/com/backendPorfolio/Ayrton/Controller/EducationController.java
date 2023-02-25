package com.backendPorfolio.Ayrton.Controller;


import com.backendPorfolio.Ayrton.Entity.Education;
import com.backendPorfolio.Ayrton.Services.EducationService;
import com.backendPorfolio.Ayrton.dto.EducationDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
@CrossOrigin(origins = "*")
public class EducationController {

    private final EducationService educationService;


    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getEducations(){
        List<Education> educations = educationService.findEducations();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<Education> addEducation(@RequestBody EducationDto educationDto) {
        Education newEducation = new Education (educationDto.getNameEducacation(),educationDto.getDescriptionEducaction(),educationDto.getTitleEducation(),educationDto.getTime());
        educationService.addEducation(newEducation);
        return new ResponseEntity<>(newEducation,HttpStatus.OK);
    }




     @PutMapping("/update/{id}")
     public ResponseEntity<?> editEducation (@PathVariable("id") Long id, @RequestBody EducationDto educationDto){
        Education education = educationService.findById(id).get();

        education.setNameEducacation(educationDto.getNameEducacation());
        education.setTitleEducation(educationDto.getTitleEducation());
        education.setDescriptionEducaction(educationDto.getDescriptionEducaction());
        education.setTime(educationDto.getTime());
        educationService.save(education);
        return new ResponseEntity<>("Educacion actualizada", HttpStatus.OK);
     }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id) {
        educationService.deleteEducation(id);
        return new ResponseEntity<>("Educacion borrada correcatamente",HttpStatus.OK);
    }

}
