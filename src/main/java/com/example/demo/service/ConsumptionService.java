package com.example.demo.service;

import com.example.demo.dto.ConsumptionDto;
import com.example.demo.entity.Consumption;
import com.example.demo.mapper.ConsumptionMapper;
import com.example.demo.repository.ConsumptionRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumptionService implements IConsumptionService{
    private ConsumptionMapper mapper
            = Mappers.getMapper(ConsumptionMapper.class);
    private final ConsumptionRepository consumptionRepository;
    public ConsumptionService(ConsumptionRepository consumptionRepository){
        this.consumptionRepository = consumptionRepository;
    }
    @Override
    public List<ConsumptionDto> getConsumption(Long id) {
        return mapper.toDtos(consumptionRepository.findAll());
    }
}
