package com.machadocode.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machadocode.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
