package com.amalgupta.demo.threading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemoStep2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /** Java 8 Style -- thenAccept **/
        CompletableFuture
                .supplyAsync(
                        () -> SimpleProcessOne.doSomeProcess(10, 20))
                .thenCombine(CompletableFuture.supplyAsync(
                        () -> SimpleProcessTwo.doSomeProcessTwo(30, 40)),
                        SimpleProcessTwo::convert)
                .thenAccept( result -> System.out.println(" Result is  "+result) );
    }
}
