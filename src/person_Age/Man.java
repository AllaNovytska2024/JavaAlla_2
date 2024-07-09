package person_Age;

public class Man {

   private int age;

   public Man(int age) {
       this.age = age;
   }

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public static void main(String[] args) {

       Man man = new Man(22);

       String securityAnswer;

       if (man.getAge() >= 18) {
           securityAnswer = "Все в порядке, проходите!";
       } else {
           securityAnswer = "Этот фильм не подходит для вашего возраста!";
       }

       System.out.println(securityAnswer);

   }
}
/*
Короткий тернальный:

public static void main(String[] args) {

   Man man = new Man(22);

   String securityAnswer = (man.getAge() >= 18) ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";

   System.out.println(securityAnswer);

}
 */