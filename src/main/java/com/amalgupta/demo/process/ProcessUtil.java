package com.amalgupta.demo.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author amalgupta
 */
public class ProcessUtil {

    private static Logger log = Logger.getAnonymousLogger();

    public static List<String> listAll() throws IOException {

            final List<String> result = new ArrayList<String>();

            final Process p = Runtime.getRuntime().exec("ls -lrta");
            InputStream inputStream = p.getInputStream();
            final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line="";
            while ((line=br.readLine()) != null) {
               result.add(line);
            }

            return result;

    }
}
