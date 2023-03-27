import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        generateRandom(integerSet);
        System.out.println("Рандомные двадцать чисел: " + integerSet);
        List<Integer> integerList = new ArrayList<>();
        getEvenNumbers(integerSet, integerList);
        System.out.println("Оставшиеся четные числа из рандомных: " + integerList);

        Mechanic mechanic = new Mechanic();
        Mechanic.addMechanic("Kia","Артур Иванов");
        Mechanic.addMechanic("Nissan","Петр Сидоров");
        Mechanic.addMechanic("Honda","Николай Соболев");
        Mechanic.addMechanic("Audi","Арсен Арзуманян");
        Mechanic.addMechanic("Ford","Эдуард Суровый");
        Mechanic.addMechanic("Mercedes-Benz","Максим Кожевников");
        Mechanic.addMechanic("Volkswagen","Егор Июльский");
        Mechanic.addMechanic("Mazda","Ренат Майский");
        Mechanic.addMechanic("Toyota","Юрий Савичев");
        Mechanic.addMechanic("Acura","Сергей Леонидович");
        Mechanic.addMechanic("Infiniti","Иван Герасимов");
        Mechanic.addMechanic("Lexus","Альберт Эдуардович");
        Mechanic.addMechanic("Subaru","Олег Валентинович");
        Mechanic.addMechanic("Chevrolet","Игорь Сергеевич");
        Mechanic.addMechanic("Dodge","Евгений Виссарионович");
        Mechanic.addMechanic("Jeep","Никита Покров");
        Mechanic.addMechanic("Pontiac","Юрий Могучий");
        Mechanic.addMechanic("Cadillac","Евгений Васильевич");
        Mechanic.addMechanic("Tesla","Леонид Петрович");

        System.out.println(mechanic);

        CollectionMapStringInteger collectionMapStringInteger= new CollectionMapStringInteger();
        collectionMapStringInteger.addMap("Str1", 2);
        collectionMapStringInteger.addMap("Str2", 1);
        collectionMapStringInteger.addMap("Str1", 5);
        System.out.println(collectionMapStringInteger);
    }


    public static void getEvenNumbers(Set<Integer> integerSet, List<Integer> integerList) {
        for (Integer integer : integerSet) {
            if (integer % 2 == 0) {
                integerList.add(integer);
            }
        }
    }

    public static void generateRandom(Set<Integer> integerSet) {
        Random random = new Random();
        int i = 0;
        while (i < 20) {
            integerSet.add(random.nextInt(1000));
            i++;
        }
    }


}