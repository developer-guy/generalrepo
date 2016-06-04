/**
 * Created by Batuhan on 5.5.2016.
 */
public class Adress {
    String city,building;

    public Adress(String city, String building) {
        this.city = city;
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
