
package Model;
/**
 *
 * @author rithwikvarma
 * Proucts page where details like (price,description)
 */


public class Product {

    private String name;
    // Keep price as String because the UI reads/writes text
    private String price;
    private String description;
    private String availNum;

    // UI expects separate addresses
    private Address manufactureAddress;
    private Address shippingAddress;

    public Product() {
        this.manufactureAddress = new Address();
        this.shippingAddress = new Address();
    }

    // Name
    public String getName() { return name; }
    public void setName(String name) { this.name = (name != null) ? name.trim() : null; }

    // Price (as String)
    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = (price != null) ? price.trim() : null; }

    // Description
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = (description != null) ? description.trim() : null; }

    // Availability
    public String getAvailNum() { return availNum; }
    public void setAvailNum(String availNum) { this.availNum = (availNum != null) ? availNum.trim() : null; }

    // Manufacture address
    public Address getManufactureAddress() { return manufactureAddress; }
    public void setManufactureAddress(Address manufactureAddress) { this.manufactureAddress = manufactureAddress; }

    // Shipping address
    public Address getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(Address shippingAddress) { this.shippingAddress = shippingAddress; }
}

