public class Chips extends Product {
    
    private String taste;

    public Chips(String name, Double cost, String taste) {
        this.name = name;
        this.cost = cost;
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public String setTaste(String taste) {
        return this.taste = taste;
    }

    @Override
    public String toString() {
        return "Брэнд: " + name + " Стоимость: " + cost + " Вкус: " + taste;
    }
}

