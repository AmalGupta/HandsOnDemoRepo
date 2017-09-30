package com.amalgupta.demo.streams;

import java.util.stream.Stream;

public class StreamOfNullableMain {

    public static void main(String[] args) {


        Long startTime = System.currentTimeMillis();
        /***Java 9 Style **/

        String configurationDirectory =
                Stream.of("app.config", "app.home", "user.home")
                        .flatMap(
                                key -> Stream.ofNullable(System.getProperty(key))
                        )
                        .findFirst()
                        .orElseThrow(IllegalStateException::new);  /// NOTE THIS OPERATOR. WE Don't use it!


        System.out.println(configurationDirectory);

        System.out.println(System.currentTimeMillis() - startTime + "microseconds ");    }
}
