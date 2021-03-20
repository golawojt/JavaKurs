import model.Bug;
import model.User;

public class MainApp {
    public static void main(String[] args) {
        Bug bug = new Bug("opis błędu", "test@niepodam.pl", 4);
        bug.showAllInfo();
        bug.showReporter();
        bug.showStatus();
        String bugPriority = bug.getPriority();
        System.out.println("Priorytet: " + bugPriority);

        bug.setDescription("test");
        System.out.println(bug.getDescription());
        bug.setDescription("testowy opis");
        System.out.println(bug.getDescription());

        bug.setEmail("blednymail.pl");
        System.out.println(bug.getEmail());
        bug.setEmail("prawidlowy@mail.pl");
        System.out.println(bug.getEmail());

        bug.setPriority(20);
        System.out.println(bug.getPriority());
        bug.setPriority(1);
        System.out.println(bug.getPriority());


//        model.User wojtek = new model.User("Wojtek", "Kowalski", "nie@niepodam.pl", 30);
//
//        wojtek.getFullName();
//        wojtek.getAllInfo();
//        System.out.println(wojtek.getUserAge());
//        int userAge = wojtek.getUserAge();
//        System.out.println(userAge);
//
//        boolean userAdult = wojtek.isUserAdult();
//        System.out.println("Czy Wojtek jest dorosły: " + userAdult);
//
//        wojtek.greetings(wojtek.firstName);
//        wojtek.greetings(wojtek.firstName, wojtek.lastName);
//        wojtek.hoOldAreYou(wojtek.firstName, wojtek.age);
//        wojtek.hoOldAreYou("Asoa", 16);
//
//        System.out.println("In 10 years you'll be " + wojtek.yourAgePlus10(wojtek.age));
//
//        model.User tomek = new model.User("tomek", "nowak", "tomek@nowak.pl", 15);
//        tomek.getAllInfo();

//        User user = new User("Wojtek", "Kowalski", "nie@niepodam.pl", 20);
//        System.out.println(user.isUserAdult());
//        System.out.println(user.getEmail());
//        user.setEmail("takniepodam.pl");
//        user.setEmail("tak@niepodam.ru");
//        user.setEmail("tak@niepodam.RU");
//        System.out.println(user.getEmail());
    }
}
