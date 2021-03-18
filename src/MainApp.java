public class MainApp {
    public static void main(String[] args) {
        Bug bug = new Bug("opis błędu", "test@niepodam.pl", 4);
        bug.showAllInfo();
        bug.showReporter();
        bug.showStatus();
        String bugPriority = bug.getPriority();
        System.out.println("Priorytet: " + bugPriority);
    }
}
