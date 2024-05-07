package com.programming.techie.gateway.routes;

import org.springframework.cloud.gateway.server.mvc.handler.GetewayRouterFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RoterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class Routes {

    @Bean
    public RoterFunction<ServerResponse> productServiceRoute(){
        return GetewayRouterFunctions.route("product_service")
        .route(RequestPredicates.path("/api/product"), HandlerFunctions.http("http://localhost:8080"))

    }

}
