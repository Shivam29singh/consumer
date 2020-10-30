package com.PODownload.Consumer.controller;

import com.PODownload.Consumer.model.POInfo;
import com.PODownload.Consumer.repository.POInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class POInfoResource {
   @Autowired
    private POInfoRepo poInfoRepo;

    @GetMapping("/POInfo/{poNumber}")
    public Optional<POInfo> getPOById(@PathVariable long poNumber) {
        return poInfoRepo.findById(poNumber);
    }
}