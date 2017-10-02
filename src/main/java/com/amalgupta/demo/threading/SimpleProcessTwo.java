package com.amalgupta.demo.threading;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleProcessTwo {

    public static final Integer doSomeProcessTwo(final int min, final int max){
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }


    public static final Integer convert(final Integer input1, final Integer input2) {
        return ((input1>input2) ? input1: input2);
    }
}
