package com.example.controller;

import com.example.model.Wine;
import com.example.service.WineService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * Created by glannebere on 09/05/2017.
 */
@RestController
public class WineController {

    /*private final WineService wineService;

    public WineController(WineService wineService) {
        this.wineService = wineService;
    }

    @GetMapping(value = "/types/{type}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Wine> getByType(@PathVariable String type) {
        return wineService.getByType(type).delayElements(Duration.ofSeconds(1));
    }

    @GetMapping(value = "/appelations/{appelation}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Wine> getByAppelation(@PathVariable String appelation) {
        return wineService.getByAppelation(appelation).delayElements(Duration.ofSeconds(1));
    }*/
}
