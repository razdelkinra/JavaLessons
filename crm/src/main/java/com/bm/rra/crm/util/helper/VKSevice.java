package com.bm.rra.crm.util.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VKSevice {

    @Value("${vk.version}")
    private static String version;

    private String UrlApiVK = "https://api.vk.com/method/" +
            "METHOD_NAME" +
            "PARAMETERS" +
            "&access_token=ACCESS_TOKEN&v="
            + version;


    public void getNeedData(String token) {

    }

    public void getFoto(String token) {
        String fotoUrl = UrlApiVK.
                replace("METHOD_NAME", "photos.getAll?extended=1&count=200").
                replace("ACCESS_TOKEN", token).
                replace("PARAMETERS","");
        System.out.println(fotoUrl);
    }
}
