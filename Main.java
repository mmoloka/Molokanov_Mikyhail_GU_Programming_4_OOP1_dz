import java.util.logging.Logger;

/* Реализовать абстрактный класс Продукт, добавить ему какие-то параметры.
* Реализовать несколько наследников от класса Продукт со своими параметрами, конструкторами и переопределяющие метод 
toString.
* Реализовать класс Торговый автомат инициализирующий в дефолтном конструкторе несколько коллекций, содержащих наследников
класса Продукт.
* Реализовать несколько методов возвращающих наследника класса(использовать разных наследников) Продукт по какому-либо
признаку.
* В отдельном классе Main реализовать пример использования торгового автомата (Создать автомат - запросить продукт по 
критерию - вывести полученный продукт в лог). */

public class Main {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        Logger lg = Logger.getLogger(Main.class.getName());

        lg.info(vm.getTeaByName("nestea").toString());
        lg.info(vm.getChocolateByCost(7.0).toString());
        lg.info(vm.getChipsByTaste("original").toString());




    }
}