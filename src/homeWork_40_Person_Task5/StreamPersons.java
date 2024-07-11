package homeWork_40_Person_Task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamPersons {
    public static void main(String[] args) {
task5();
    }

    private static void task5() {
        // Получить список имен, которые (имена) старше 50 лет
        List<Persons> persons = getListPersons();

      //  List<Persons> personsList = persons.stream()


 System.out.println(getListPersons());
    }



    private static List<Persons> getListPersons() {
        return List.of(
                new Persons("Tom Sojer", 57, "Berlin"),
                new Persons("Dodik Pupenko", 67, "Berlin"),
                new Persons("Gans Majer", 18, "Hameln"),
                new Persons("Franz Muller", 32, "Berlin")
        );
    }
}

