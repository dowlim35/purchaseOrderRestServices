package com.purchaseOrders.services;

import com.purchaseOrders.model.Archive;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String addArchive(@RequestBody Archive newData) {
        archive.add(newData);
        return "Data had been added";   }
}
