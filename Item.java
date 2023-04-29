public class Item {
    Double price;
    String item;

    public Item (String item, Double price){
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public Double getPrice() {
        return price;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
