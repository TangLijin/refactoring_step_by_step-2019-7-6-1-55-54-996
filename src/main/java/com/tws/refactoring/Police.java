package com.tws.refactoring;

//final int legalDriverAge = 18;

public class Police {
    final int legalDriverAge = 18;
    public boolean checkDriverAge(Driver driver) {
        return driver.getAge() >= legalDriverAge ? true :false;
    }
}
