package com.backendPorfolio.Ayrton.Repository;

import com.backendPorfolio.Ayrton.Entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdacuationRepository extends JpaRepository<Education, Long > {
}
