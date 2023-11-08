package com.example.dto.group;

import com.example.entity.group.GroupEntity;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupCreateDto {
    @NotEmpty(message = "Course name not be null")
    private String name;
    @NotEmpty(message = "Course module not be null")
    private String module;
    private List<GroupEntity> groups;
}
