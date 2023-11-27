package com.example.fastmanagementsystemv2.repository.user;

import com.example.fastmanagementsystemv2.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity , UUID> {
    Optional<UserEntity> findUserEntityByPhoneNumber(String phoneNumber);
}
