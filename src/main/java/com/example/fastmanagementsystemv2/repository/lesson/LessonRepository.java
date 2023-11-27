package com.example.fastmanagementsystemv2.repository.lesson;

import com.example.fastmanagementsystemv2.entity.lesson.LessonEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LessonRepository extends JpaRepository<LessonEntity , UUID> {
    List<LessonEntity> findLessonEntitiesBy(Pageable pageable, UUID userId);
}
