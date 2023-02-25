package com.backendPorfolio.Ayrton.Security.Repository;


import com.backendPorfolio.Ayrton.Security.Entity.Rol;
import com.backendPorfolio.Ayrton.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
