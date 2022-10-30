package main.java.StrategyPattern;

import main.java.StrategyPattern.Strategy.DriveStrategy;
import main.java.StrategyPattern.Strategy.SportsDriveStrategy;

public class sportsVehicle extends Vehicle{

    /*sportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }*/

    sportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
