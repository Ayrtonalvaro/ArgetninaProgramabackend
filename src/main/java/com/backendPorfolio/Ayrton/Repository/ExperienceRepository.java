package com.backendPorfolio.Ayrton.Repository;

import com.backendPorfolio.Ayrton.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
