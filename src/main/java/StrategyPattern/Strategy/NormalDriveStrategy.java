package main.java.StrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("inside NormalDriveStrategy class");
    }
}
