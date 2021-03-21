package model.computer;

import java.util.concurrent.CompletableFuture;

public class Computer {
    private String name;
    private String type;
    private int hdd;
    private int ram;
    private boolean state;

    public Computer(String name, String type, int hdd, int ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void switchOff() {
        state = false;
    }

    public void switchOn() {
        state = true;
    }

    public boolean getState() {
        return state;
    }
}