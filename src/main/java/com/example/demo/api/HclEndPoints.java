package com.example.demo.api;

import com.example.demo.dto.ConsumptionDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.Consumption;
import com.example.demo.entity.User;
import com.example.demo.service.IConsumptionService;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HclEndPoints {
     @Autowired
     private IConsumptionService consumptionService;
     @Autowired
     private IUserService userService;

     @PostMapping(value = "/register")
     public ResponseEntity<UserDto> register(@RequestBody UserDto userDto){
         return ResponseEntity.ok(userService.register(userDto));
     }

     @GetMapping(value = "/getConsumption")
     public ResponseEntity<List<ConsumptionDto>> getConsumptions(@RequestParam(name = "id") Long id){
          return ResponseEntity.ok(consumptionService.getConsumption(id));
     }


}
