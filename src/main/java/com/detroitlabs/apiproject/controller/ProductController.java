package com.detroitlabs.apiproject.controller;

import com.detroitlabs.apiproject.model.MakeupProduct;
import com.detroitlabs.apiproject.model.MakeupRepo;
import com.detroitlabs.apiproject.service.MakeupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


@Controller
public class ProductController {

    @Autowired
    private MakeupService makeupService;

    @RequestMapping("/")
    public String displayMakeup(ModelMap modelMap) {

        MakeupRepo makeupRepo = makeupService.fetchAllMakupAPI();
        modelMap.put("allproducts",makeupRepo);

        List<MakeupProduct> oneProduct = new ArrayList<>();

        for(MakeupProduct product: makeupRepo){
            Collections.shuffle(makeupRepo);
            if (oneProduct.size() <= 15){
            oneProduct.add(product);
            }
        }
        modelMap.put("onephoto",oneProduct);

        return "index";
    }



    @RequestMapping("/products")
    public String displayBrands(ModelMap modelMap){
        MakeupRepo makeupRepo = makeupService.fetchAllMakupAPI();

        List<String> productType = new ArrayList<>();
        for(MakeupProduct product: makeupRepo){
            productType.add(product.getProduct_type());
        }
        HashSet<String> makeupProductSet = new HashSet<>(productType);
        ArrayList<String> makeupProductsNoDupilicates = new ArrayList<>(makeupProductSet);

        modelMap.put("productType",makeupProductsNoDupilicates);

        return "productType";

    }

//    @RequestMapping("/description/{productName}")
//    public String displayDescriptin(@PathVariable String productName, ModelMap modelMap){
//        MakeupRepo makeupRepo = makeupService.fetchAllMakupAPI();
//
//        ArrayList<MakeupProduct> productWithDescription = new ArrayList<>();
//        for (MakeupProduct makeupProduct: makeupRepo){
//            if(productName.equalsIgnoreCase(makeupProduct.getName())){
//                productWithDescription.add(makeupProduct);
//            }
//        }
//        modelMap.put("productDescription",productWithDescription);
//
//        return "description";
//
//    }


}
