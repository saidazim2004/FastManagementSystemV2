package com.example.fastmanagementsystemv2.repository.card;

import com.example.fastmanagementsystemv2.entity.card.CardEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CardRepository extends JpaRepository<CardEntity , UUID> {
    List<CardEntity> findOrderEntitiesByOwnerId(Pageable pageable, UUID userId);

}

