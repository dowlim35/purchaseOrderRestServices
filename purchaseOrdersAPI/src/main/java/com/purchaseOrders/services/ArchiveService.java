package com.purchaseOrders.services;

import com.purchaseOrders.model.Archive;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/archive")
//@CrossOrigin(origins = "http://localhost:4200")
public class ArchiveService {
    @Resource(name="archiveData")
    private List<Archive> archive;

    @GetMapping
    public List<Archive> allArchive(){
        return archive;
    }
}
