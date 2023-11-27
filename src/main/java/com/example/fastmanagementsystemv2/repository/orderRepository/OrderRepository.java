package com.example.fastmanagementsystemv2.repository.orderRepository;

import com.example.fastmanagementsystemv2.entity.order.OrderEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderEntity , UUID> {
    List<OrderEntity> findOrderEntitiesBy(Pageable pageable, UUID userId);
}
