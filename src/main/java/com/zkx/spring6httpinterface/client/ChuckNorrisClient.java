package com.zkx.spring6httpinterface.client;

import com.zkx.spring6httpinterface.vo.ChuckNorrisVO;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url = "/jokes")
public interface ChuckNorrisClient {
    @HttpExchange(value = "/random", method =  "GET")
    ChuckNorrisVO getRandomQuote();

    @GetExchange("/random")
    ChuckNorrisVO getQuoteFromCategory(@RequestParam("category") String category);

    @GetExchange("/categories")
    List<String> getCategories();
}
