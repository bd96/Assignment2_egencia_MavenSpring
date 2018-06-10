import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private Integer numOfTyres;
    private String brand;

    public Tyre() {
        this.numOfTyres = 2;
        this.brand = "MRF";
    }

    public Integer getNumOfTyres() {
        return numOfTyres;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumOfTyres(Integer numOfTyres) {
        this.numOfTyres = numOfTyres;
    }
}
