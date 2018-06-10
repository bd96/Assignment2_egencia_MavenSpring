import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    @Autowired
    Tyre T;
    @Autowired
    Engine E;

    public void print() {
        System.out.println("Tyre " + T.getBrand() + " " + T.getNumOfTyres() + " Engine " + E.getBrand() + " " + E.getStroke() );
    }

}
