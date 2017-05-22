package com.example.handler;

import com.example.model.Wine;
import com.example.service.WineService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.Duration;

import static org.springframework.http.MediaType.TEXT_EVENT_STREAM;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Created by glannebere on 13/05/2017.
 */
@Configuration
public class WineHandler {

    private final WineService wineService;

    public WineHandler(WineService wineService) {
        this.wineService = wineService;
    }

    public Mono<ServerResponse> getByType(ServerRequest request) {
        return ok()
                .contentType(TEXT_EVENT_STREAM)
                .body(wineService.getByType(request.pathVariable("type")).delayElements(Duration.ofSeconds(1)), Wine.class);
    }

    public Mono<ServerResponse> getByAppelation(ServerRequest request) {
        return ok()
                .contentType(TEXT_EVENT_STREAM)
                .body(wineService.getByAppelation(request.pathVariable("appelation")).delayElements(Duration.ofSeconds(1)), Wine.class);
    }

}
