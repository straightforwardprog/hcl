package com.example.demo.service;

import com.example.demo.dto.ConsumptionDto;
import com.example.demo.entity.Consumption;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IConsumptionService {
   List<ConsumptionDto> getConsumption(Long id);
}
