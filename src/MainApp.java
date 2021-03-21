import model.User;
import utils.StringUtils;
import utils.WeekUtils;

public class MainApp {
    public static void main(String[] args) {
        String text1 = StringUtils.getFormatedText("jakis tam tekst do sformatowania");
        System.out.println(text1);

        String text2 = StringUtils.getFormatedText("test");
        System.out.println(text2);

        System.out.println(WeekUtils.MONDAY);

//        System.out.println(User.getUserCounter());
//        User user1 = new User("Wojtek", "Kowalski", "nie@niepodam.pl", 20);
//        User user2 = new User("Wojtek", "Kowalski", "nie@niepodam.pl", 20);
//        User user3 = new User("Wojtek", "Kowalski", "nie@niepodam.pl", 20);
//        System.out.println(User.getUserCounter());

//        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
//
//        int max;
//        for(int i=0;i<numbers.length;i++){
//            max=numbers[i];
//            for (int j=i+1;j<numbers.length;j++){
//                if(numbers[j]>max) {
//                    max=numbers[j];
//                    numbers[j]=numbers[i];
//                    numbers[i]=max;
//                }
//            }
//
//        }


//        int min;
//        for (int i = 0; i < numbers.length; i++) {
//            min = numbers[i];
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (min > numbers[j]) {
//                    numbers[i] = numbers[j];
//                    numbers[j] = min;
//                    min = numbers[i];
//                }
//            }
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }

//        String[] names = new String[5];
//        names[0] = "Piotr";
//        names[1] = "Bartek";
//        names[2] = "Kasia";
//        names[3] = "Robert";
//        names[4] = "Adam";
//
//        for (int i = 0; i < names.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(names[i]);
//            }
//        }
//        System.out.println();
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers.length);


//        Bug bug = new Bug("opis błędu", "test@niepodam.pl", 4);
//        bug.showAllInfo();
//        bug.showReporter();
//        bug.showStatus();
//        String bugPriority = bug.getPriority();
//        System.out.println("Priorytet: " + bugPriority);
//
//        bug.setDescription("test");
//        System.out.println(bug.getDescription());
//        bug.setDescription("testowy opis");
//        System.out.println(bug.getDescription());
//
//        bug.setEmail("blednymail.pl");
//        System.out.println(bug.getEmail());
//        bug.setEmail("prawidlowy@mail.pl");
//        System.out.println(bug.getEmail());
//
//        bug.setPriority(20);
//        System.out.println(bug.getPriority());
//        bug.setPriority(1);
//        System.out.println(bug.getPriority());


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
