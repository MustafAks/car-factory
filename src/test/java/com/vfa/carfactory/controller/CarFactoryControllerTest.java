package com.vfa.carfactory.controller;


import com.vfa.carfactory.service.CarFactoryService;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import static com.vfa.carfactory.common.constraint.CarTypeConstraint.*;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class CarFactoryControllerTest {

    public static final String RESULT = "result";

    @Mock
    private CarFactoryService carFactoryService;

    @InjectMocks
    private CarFactoryController carFactoryController;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void getCabrioProduce_shouldBeSuccess() {
        doReturn(RESULT).when(carFactoryService).get(CABRIO);
        ResponseEntity<String> response = carFactoryController.get(CABRIO);
        Assert.assertEquals(RESULT, response.getBody());
    }

    @Test
    public void getHatchbackProduce_shouldBeSuccess() {
        doReturn(RESULT).when(carFactoryService).get(HATCHBACK);
        ResponseEntity<String> response = carFactoryController.get(HATCHBACK);
        Assert.assertEquals(RESULT, response.getBody());
    }

    @Test
    public void getSedanProduce_shouldBeSuccess() {
        doReturn(RESULT).when(carFactoryService).get(SEDAN);
        ResponseEntity<String> response = carFactoryController.get(SEDAN);
        Assert.assertEquals(RESULT, response.getBody());
    }


}
