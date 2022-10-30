package main.java.StrategyPattern;

import main.java.StrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{

    NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
