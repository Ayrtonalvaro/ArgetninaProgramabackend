package com.backendPorfolio.Ayrton.Repository;

import com.backendPorfolio.Ayrton.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
