package com.vfa.carfactory.controller;


import com.vfa.carfactory.service.CarFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carFactory")
public class CarFactoryController {

    private final CarFactoryService carFactoryService;

    @Autowired
    public CarFactoryController(CarFactoryService carFactoryService) {
        this.carFactoryService = carFactoryService;
    }

    @GetMapping("/")
    public ResponseEntity<String> get(String carType) {
        return new ResponseEntity(carFactoryService.get(carType), HttpStatus.OK);
    }
}
