import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String brand;
    private Integer stroke;

    public Engine() {
        this.brand = "xyz";
        this.stroke = 4;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getStroke() {
        return stroke;
    }

    public void setStroke(Integer stroke) {
        this.stroke = stroke;
    }
}
