package com.tws.refactoring;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DriverTest {
    private static Driver driver;

    @BeforeEach
    public void init() {
        driver = new Driver();
    }


    @Test
    void should_return_true_when_check_age_given_age_over_18() {
        //given
//        Police police = new Police();
//        Driver driver = new Driver();
        driver.setAge(20);

        //when
        boolean result = driver.isLegaDriver();

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void should_return_false_when_check_age_given_less_than_18() {
        //given
//        Police police = new Police();
//        Driver driver = new Driver(16);
        driver.setAge(16);

        // when
        boolean result = driver.isLegaDriver();

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void should_return_true_when_check_age_given_age_18() {
        //given
//        Police police = new Police();
//        Driver driver = new Driver(18);
        driver.setAge(18);
        // when
        boolean result = driver.isLegaDriver();

        //then
        Assertions.assertTrue(result);
    }

}