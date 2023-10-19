package com.example.poorchang.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JsoupTest {
    public void jsoupTest () {
        try {
            String url = "https://www.rankingdak.com/";
            Document doc = Jsoup.connect(url).get();
            System.out.println(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JsoupTest jsoupTest = new JsoupTest();
        jsoupTest.jsoupTest();
    }

}
