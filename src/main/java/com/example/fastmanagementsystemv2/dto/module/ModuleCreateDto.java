package com.example.fastmanagementsystemv2.dto.module;

import com.example.fastmanagementsystemv2.entity.lesson.LessonEntity;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModuleCreateDto {
    @NotEmpty(message = "ModuleName not be empty")
    private String  moduleName;

    private List<LessonEntity> lessons;
}
