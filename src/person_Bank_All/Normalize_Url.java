package person_Bank_All;

public class Normalize_Url {

   // Вот реализация метода normalizeUrl() на Java, который выполняет нормализацию адреса,
    // добавляя https:// в начало:


        public static void main(String[] args) {
            System.out.println(normalizeUrl("google.com")); // "https://google.com"
            System.out.println(normalizeUrl("https://ai.fi")); // "https://ai.fi"
        }

        public static String normalizeUrl(String address) {
            if (address.startsWith("http://")) {
                return "https://" + address.substring(7);
            } else if (address.startsWith("https://")) {
                return address;
            } else {
                return "https://" + address;
            }
        }
    }
/*
Метод normalizeUrl() принимает адрес сайта и всегда возвращает его с префиксом https://.
Если адрес уже начинается с https://, он остается неизменным.
В противном случае, префикс https:// добавляется к адресу.

Решение учителя:
public class App {
    // BEGIN
    public static String normalizeUrl(String site) {
        if (site.startsWith("https://")) {
            return site;
        }

        return "https://" + site;
    }
    // END
}
 */

