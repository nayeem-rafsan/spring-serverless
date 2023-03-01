package com.dev.serverless.Functions;

import com.dev.serverless.Model.Subscriber;
import com.dev.serverless.Service.SubscriberService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
@AllArgsConstructor
public class Subscribers {

    private final SubscriberService subscriberService;
    @Bean
    public Supplier<List<Subscriber>> findAll(){
        return subscriberService::findAll;
    }
    @Bean
    public Consumer<Subscriber> create(){
        return subscriberService::create;
    }
    @Bean
    public Consumer<String> delete(){
        return subscriberService::delete;
    }
    @Bean
    public Consumer<Subscriber> update(){
        return subscriberService::update;
    }

}
