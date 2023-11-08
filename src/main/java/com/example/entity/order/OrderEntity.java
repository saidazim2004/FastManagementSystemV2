package com.example.entity.order;

import com.example.entity.BaseEntity;
import com.example.entity.user.UserEntity;
import com.example.entity.course.CourseType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity extends BaseEntity {
    private String name;
    private String moduleAmount;
    private String mentorName;
    private CourseType courseType;

    @ManyToOne(cascade = CascadeType.ALL)
    private UserEntity student;
}
