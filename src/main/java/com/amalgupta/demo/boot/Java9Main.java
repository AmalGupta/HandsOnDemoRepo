package com.amalgupta.demo.boot;

import com.amalgupta.demo.process.ProcessUtil;

import java.util.List;

public class Java9Main {

    public static void main(String[] args) throws Exception{

        List<String> result = ProcessUtil.listAll();

        result.stream().forEach((String s) -> {
            System.out.println(s);
        });
    }
}
