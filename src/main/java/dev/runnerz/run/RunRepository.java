package dev.runnerz.run;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList();


    public RunRepository(){
        runs.add(new Run(1,"first Run",LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS),200,Location.INDOR));
        runs.add(new Run(2,"sECOND Run",LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS),200,Location.INDOR));
    }

    List<Run> findAll(){
        return runs;
    }
}
