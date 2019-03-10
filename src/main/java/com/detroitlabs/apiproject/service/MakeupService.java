package com.detroitlabs.apiproject.service;

import com.detroitlabs.apiproject.model.MakeupProduct;
import com.detroitlabs.apiproject.model.MakeupRepo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MakeupService {

    public MakeupRepo fetchAllMakupAPI(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://makeup-api.herokuapp.com/api/v1/products.json", MakeupRepo.class);

        //get resource at the URI and map to forecast class
    }

}
