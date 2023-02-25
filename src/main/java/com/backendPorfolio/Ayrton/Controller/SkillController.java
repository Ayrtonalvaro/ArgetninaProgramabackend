package com.backendPorfolio.Ayrton.Controller;

import com.backendPorfolio.Ayrton.Entity.Skill;
import com.backendPorfolio.Ayrton.Services.SkillService;
import com.backendPorfolio.Ayrton.dto.SkillDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
@CrossOrigin(origins = "*")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Skill>> getSkills() {
        List<Skill> skills = skillService.getSkills();
        return  new ResponseEntity<>(skills, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<Skill> addSkill(@RequestBody SkillDto skillDto){
        Skill newSkill = new Skill(skillDto.getNameSkill(), skillDto.getLogoSkill(), skillDto.getPorSkill());
        skillService.addSkill(newSkill);
        return new ResponseEntity<>(newSkill, HttpStatus.OK);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<?> editSkill(@PathVariable("id") Long id,@RequestBody SkillDto skillDto){
        Skill skill = skillService.findById(id).get();

        skill.setNameSkill(skillDto.getNameSkill());
        skill.setLogoSkill(skillDto.getLogoSkill());
        skill.setPorSkill(skillDto.getPorSkill());
        skillService.addSkill(skill);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id){
        skillService.deleteSkill(id);
        return  new ResponseEntity<>( HttpStatus.OK);
    }
}
