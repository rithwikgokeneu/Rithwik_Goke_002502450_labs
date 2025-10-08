package Model;

/**
 *
 * @author rithwikvarma
 */
public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {}

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street != null ? street.trim() : null;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city != null ? city.trim() : null;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state != null ? state.trim() : null;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip != null ? zip.trim() : null;
    }
}
