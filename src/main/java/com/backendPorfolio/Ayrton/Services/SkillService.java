package com.backendPorfolio.Ayrton.Services;

import com.backendPorfolio.Ayrton.Entity.Skill;
import com.backendPorfolio.Ayrton.Repository.SkillRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill addSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public List<Skill> getSkills(){
        return skillRepository.findAll();
    }

    public void save(Skill skill){
         skillRepository.save(skill);
    }

    public Optional<Skill> findById(Long id) {
        return skillRepository.findById(id);
    }

    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

}
