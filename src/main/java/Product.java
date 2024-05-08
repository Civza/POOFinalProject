public class Product {
    protected String name;
    protected String flavor;
    protected float price;
    protected int stock;
    //protected <Type> presentation | comentado por que no se que tipo de variable seria esto lmao
    //TODO agregar al constructor despues de aclarar esto ^^
    //TODO agregar el getter y setter de presentation


    public Product(String name, String flavor, float price, int stock) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
