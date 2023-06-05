package com.example.demo.service;

import com.example.demo.dto.ConsumptionDto;
import com.example.demo.entity.Consumption;
import com.example.demo.repository.ConsumptionRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ConsumptionServiceTest {
    @Mock
    private ConsumptionRepository consumptionRepository;
    @InjectMocks
    private ConsumptionService consumptionService;
    
    void getConsumption(){
        List<Consumption> consumptions = new ArrayList<>();
        consumptions.add(new Consumption());
        Mockito.when(consumptionRepository.findAll()).thenReturn(consumptions);
        List<ConsumptionDto> consumptionDtos = consumptionService.getConsumption(1L);
        Mockito.verify(consumptionRepository.findAll(),Mockito.atLeastOnce());
        assertTrue(!consumptionDtos.isEmpty(), "Database error");
    }

}