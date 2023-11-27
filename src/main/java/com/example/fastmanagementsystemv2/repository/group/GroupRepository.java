package com.example.fastmanagementsystemv2.repository.group;

import com.example.fastmanagementsystemv2.entity.group.GroupEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GroupRepository extends JpaRepository<GroupEntity , UUID> {
    List<GroupEntity> findGroupEntitiesBy(Pageable pageable, UUID userId);
}
