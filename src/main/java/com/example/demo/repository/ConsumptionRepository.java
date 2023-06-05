package com.example.demo.repository;

import com.example.demo.entity.Consumption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumptionRepository  extends JpaRepository<Consumption, Long> {

}
