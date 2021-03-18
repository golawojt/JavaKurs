public class MainApp {
    public static void main(String[] args) {
        User wojtek = new User("Wojtek", "Kowalski", "nie@niepodam.pl", 30);

        wojtek.getFullName();
        wojtek.getAllInfo();
        System.out.println(wojtek.getUserAge());
        int userAge = wojtek.getUserAge();
        System.out.println(userAge);

        boolean userAdult = wojtek.isUserAdult();
        System.out.println("Czy Wojtek jest dorosły: " + userAdult);

        wojtek.greetings(wojtek.firstName);
        wojtek.greetings(wojtek.firstName, wojtek.lastName);
        wojtek.hoOldAreYou(wojtek.firstName, wojtek.age);
        wojtek.hoOldAreYou("Asoa", 16);

        System.out.println("In 10 years you'll be " + wojtek.yourAgePlus10(wojtek.age));

        User tomek = new User("tomek", "nowak", "tomek@nowak.pl", 15);
        tomek.getAllInfo();
    }
}
