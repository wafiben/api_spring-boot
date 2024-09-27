package dev.runnerz.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RunController {
    private final  RunRepository runRepository;


    public RunController(RunRepository runRepository1){
        this.runRepository = runRepository1;
    }

    @GetMapping("/api/runs")
    List<Run> findAll() {
        return this.runRepository.findAll();
    }
}
