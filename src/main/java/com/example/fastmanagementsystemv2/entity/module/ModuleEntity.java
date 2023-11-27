package com.example.fastmanagementsystemv2.entity.module;

import com.example.fastmanagementsystemv2.entity.BaseEntity;
import com.example.fastmanagementsystemv2.entity.group.GroupEntity;
import com.example.fastmanagementsystemv2.entity.lesson.LessonEntity;
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
