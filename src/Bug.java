public class Bug {
    String description;
    String email;
    int priority;
    boolean status = true;

    Bug(String description, String email, int priority) {
        this.description = description;
        this.email = email;
        this.priority = priority;
    }

    void showAllInfo() {
        System.out.println(description + " " + email + " " + priority + " " + status);
    }

    void showReporter() {
        System.out.println(email);
    }

    void showStatus() {
        System.out.println(status);
    }

    String getPriority() {
        String bugPriority = "";
        switch (this.priority) {
            case 1:
                bugPriority = "Critical";
                break;
            case 2:
                bugPriority = "High";
                break;
            case 3:
                bugPriority = "Medium";
                break;
            case 4:
                bugPriority = "Low";
                break;
            default:
                break;
        }
        return bugPriority;
    }
}
