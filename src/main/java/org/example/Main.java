package org.example;

import org.example.services.GauntletServiceImpl;

public class Main {
    public static void main(String[] args) {
        final var gauntletService = new GauntletServiceImpl();

        gauntletService.useGauntlet("OKK");
    }
}