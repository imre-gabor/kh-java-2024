package com.khb.hu.refactordemo;

enum Actions {
    ADD, DELETE, DELETE_FOREVER, EDIT, HIDE, RESTORE;
}

public class ContextActionsWithAltEnter {
    double cityPopulation = 0;
    CommandAction action;

    public ContextActionsWithAltEnter(double cityPopulation) {
        double lowerLimit = 0x1.2016eb678a2p43;
        double upperLimit = 987677.8;
        if (cityPopulation > lowerLimit && cityPopulation < upperLimit) {
            if (cityPopulation % 5 == 0) {
                this.cityPopulation /= 2;
            }
        }
        this.cityPopulation = cityPopulation;
    }
}