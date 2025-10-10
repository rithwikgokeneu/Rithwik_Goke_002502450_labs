package Model;

/**
 *
 * @author rithwikvarma
 */

public class Address {
    private String street;
    private String unitNum;
    private String city;
    private String state;
    private String zip;

    public Address() {}

    // Street
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = (street != null) ? street.trim() : null; }

    // Aliases expected by UI builder
    public String getStreetName() { return getStreet(); }
    public void setStreetName(String streetName) { setStreet(streetName); }

    // Unit
    public String getUnitNum() { return unitNum; }
    public void setUnitNum(String unitNum) { this.unitNum = (unitNum != null) ? unitNum.trim() : null; }

    // City
    public String getCity() { return city; }
    public void setCity(String city) { this.city = (city != null) ? city.trim() : null; }

    // State (optional)
    public String getState() { return state; }
    public void setState(String state) { this.state = (state != null) ? state.trim() : null; }

    // Zip
    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = (zip != null) ? zip.trim() : null; }

    // Aliases expected by UI builder
    public String getZipCode() { return getZip(); }
    public void setZipCode(String zipCode) { setZip(zipCode); }
}
