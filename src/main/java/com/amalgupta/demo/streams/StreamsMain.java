package com.amalgupta.demo.streams;

import java.util.stream.Stream;

public class StreamsMain {

    public static void main(String[] args) {

        /** JAVA 8 Style **/
        //Code snippet from Java Magazine July-Aug 2017

        Long startTime = System.currentTimeMillis();

        String configurationDirectory =
                Stream.of("app.config", "app.home", "user.home")
                .flatMap(
                        key -> {
                            final String property = System.getProperty(key);
                            if (property == null) {
                                return Stream.empty();
                            }
                            else
                            {
                                return Stream.of(property);
                            }

                        }
                )
                .findFirst()
                .orElseThrow(IllegalStateException::new);  /// NOTE THIS OPERATOR. WE Don't use it!

        System.out.println(configurationDirectory);

        System.out.println(System.currentTimeMillis() - startTime + "microseconds ");

    }
}
