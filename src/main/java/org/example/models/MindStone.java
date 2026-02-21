package org.example.models;

import lombok.ToString;

@ToString
public class MindStone extends  Stone{
    private static final String COLOR = "Yellow";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Agamotto 2";
    private static final int ENERGY_LEVEL = 10;

    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }

    @Override
    public void usePower() {
        System.out.println("My power Mind stone: "+super.toString());
    }
}
