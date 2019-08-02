package com.purchaseOrders;

import com.purchaseOrders.model.PurchaseOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class PurchaseConfig {

    @Bean(name="purchaseData")
    public List<PurchaseOrder> addingData() {
        List<PurchaseOrder> purchases = new ArrayList<>();

        purchases.add(new PurchaseOrder("John Dolan", "Hp Laptops", 5, "£", new Date(), 50000.00 ));
        purchases.add(new PurchaseOrder("Aoife Dolan", "Hp Laptops", 5, "£", new Date(), 1010.50 ));
        purchases.add(new PurchaseOrder("Lily Dolan", "Hp Laptops", 5, "$", new Date(), 1005.50  ));
        purchases.add(new PurchaseOrder("Johnathan Martin", "Hp Laptops", 5, "£", new Date(), 1220.50  ));
        purchases.add(new PurchaseOrder("Orla Murphy", "Hp Laptops", 6, "€", new Date(), 1000.50  ));
        purchases.add(new PurchaseOrder("Michael Anderson", "Hp Laptops", 5, "£", new Date(), 1200.50  ));
        purchases.add(new PurchaseOrder("Louise Flynn", "Hp Laptops", 5, "£", new Date(), 1100.50  ));
        purchases.add(new PurchaseOrder("Timothy Samantha", "Hp Laptops", 5, "£", new Date(), 1400.50  ));
        purchases.add(new PurchaseOrder("Joe Bloggs", "Hp Laptops", 5, "€", new Date(), 1700.50  ));

        return purchases;
    }
}
