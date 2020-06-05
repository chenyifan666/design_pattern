package com.pattern.state;

public class Work {
    private int hour;

    private State state = new MorningState();

    public void writeProgram(){
        state.writeProgram(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
