public class BottleOfTea extends Product {

    private Double volume;

    public BottleOfTea(String name, Double cost, Double volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public Double setVolume(Double volume) {
        return this.volume = volume;
    }

    @Override
    public String toString() {
        return "Брэнд: " + name + " Стоимость: " + cost + " Объем: " + volume;
    }
}
