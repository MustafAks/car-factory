package com.vfa.carfactory.service;

import com.vfa.carfactory.exception.error.InvalidCarTypeException;
import com.vfa.carfactory.exception.error.NullPointerException;
import com.vfa.carfactory.utils.Utils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static com.vfa.carfactory.common.constraint.CarTypeConstraint.*;
import static com.vfa.carfactory.common.constraint.ProduceMessageConstraint.*;

@RunWith(MockitoJUnitRunner.class)
public class CarFactoryServiceTest {

    @InjectMocks
    private CarFactoryService carFactoryService;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void get_shouldBeSuccess_Cabrio_ProduceMessage() {
        String result = carFactoryService.get(CABRIO);
        Assert.assertEquals(result, CABRIO_PRODUCE);
    }

    @Test
    public void get_shouldBeSuccess_Sedan_ProduceMessage() {
        String result = carFactoryService.get(SEDAN);
        Assert.assertEquals(result, SEDAN_PRODUCE);
    }

    @Test
    public void get_shouldBeSuccess_Hatchback_ProduceMessage() {
        String result = carFactoryService.get(HATCHBACK);
        Assert.assertEquals(result, HATCHBACK_PRODUCE);
    }

    @Test
    public void get_shouldBeError_CarIsNull() {
        expectedException.expect(NullPointerException.class);
        carFactoryService.get(null);
    }

    @Test
    public void getCarProduce_shouldBeError_MissmatchType() {
        expectedException.expect(InvalidCarTypeException.class);
        carFactoryService.get(Utils.generateRandomString());
    }
}
