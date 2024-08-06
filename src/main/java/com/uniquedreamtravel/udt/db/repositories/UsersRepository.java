package com.uniquedreamtravel.udt.db.repositories;

import com.uniquedreamtravel.udt.db.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Long> {

    UsersEntity findByUsername(String name);
}
