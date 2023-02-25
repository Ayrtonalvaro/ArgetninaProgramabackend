package com.backendPorfolio.Ayrton.Repository;

import com.backendPorfolio.Ayrton.Entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {
    Optional<UserLogin> findByEmail(String email);
}
