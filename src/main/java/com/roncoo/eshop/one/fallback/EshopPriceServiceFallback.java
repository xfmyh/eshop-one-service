package com.roncoo.eshop.one.fallback;

import com.roncoo.eshop.one.service.EshopPriceService;
import org.springframework.stereotype.Component;

@Component
public class EshopPriceServiceFallback implements EshopPriceService {

    @Override
    public String findPriceByProductId(Long productId) {
        return "降级数据";
    }
}
