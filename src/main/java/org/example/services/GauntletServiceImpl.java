package org.example.services;

import lombok.extern.java.Log;
import org.example.models.Stone;
import org.example.models.TimeStone;
import org.example.singletons.MindStoneSingleton;

@Log
public class GauntletServiceImpl implements IGauntletService{

    private final Stone timeStone = MindStoneSingleton.getInstance();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("Use stone: "+timeStone);
    }
}
