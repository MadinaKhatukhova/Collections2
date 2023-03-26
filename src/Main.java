import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        generateRandom(integerSet);
        System.out.println("Рандомные двадцать чисел: " + integerSet);
        List<Integer> integerList = new ArrayList<>();
        getEvenNumbers(integerSet, integerList);
        System.out.println("Оставшиеся четные числа из рандомных: " + integerList);

        Mechanic Mechanic = new Mechanic();
        Mechanic.addMechanic ("Артур Иванов","Kia");
        Mechanic.addMechanic("Петр Сидоров","Nissan");
        Mechanic.addMechanic("Николай Соболев","Honda");
        Mechanic.addMechanic("Арсен Арзуманян","Audi");
        Mechanic.addMechanic("Эдуард Суровый","Ford");
        Mechanic.addMechanic("Максим Кожевников","Mercedes-Benz");
        Mechanic.addMechanic("Юрий Сергеев","Skoda");
        Mechanic.addMechanic("Егор Июльский","Volkswagen");
        Mechanic.addMechanic("Ренат Майский","Mazda");
        Mechanic.addMechanic("Юрий Савичев","Toyota");
        Mechanic.addMechanic("Сергей Леонидович","Acura");
        Mechanic.addMechanic("Иван Герасимов","Infiniti");
        Mechanic.addMechanic("Альберт Эдуардович","Lexus");
        Mechanic.addMechanic("Олег Валентинович","Subaru");
        Mechanic.addMechanic("Игорь Сергеевич","Chevrolet");
        Mechanic.addMechanic("Евгений Виссарионович","Dodge");
        Mechanic.addMechanic("Никита Покров","Jeep");
        Mechanic.addMechanic("Юрий Могучий","Pontiac");
        Mechanic.addMechanic("Евгений Васильевич","Cadillac");
        Mechanic.addMechanic("Леонид Петрович","Tesla");

        System.out.println(Mechanic);

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