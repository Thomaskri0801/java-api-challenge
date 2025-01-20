package com.booleanuk.java_api_challenge.dishwasher.controller;

import com.booleanuk.java_api_challenge.dishwasher.model.DishwasherProgram;
import com.booleanuk.java_api_challenge.dishwasher.model.DishwasherProgramRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dishwasher")
public class DishwasherProgramController {

    private DishwasherProgramRepository dishwasherRepository;

    public DishwasherProgramController() {
        dishwasherRepository = new DishwasherProgramRepository();
    }

    @GetMapping
    public List<DishwasherProgram> getAllPrograms() {
        return dishwasherRepository.getAllPrograms();
    }

    @PostMapping("program/{program}")
    public DishwasherProgram startProgram(@RequestBody DishwasherProgram program) {
        return dishwasherRepository.startProgram(program);
    }
}
