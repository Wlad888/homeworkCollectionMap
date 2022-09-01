import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
        public static void main(String[] args) {
            Map<String, String> animals = new HashMap<>();
            animals.put("AnimalCheck1", "Horse");
            animals.put("AnimalCheck2", "Bear");
            animals.put("AnimalCheck3", "Wolf");
            animals.put("AnimalCheck4", "Rabbit");
            animals.put("AnimalCheck5", "Pigeon");

            animals.entrySet().forEach(System.out::println);

            System.out.println();

            Map<String, String> carnivore = new LinkedHashMap<>();
            carnivore.put("Bear", "Carnivore");
            carnivore.put("Wolf", "Carnivore");

            carnivore.entrySet().forEach(System.out::println);

            System.out.println();

            Map<String, String> herbivore = new TreeMap<>();
            herbivore.put("Horse", "herbivore");
            herbivore.put("Rabbit", "herbivore");
            herbivore.put("Pigeon", "herbivore");

            herbivore.entrySet().forEach(System.out::println);
        }
    }


