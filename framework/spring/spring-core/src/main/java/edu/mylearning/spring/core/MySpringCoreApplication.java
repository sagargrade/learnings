package edu.mylearning.spring.core;

import edu.mylearning.spring.core.config.AppConfig;
import edu.mylearning.spring.core.model.Sequence;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class MySpringCoreApplication {
    private static final Logger LOGGER = Logger.getLogger(MySpringCoreApplication.class.getSimpleName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Sequence sequence = applicationContext.getBean(Sequence.class);
        LOGGER.info("First Sequence : " + sequence.nextValue());
        LOGGER.info("Second Sequence : " + sequence.nextValue());
    }
}
