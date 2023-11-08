package com.example.entity.lesson;

import com.example.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "lessons")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LessonEntity extends BaseEntity {
    private String name;
    private double price;
    private String lessonDuration;

}
