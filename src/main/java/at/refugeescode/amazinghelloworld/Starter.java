package at.refugeescode.amazinghelloworld;

import at.refugeescode.amazinghelloworld.HelloWorld.HelloWorld;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Starter {


    @Bean
    ApplicationRunner applicationRunner(HelloWorld helloWorld) {
        return args -> {
            String text = helloWorld.seyHelloWorld();
            System.out.println(text);
        };
    }
}