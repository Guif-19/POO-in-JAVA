package Generics;

public class Product<T, U> {
    T item;
    U price;

    public Product(T item, U price) {
        this.item = item;
        this.price = price;
    }
    public T getItem() {
        return this.item;
    }
    public U getPrice() {
        return this.price;
    }
    public void setItem(T item) {
        this.item = item;
    }
    public void setPrice(U price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" + "item=" + item + ", price=" + price + '}';
    }

}
