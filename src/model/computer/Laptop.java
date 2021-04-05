package model.computer;

public class Laptop extends Computer implements Music, Video {
    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level is too low!");
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void switchOff() {
        System.out.println("wyłączam laptop: " + name);
    }

    public int volumeUp() {
        return volume += 5;
    }

    @Override
    public int volumeDown() {
        if (volume - 2 <= 0) {
            volume = 0;
        } else {
            volume -= 2;
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


    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pause music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");
    }

    @Override
    public void sayHello() {
        Music.super.sayHello();
    }

    @Override
    public void playVideo() {
        System.out.println("Play video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pause video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Stop video");
    }
}
