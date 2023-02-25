package com.backendPorfolio.Ayrton.Security.Service;


import com.backendPorfolio.Ayrton.Security.Entity.Rol;
import com.backendPorfolio.Ayrton.Security.Enums.RolNombre;
import com.backendPorfolio.Ayrton.Security.Repository.iRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
