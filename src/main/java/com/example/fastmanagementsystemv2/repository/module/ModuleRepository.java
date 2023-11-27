package com.example.fastmanagementsystemv2.repository.module;

import com.example.fastmanagementsystemv2.entity.module.ModuleEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ModuleRepository extends JpaRepository<ModuleEntity , UUID> {
    List<ModuleEntity> findModuleEntitiesBy(Pageable pageable , UUID userId);
}
