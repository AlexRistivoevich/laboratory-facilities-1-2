package itmo.laboratory.lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.addition(1, 2, 3));
        System.out.println(Calculator.addition(3.0, 2.50, 500.10));
        System.out.println(Calculator.addition(1000L, 205550L, 32552L));

        System.out.println(Calculator.division(1, 2, 3));
        System.out.println(Calculator.division(3.0, 2.50, 500.10));
        System.out.println(Calculator.division(1000L, 205550L, 32552L));

        System.out.println(Calculator.multiplication(1, 2, 3));
        System.out.println(Calculator.multiplication(3.0, 2.50, 500.10));
        System.out.println(Calculator.multiplication(1000L, 205550L, 32552L));

        System.out.println(Calculator.subtraction(1, 2, 3));
        System.out.println(Calculator.subtraction(3.0, 2.50, 500.10));
        System.out.println(Calculator.subtraction(1000L, 205550L, 32552L));

        House house1 = new House("Россия", "Тверская улица", 25);
        System.out.println(house1);
        System.out.println(house1.getCountry() + " " + house1.getStreetName() + " " + house1.getHouseNumber());
        House house2 = new House("Кирпич", true, "Россия", 250.00, 25, "Проспект Мира");
        System.out.println(house2);
        String material = house2.getMaterial();
        System.out.println(material);

    }
}
