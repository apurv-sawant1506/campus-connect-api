package com.campussocialmedia.campussocialmedia.controllers;

import com.campussocialmedia.campussocialmedia.service.CommitteeProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CommitteeProfileController {
    @Autowired
    private CommitteeProfileService committeeProfileService;

    // @GetMapping

}
