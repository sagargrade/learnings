package edu.mylearning.spring.core.config;

import edu.mylearning.spring.core.model.Sequence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Sequence sequence(){
        Sequence sequence = new Sequence();
        sequence.setPrefix("30");
        sequence.setSuffix("A");
        sequence.setInitial(100000);
        return sequence;
    }
}
