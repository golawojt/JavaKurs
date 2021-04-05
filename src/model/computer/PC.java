package model.computer;

public class PC extends Computer {
    private boolean isPluggedIn;

    public PC(String name, String type, int hdd, int ram, boolean isPluggedIn) {
        super(name, type, hdd, ram);
        this.isPluggedIn = isPluggedIn;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPluggedIn) {
            super.switchOn();

        } else {
            System.out.println("Computer is not plugged in!");
        }
    }

    public void setPluggedIn(boolean isPluggedIn) {
        this.isPluggedIn = isPluggedIn;
    }

    public int volumeUp() {
        return volume += 1;
    }

    @Override
    public int volumeDown() {
        if (volume - 1 <= 0) {
            volume = 0;
        } else {
            volume -= 1;
        }
        return volume;
    }

    @Override
    public int volumeUp(int volume) {
        if ((this.volume + volume) >= 100) {
            this.volume = 100;
        } else {
            this.volume += volume;
        }
        return this.volume;
    }

    @Override
    public int volumeDown(int volume) {
        if ((this.volume - volume) <= 0) {
            this.volume = 0;
        } else {
            this.volume -= volume;
        }
        return this.volume;
    }
}
