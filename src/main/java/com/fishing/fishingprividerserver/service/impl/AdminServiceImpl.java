package com.fishing.fishingprividerserver.service.impl;

import com.example.fishingcommonapi.entites.AdminChecking;
import com.fishing.fishingprividerserver.dao.AdminDao;
import com.fishing.fishingprividerserver.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService

{
    @Resource
    private AdminDao adminDao;

    @Override
    public int LandingAdmin(String admin,String passowrd) {
        List<AdminChecking> adminCheckings = adminDao.selectList(null);
        for(AdminChecking adminChecking:adminCheckings ){
            if(adminChecking.getAdmin().equals(admin)){
                if (adminChecking.getPassword().equals(passowrd)){
                    System.out.println("登陆成功");
                    adminChecking.setStatus(1);
                    adminDao.updateById(adminChecking);
                    return 1;
                }else {
                    System.out.println("输入正确的密码");
                    return -1;
                }
            }else {
                System.out.println("请输入正确的管理员用户名");
                return 0;
            }
        }
        return 0;
    }

    @Override
    public void logout() {
        List<AdminChecking> adminCheckings = adminDao.selectList(null);
        for(AdminChecking adminChecking:adminCheckings ){
            if (adminChecking.getStatus().equals(1)){
                adminChecking.setStatus(0);
                adminDao.updateById(adminChecking);
            }
        }
    }

    @Override
    public int register(AdminChecking adminChecking) {
        adminDao.insert(adminChecking);
        return 1;
    }
}
