package com.purchaseOrders;


import com.purchaseOrders.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class ArchiveConfig {

    @Bean(name="archiveData")
    public List<Archive> addingData() {

        List<Archive> archive = new ArrayList<>();
        Date date = new Date();

        archive.add(new Archive (1, FormType.TRAINING, AccountType.MISC, "This is dummy Data",  date , ArchiveStatus.ACCEPTED, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 ))));
        archive.add(new Archive (2, FormType.TRAINING, AccountType.TRAINING, "This is dummy Data", date  , ArchiveStatus.PENDING, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 ))));
        archive.add(new Archive (3, FormType.CONTRACTORS, AccountType.MISC, "This is dummy Data", date , ArchiveStatus.ACCEPTED, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 ))));
        archive.add(new Archive (4, FormType.TRAINING, AccountType.GRM, "This is dummy Data", date , ArchiveStatus.DENIED, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 ))));
        archive.add(new Archive (5, FormType.TRAINING, AccountType.TRAINING, "This is dummy Data", date , ArchiveStatus.PENDING, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 ))));
        archive.add(new Archive (6, FormType.TRAVEL, AccountType.GCS, "This is dummy Data", date , ArchiveStatus.DENIED, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 ))));
        return archive;
    }
}
