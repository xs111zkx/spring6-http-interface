package com.zkx.spring6httpinterface.config;

import com.zkx.spring6httpinterface.client.ChuckNorrisClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class AppConfig {
    @Bean
    public ChuckNorrisClient chuckNorrisClient() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://api.chucknorris.io")
                .build();
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(webClient))
                .build();
        return httpServiceProxyFactory.createClient(ChuckNorrisClient.class);
    }
}
