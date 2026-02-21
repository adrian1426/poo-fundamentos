package org.example.singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.example.models.MindStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MindStoneSingleton {

    private static volatile MindStone mindStoneInstance;

    public static  MindStone getInstance(){
        if(mindStoneInstance==null){
            log.info("Creating first instance");
            synchronized (MindStoneSingleton.class){
                if(mindStoneInstance==null){
                    mindStoneInstance= new MindStone();
                }
            }
        }

        return mindStoneInstance;
    }
}
