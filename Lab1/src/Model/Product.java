package Model;

/**
 *
 * @author rithwikvarma
 */
public class Product {

    private String name;
    private double price;
    private String description;
    private Address address; 

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name.trim() : null;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price >= 0 ? price : 0.0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description != null ? description.trim() : null;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
