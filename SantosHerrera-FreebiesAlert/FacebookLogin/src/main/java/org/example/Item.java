package org.example;

public class Item {
    private String price;
    private String name;
    private String location;
    private String imageLink;

    public Item() {

    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public Item(String price, String name, String location, String imageLink) {
        this.price = price;
        this.name = name;
        this.location = location;
        this.imageLink = imageLink;
    }


    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
