package com.example.employee.service.client.config;

import com.example.employee.service.api.EmployeeApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class EmployeeApiClientConfig {

    @Bean
    RestClient restClient(RestClient.Builder builder) {
        return builder
                .baseUrl("http://localhost:8080/api/v1")
                .build();
    }

    @Bean
    HttpServiceProxyFactory httpServiceProxyFactory(RestClient restClient) {
        return HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
    }

    @Bean
    EmployeeApi agencyClient(HttpServiceProxyFactory factory) {
        return factory.createClient(EmployeeApi.class);
    }

}