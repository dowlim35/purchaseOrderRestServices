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
        Training blank = new Training(null,null,null,null, null,null,null,null,null,null,null,0,0,0,0,null,null,0);

        archive.add(new Archive (1, FormType.TRAINING, AccountType.MISC, "AWS Training",  date , ArchiveStatus.ACCEPTED, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 )), null ));
        archive.add(new Archive (2, FormType.TRAINING, AccountType.TRAINING, "Git Training", date  , ArchiveStatus.PENDING, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 )), null));
        archive.add(new Archive (3, FormType.CONTRACTORS, AccountType.MISC, "", date , ArchiveStatus.ACCEPTED, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 )),null));
        archive.add(new Archive (4, FormType.TRAINING, AccountType.GRM, "Kotlin Training", date , ArchiveStatus.DENIED, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 )),null));
        archive.add(new Archive (5, FormType.TRAINING, AccountType.TRAINING, "Java Training", date , ArchiveStatus.PENDING, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 )),null));
        archive.add(new Archive (6, FormType.TRAVEL, AccountType.GCS, "Boston Trip", date , ArchiveStatus.DENIED, (new PurchaseOrder( "Michael Dowling","50 samsungTvs",5,"€", date ,400.0 )),null));
        return archive;
    }
}
