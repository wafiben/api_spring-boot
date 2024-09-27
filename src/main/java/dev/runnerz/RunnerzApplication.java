package dev.runnerz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class RunnerzApplication {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(RunnerzApplication.class);
    private static final LocalDateTime s = LocalDateTime.now();

    public static void main(String[] args) {
        SpringApplication.run(RunnerzApplication.class, args);
        logger.info("hello from the other side of the world");
        System.out.println(s);
    }


//	@Bean
//	CommandLinerRunner runner(){
//		return args ->{
//			Run run =new Run(1,"first Run",LocalDateTime.now(),LocalDateTime.now().plus(1, ChronoUnit.HOURS),200,Location.INDOR);
//		}



}
