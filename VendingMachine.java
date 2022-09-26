import java.util.ArrayList;

public class VendingMachine {

    ArrayList<BottleOfTea> bottleOfTeas = new ArrayList<>();
    ArrayList<Chocolate> chocolates = new ArrayList<>();
    ArrayList<Chips> chips = new ArrayList<>();

    public VendingMachine() {
        bottleOfTeas.add(new BottleOfTea("lipton", 10.0, 0.5));
        bottleOfTeas.add(new BottleOfTea("nestea", 11.0, 0.6));
        bottleOfTeas.add(new BottleOfTea("fuzetea", 9.0, 0.6));

        chocolates.add(new Chocolate("snickers", 5.5, "XXL"));
        chocolates.add(new Chocolate("twix", 3.0, "origin"));
        chocolates.add(new Chocolate("bounty", 7.0, "XXL"));

        chips.add(new Chips("lays", 8.5, "bacon"));
        chips.add(new Chips("estrella", 8.0, "cheese"));
        chips.add(new Chips("nachos", 10.0, "original"));
    }

    public BottleOfTea getTeaByName(String name) {
        for (BottleOfTea tea : bottleOfTeas) {
            if(tea.getName().equals(name))
                return tea;
        }
        return null;
    }

    public Chocolate getChocolateByCost(Double cost) {
        for (Chocolate choco : chocolates) {
            if(choco.getCost().equals(cost))
                return choco;
        }
        return null;
    }

    public Chips getChipsByTaste(String taste) {
        for (Chips item : chips) {
            if(item.getTaste().equals(taste))
                return item;
        }
        return null;
    }


}

