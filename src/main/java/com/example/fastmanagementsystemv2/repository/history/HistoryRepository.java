package com.example.fastmanagementsystemv2.repository.history;

import com.example.fastmanagementsystemv2.entity.history.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HistoryRepository extends JpaRepository<HistoryEntity , UUID> {
}
