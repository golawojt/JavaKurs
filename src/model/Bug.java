package model;

public class Bug {
    private String description;
    private String email;
    private int priority;
    private boolean status = true;

    public Bug(String description, String email, int priority) {
        this.description = description;
        this.email = email;
        this.priority = priority;
    }

    public String getDescription() {
        return "Description: " + description;
    }

    public void setDescription(String description) {
        if (description.length() < 10) {
            System.out.println("Incorrect description");
        } else {
            this.description = description;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Incorrect email");
        } else {
            this.email = email;
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void showAllInfo() {
        System.out.println(description + " " + email + " " + priority + " " + status);
    }

    public void showReporter() {
        System.out.println(email);
    }

    public void showStatus() {
        System.out.println(status);
    }

    public String getPriority() {
        String bugPriority = "";
        switch (this.priority) {
            case 1:
                bugPriority = "Blocker";
                break;
            case 2:
                bugPriority = "Critical";
                break;
            case 3:
                bugPriority = "Major";
                break;
            case 4:
                bugPriority = "Minor";
                break;
            case 5:
                bugPriority = "Trivial";
            default:
                break;
        }
        return bugPriority;
    }

    public void setPriority(int priority) {
        if (!(priority > 0 && priority < 6)) {
            System.out.println("Incorrect priority");
        } else {
            this.priority = priority;
        }
    }
}
