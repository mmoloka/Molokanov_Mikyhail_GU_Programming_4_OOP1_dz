public abstract class Product {
    protected String name;
    protected Double cost;

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public Double setCost(Double cost) {
        return this.cost = cost;
    }

}
