public class User {
    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        return age >= 18;
    }

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    void greetings(String name, String lastName) {
        System.out.println("Hi " + name + " " + lastName + ". Nice to see you!");
    }

    void hoOldAreYou(String name, int age) {
        System.out.println("Hi " + name + ". You're " + age + " old.");
    }

    int yourAgePlus10(int age) {
        return age + 10;
    }
}
