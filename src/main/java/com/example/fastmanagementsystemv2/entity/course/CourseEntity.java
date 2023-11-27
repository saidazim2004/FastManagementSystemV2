package com.example.fastmanagementsystemv2.entity.course;

import com.example.fastmanagementsystemv2.entity.BaseEntity;
import com.example.fastmanagementsystemv2.entity.group.GroupEntity;
import com.example.fastmanagementsystemv2.entity.module.ModuleEntity;
import com.example.fastmanagementsystemv2.entity.user.UserEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity(name = "courses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseEntity extends BaseEntity {

    private String name;
    private String module;
    private CourseType courseType;

    @OneToMany(cascade = CascadeType.ALL)
    private List<GroupEntity> groups;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ModuleEntity> modules;

    @ManyToOne(cascade = CascadeType.ALL)
    private UserEntity admin;
}
