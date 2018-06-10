import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class index {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(ConfigFile.class);

        Vehicle V = factory.getBean(Vehicle.class);
        V.print();

    }
}
