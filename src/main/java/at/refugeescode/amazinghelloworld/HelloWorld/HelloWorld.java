package at.refugeescode.amazinghelloworld.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private Hello hello;
    private World world;


     HelloWorld(Hello hello, World world){
        this.hello = new Hello();
        this.world= world;
    }

    public String seyHelloWorld(){
        String hello = this.hello.seyHello();
        String world = this.world.seyWorld();
        return hello+ " " + world;
    }
}
