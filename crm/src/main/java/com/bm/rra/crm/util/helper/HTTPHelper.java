package com.bm.rra.crm.util.helper;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


@Component
public class HTTPHelper {

    public String readUrl(URL url) {
        BufferedReader reader;
        StringBuffer buffer = new StringBuffer();
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
