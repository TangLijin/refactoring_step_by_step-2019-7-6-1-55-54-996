package com.tws.refactoring;

public class Police {

    public boolean checkDriverAge(Driver driver) {
        return driver.getAge() >= 18 ? true :false;
    }
}
