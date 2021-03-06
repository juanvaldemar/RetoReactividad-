package com.valdemar.demo.handler;

import com.valdemar.demo.modelo.services.ProstitutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class RouterFunctionConfig {
    @Autowired
    private ProstitutaService prostitutaService;

    @Bean
    public RouterFunction<ServerResponse> routes(ProstitutaHandler handler){

        return RouterFunctions.route(RequestPredicates.GET("/api/v1/prostitutas"),handler::listar)
        .andRoute(RequestPredicates.POST("/api/v1/prostitutas"), handler::crearList);
    }

    /*
        @Bean
        public RouterFunction<ServerResponse> routes(){

            return RouterFunctions.route(RequestPredicates.GET("/api/v1/prostitutas"), request -> {
                return ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .body(prostitutaService.findAll(), Prostituta.class);
            });

        }
     */
}
