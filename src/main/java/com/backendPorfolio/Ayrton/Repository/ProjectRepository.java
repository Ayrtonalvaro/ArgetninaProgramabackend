package com.backendPorfolio.Ayrton.Repository;

import com.backendPorfolio.Ayrton.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
