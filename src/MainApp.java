public class MainApp {
    public static void main(String[] args) {
//        User wojtek = new User("Wojtek", "Kowalski", "nie@niepodam.pl", 30);
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
//        User tomek = new User("tomek", "nowak", "tomek@nowak.pl", 15);
//        tomek.getAllInfo();

        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String s = str1.toUpperCase();
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);

        System.out.println(str1.startsWith("He"));
        System.out.println(str1.startsWith("he"));
        System.out.println(str1.endsWith("lo"));
        System.out.println(str1.endsWith("lo!"));
        System.out.println(str1.contains("ll"));

        System.out.println(" ".isEmpty());

        String replaceStr = str1.replace("o", "");
        System.out.println(replaceStr);

        String replaceAll = str1.replaceAll("l", "X");
        System.out.println(replaceAll);

        String substring = str1.substring(1, 4);
        System.out.println(substring);

        String textWithWhitespaces = "    asd   soi aaaaa       ";
        System.out.println(textWithWhitespaces.length());

        String trim = textWithWhitespaces.trim();
        System.out.println(trim);
        System.out.println(trim.length());
    }
}
