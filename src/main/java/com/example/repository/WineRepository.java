package com.example.repository;

import com.example.model.Wine;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

/**
 * Created by glannebere on 09/05/2017.
 */
public interface WineRepository extends ReactiveMongoRepository<Wine, Integer> {

    Flux<Wine> findByType(String type);
    Flux<Wine> findByAppelation(String appelation);
}
