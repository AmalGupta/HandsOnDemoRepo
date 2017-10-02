package com.amalgupta.demo.threading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFuturesJava9 {

    public static void main(String[] args) {

        /** Java 9 method : CompleteOnTimeout **/

        int DEFAULT_VALUE = 2343;
        CompletableFuture
                .supplyAsync(
                        () -> SimpleProcessOne.doSomeProcess(10, 20))
                .thenCombine(CompletableFuture.supplyAsync(
                        () -> SimpleProcessTwo.doSomeProcessTwo(30, 40)),
                        SimpleProcessTwo::convert)
                .completeOnTimeout(DEFAULT_VALUE, 4, TimeUnit.SECONDS)
                .thenAccept( result -> System.out.println(" Result is  "+result) );

    }
}
