package com.detroitlabs.apiproject.controller;

import com.detroitlabs.apiproject.model.MakeupRepo;
import com.detroitlabs.apiproject.service.MakeupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private MakeupService makeupService;


    @ResponseBody
    @RequestMapping("/")
    public String displayMakeup() {

        MakeupRepo makeupRepo = makeupService.fetchAllMakupAPI();
        String brand = makeupRepo.get(0).getBrand();
        return brand;
    }

}
