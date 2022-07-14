package entities;

public class Category {
    private String name;
    private Product [] products;
    public Category(String name, Product [] products){
        this.name=name;
        this.products=products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }
}
