package com.zkx.spring6httpinterface.controller;

import com.zkx.spring6httpinterface.client.ChuckNorrisClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChuckNorrisController {
    private static final Logger log = LoggerFactory.getLogger(ChuckNorrisController.class);
    @Autowired
    private ChuckNorrisClient chuckNorrisClient;


    @GetMapping("/test")
    public String remote() {
        log.info("Random Chuck Norris quote: {}", chuckNorrisClient.getRandomQuote());
        log.info("Categories: {}", chuckNorrisClient.getCategories());
        log.info("Joke from money category: {}", chuckNorrisClient.getQuoteFromCategory("money"));

        return "SUCCESS";
    }
}
