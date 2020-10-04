package com.roncoo.eshop.one.fallback;

import com.roncoo.eshop.one.service.EshopInventoryService;
import org.springframework.stereotype.Component;

@Component
public class EshopInventoryServiceFallback implements EshopInventoryService {

    @Override
    public String findInventoryByProductId(Long productId) {
        return "降级数据";
    }
}
