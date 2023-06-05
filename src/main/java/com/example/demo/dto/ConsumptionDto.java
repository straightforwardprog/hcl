package com.example.demo.dto;

import lombok.Data;

@Data
public class ConsumptionDto {
    private long id;
    private String statDate;
    private String endDate;
    private long kwh;
}
