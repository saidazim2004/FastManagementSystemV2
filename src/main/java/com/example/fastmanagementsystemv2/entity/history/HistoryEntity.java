package com.example.fastmanagementsystemv2.entity.history;

import com.example.fastmanagementsystemv2.entity.BaseEntity;
import com.example.fastmanagementsystemv2.entity.user.UserEntity;
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
