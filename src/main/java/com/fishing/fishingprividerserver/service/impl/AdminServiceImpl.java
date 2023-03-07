package com.fishing.fishingprividerserver.service.impl;

import com.fishing.fishingprividerserver.dao.AdminDao;
import com.fishing.fishingprividerserver.service.AdminService;

import javax.annotation.Resource;

public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;

}
