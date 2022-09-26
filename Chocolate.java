public class Chocolate extends Product {

    private String size;

    public Chocolate(String name, Double cost, String size) {
        this.name = name;
        this.cost = cost;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String setSize(String size) {
        return this.size = size;
    }

    @Override
    public String toString() {

        return "Брэнд: " + name + " Стоимость: " + cost + " Размер: " + size;
    }
}
