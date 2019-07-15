package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PoliceTest {

    @Test
    void should_return_true_when_check_age_given_age_20(){
        //given
        Police police = new Police();
        Driver driver = new Driver(20);

        //when
        boolean result = police.checkDriverAge(driver);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void should_return_false_when_check_age_given_age_16(){
        //given
        Police police = new Police();
        Driver driver = new Driver(16);

        // when
        boolean result = police.checkDriverAge(driver);

        //then
        Assertions.assertFalse(result);
    }

}