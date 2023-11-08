package com.example.entity.history;

import com.example.entity.BaseEntity;
import com.example.entity.user.UserEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity(name = "historys")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HistoryEntity extends BaseEntity {
    private String orderName;
    private Double orderPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    private UserEntity user;
}
