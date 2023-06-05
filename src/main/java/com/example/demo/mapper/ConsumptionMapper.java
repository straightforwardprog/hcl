package com.example.demo.mapper;

import com.example.demo.dto.ConsumptionDto;
import com.example.demo.entity.Consumption;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ConsumptionMapper {
    ConsumptionDto toDto(Consumption consumption);
    List<ConsumptionDto> toDtos(List<Consumption> consumption);

    Consumption toEntity(ConsumptionDto consumptionDto);
}
