package com.amalgupta.demo.threading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.lang.InterruptedException;

public class CompletableFuturesDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException{
        /** Java 8 Style **/
        final Integer result
                = CompletableFuture
                .supplyAsync(
                    () -> SimpleProcessOne.doSomeProcess(10, 20))
            .thenCombine(CompletableFuture.supplyAsync(
                    () -> SimpleProcessTwo.doSomeProcessTwo(30, 40)),
                    SimpleProcessTwo::convert)
            .get(); // Blocking Call -- will wait. May wait Indefinitely for real processes

        System.out.println(result);
    }

}
