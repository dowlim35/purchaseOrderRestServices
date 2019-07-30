package com.purchaseOrders.services;


import com.purchaseOrders.model.PurchaseOrder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseService {
    @Resource(name="purchaseData")
    private List<PurchaseOrder> purchases;

    @GetMapping
    public List<PurchaseOrder> allPurchases(){return purchases; }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String addPurchases(@RequestBody PurchaseOrder newData){
        purchases.add(newData);
                return "Purchase Data has been added";
    }

}
