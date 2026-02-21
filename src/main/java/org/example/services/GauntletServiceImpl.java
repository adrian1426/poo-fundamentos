package org.example.services;

import lombok.extern.java.Log;
import org.example.models.Stone;
import org.example.models.TimeStone;

@Log
public class GauntletServiceImpl implements IGauntletService{

    private Stone timeStone = new TimeStone();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("Use stone: "+timeStone);
    }
}
