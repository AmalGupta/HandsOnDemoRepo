package com.amalgupta.demo.threading;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleProcessOne {

    public static final Integer doSomeProcess(final int min, final int max) {
        return ThreadLocalRandom.current().nextInt(min,max+1);
    }
}
