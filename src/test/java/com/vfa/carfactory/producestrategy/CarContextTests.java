package com.vfa.carfactory.producestrategy;

import com.vfa.carfactory.exception.error.NullPointerException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static com.vfa.carfactory.common.constraint.ProduceMessageConstraint.*;

@RunWith(MockitoJUnitRunner.class)
public class CarContextTests {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getCarContext_shouldBeSuccess_Cabrio_Context() {
        CarContext carContext = new CarContext(new Cabrio());
        Assert.assertEquals(carContext.produceCar(), CABRIO_PRODUCE);
    }

    @Test
    public void getCarContext_shouldBeSuccess_Hatchback_Context() {
        CarContext carContext = new CarContext(new Hatchback());
        Assert.assertEquals(carContext.produceCar(), HATCHBACK_PRODUCE);
    }

    @Test
    public void getCarContext_shouldBeSuccess_Sedan_Context() {
        CarContext carContext = new CarContext(new Sedan());
        Assert.assertEquals(carContext.produceCar(), SEDAN_PRODUCE);
    }

    @Test
    public void getCarContext_shouldBeError_CarTypeIsNull() {
        expectedException.expect(NullPointerException.class);
        CarContext carContext = new CarContext(null);
        carContext.produceCar();
    }
}
