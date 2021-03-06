package com.valdemar.demo.modelo.services;

import com.valdemar.demo.modelo.entidad.Prostituta;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@Service
public interface ProstitutaService {
    Mono<Prostituta> save(Prostituta prostituta);
    Flux<Prostituta> saveAll(Flux<Prostituta>prostituta);

    Flux <Prostituta> findAll();
}
