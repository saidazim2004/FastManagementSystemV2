package com.example.entity.module;

import com.example.entity.BaseEntity;
import com.example.entity.group.GroupEntity;
import com.example.entity.lesson.LessonEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
@Entity(name = "modules")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ModuleEntity extends BaseEntity {
    private String moduleName;

    @ManyToOne(cascade = CascadeType.ALL)
    private GroupEntity group;

    @OneToMany(cascade = CascadeType.ALL)
    private List<LessonEntity> lessonEntities;
}
