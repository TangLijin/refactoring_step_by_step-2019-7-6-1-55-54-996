package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PoliceTest {
    private static Police police;

    @BeforeAll
    public void init(){
        police = new Police();
    }


    @Test
    void should_return_true_when_check_age_given_age_over_18(){
        //given
//        Police police = new Police();
        Driver driver = new Driver(20);

        //when
        boolean result = police.checkDriverAge(driver);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void should_return_false_when_check_age_given_less_than_18(){
        //given
//        Police police = new Police();
        Driver driver = new Driver(16);

        // when
        boolean result = police.checkDriverAge(driver);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void should_return_true_when_check_age_given_age_18(){
        //given
//        Police police = new Police();
        Driver driver = new Driver(18);

        // when
        boolean result = police.checkDriverAge(driver);

        //then
        Assertions.assertTrue(result);
    }

}