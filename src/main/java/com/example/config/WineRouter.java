package com.example.config;

import com.example.handler.WineHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.TEXT_EVENT_STREAM;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

/**
 * Created by glannebere on 13/05/2017.
 */
@Configuration
public class WineRouter {

    @Bean
    public RouterFunction<ServerResponse> route(WineHandler wineHandler) {
        return RouterFunctions
                .route(GET("/types/{type}").and(accept(TEXT_EVENT_STREAM)), wineHandler::getByType)
                .andRoute(GET("/appelations/{appelation}").and(accept(TEXT_EVENT_STREAM)), wineHandler::getByAppelation);
    }
}
