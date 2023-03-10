package com.dev.serverless.Service;

import com.dev.serverless.Model.Subscriber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SubscriberService {
    private List<Subscriber> subscriberList = new ArrayList<>();
    private AtomicInteger id = new AtomicInteger(0);

    public List<Subscriber> findAll(){
        return subscriberList;
    }
    public void create(Subscriber subscriber){
        subscriberList.add(subscriber);
    }
    public void delete(String email){
        var target = subscriberList.stream().filter(subscriber -> subscriber.getEmail().equals(email)).findFirst().orElse(null);
        subscriberList.remove(target);
    }
    public void update(Subscriber subscriber){
        subscriberList.set(subscriber.getId(), subscriber);
    }
}
