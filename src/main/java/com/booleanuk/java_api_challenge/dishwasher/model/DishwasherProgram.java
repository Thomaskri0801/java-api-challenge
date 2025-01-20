package com.booleanuk.java_api_challenge.dishwasher.model;

public class DishwasherProgram {
    private String program;
    private double waterConsumption;
    private double electicConsumption;
    private String runTime;

    public DishwasherProgram(String program, double waterConsumption, double electicConsumption, String runTime) {
        this.program = program;
        this.waterConsumption = waterConsumption;
        this.electicConsumption = electicConsumption;
        this.runTime = runTime;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public double getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption(double waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    public double getElecticConsumption() {
        return electicConsumption;
    }

    public void setElecticConsumption(double electicConsumption) {
        this.electicConsumption = electicConsumption;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }
}
