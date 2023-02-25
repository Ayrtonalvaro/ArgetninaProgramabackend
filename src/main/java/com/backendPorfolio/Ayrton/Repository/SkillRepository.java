package com.backendPorfolio.Ayrton.Repository;

import com.backendPorfolio.Ayrton.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
