package com.pattern.factory;


public class VolunteerFactory implements Factory {
    @Override
    public LeiFeng createInOperation() {
        return new Volunteer();
    }
}
