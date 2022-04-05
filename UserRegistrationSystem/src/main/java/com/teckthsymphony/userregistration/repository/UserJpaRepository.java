package com.teckthsymphony.userregistration.repository;

import com.teckthsymphony.userregistration.userDTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserDTO, Long> {

    UserDTO findByName(String name);
}
