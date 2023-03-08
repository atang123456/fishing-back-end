package com.fishing.fishingprividerserver.service;

import com.example.fishingcommonapi.entites.AdminChecking;
import com.example.fishingcommonapi.entites.CommonResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface AdminService {
    int LandingAdmin(String admin,String passowrd);
    void logout();
    int register(AdminChecking adminChecking);
}
