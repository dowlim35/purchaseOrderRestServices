package com.purchaseOrders;


import com.purchaseOrders.model.AccountType;
import com.purchaseOrders.model.Archive;
import com.purchaseOrders.model.ArchiveStatus;
import com.purchaseOrders.model.FormType;
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

        archive.add(new Archive (1, FormType.TRAINING, AccountType.MISC, "This is dummy Data",  date , ArchiveStatus.ACCEPTED));
        archive.add(new Archive (2, FormType.TRAINING, AccountType.TRAINING, "This is dummy Data", date  , ArchiveStatus.PENDING));
        archive.add(new Archive (3, FormType.CONTRACTORS, AccountType.MISC, "This is dummy Data", date , ArchiveStatus.ACCEPTED));
        archive.add(new Archive (4, FormType.TRAINING, AccountType.MISC, "This is dummy Data", date , ArchiveStatus.DENIED));
        archive.add(new Archive (5, FormType.TRAINING, AccountType.TRAINING, "This is dummy Data", date , ArchiveStatus.PENDING));
        archive.add(new Archive (6, FormType.TRAVEL, AccountType.MISC, "This is dummy Data", date , ArchiveStatus.DENIED));
        return archive;
    }
}
