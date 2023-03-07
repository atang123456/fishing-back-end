package com.fishing.fishingprividerserver.controller;

import com.fishing.fishingprividerserver.service.AdminService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AdminController {
    @Resource
    private AdminService adminService;
}
