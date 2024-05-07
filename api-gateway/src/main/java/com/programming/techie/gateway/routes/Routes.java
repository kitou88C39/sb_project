package com.programming.techie.gateway.routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Routes {

    @Bean
    public RoterFunction<ServerResponse> productServiceRoute(){
        return GetewayRouterFunctions.route("product_service")

    }

}
