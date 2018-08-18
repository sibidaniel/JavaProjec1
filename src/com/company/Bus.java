package com.company;

public class Bus {
    private String name;
    private int seat;

    public Bus(String name, int seat){
           this.name = name;
           this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", seat=" + seat +
                '}';
    }
}
