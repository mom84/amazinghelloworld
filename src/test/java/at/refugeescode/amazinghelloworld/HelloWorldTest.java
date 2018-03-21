package at.refugeescode.amazinghelloworld;

import at.refugeescode.amazinghelloworld.HelloWorld.HelloWorld;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {

    @Autowired
    private HelloWorld helloWorld;


    @Test
    void seyHelloWorld() {
        String text = helloWorld.seyHelloWorld();
        assertEquals("Hello World", text);
    }
}