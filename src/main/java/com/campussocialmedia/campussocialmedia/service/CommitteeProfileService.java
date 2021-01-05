package com.campussocialmedia.campussocialmedia.service;

import com.campussocialmedia.campussocialmedia.repository.CommitteeProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommitteeProfileService {
    
    @Autowired
    private CommitteeProfileRepository committeeProfileRepository; 
}
