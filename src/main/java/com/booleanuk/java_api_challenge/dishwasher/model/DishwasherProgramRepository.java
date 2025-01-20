package com.booleanuk.java_api_challenge.dishwasher.model;

import java.util.ArrayList;
import java.util.List;

public class DishwasherProgramRepository {

    private DishwasherProgram activeProgram;
    private List<DishwasherProgram> programs;
    private List<DishwasherProgram> lastPrograms;

    public DishwasherProgramRepository() {
        this.programs = new ArrayList<>() {{
            add(new DishwasherProgram("Intensive 70", 13.5, 1.35, "2.5 hours"));
            add(new DishwasherProgram("Eco 50", 9.0, 0.65, "1 hours"));
            add(new DishwasherProgram("Half Load", 10.5, 1.10, "40 mins"));
            add(new DishwasherProgram("Clean Cycle", 14, 1.45, "55 mins"));
        }};
        this.lastPrograms = new ArrayList<>();
    }

    public List<DishwasherProgram> getAllPrograms() {
        return programs;
    }

    public DishwasherProgram startProgram(DishwasherProgram program) {
        for (DishwasherProgram tempProgram : programs) {
            if (tempProgram.getProgram().equals(program.getProgram())) {
                this.activeProgram = program;
                lastPrograms.add(program);
            }
        }
        return program;
    }
}