package com.roncoo.eshop.one.web.controller;

import com.roncoo.eshop.one.service.EshopInventoryService;
import com.roncoo.eshop.one.service.EshopPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/one")
public class EshopOneServiceController {


    @Autowired
    private EshopInventoryService eshopInventoryService;

    @Autowired
    private EshopPriceService eshopPriceService;

    @RequestMapping("/findInventoryByProductId")
    @ResponseBody
    public String findInventoryByProductId(Long productId){
        return eshopInventoryService.findInventoryByProductId(productId);
    }


    @RequestMapping("/findPriceByProductId")
    @ResponseBody
    public String findPriceByProductId(Long productId){
        return eshopPriceService.findPriceByProductId(productId);
    }

}
