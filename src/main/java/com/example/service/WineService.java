package com.example.service;

import com.example.model.Wine;
import com.example.repository.WineRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * Created by glannebere on 09/05/2017.
 */
@Service
public class WineService {

    private final WineRepository wineRepository;

    public WineService(WineRepository wineRepository) {
        this.wineRepository = wineRepository;
    }

    public Flux<Wine> getByType(String type) {
        return wineRepository.findByType(type);
    }

    public Flux<Wine> getByAppelation(String appelation) {
        return wineRepository.findByAppelation(appelation);
    }

}
