package com.fishing.fishingprividerserver.controller;

import com.example.fishingcommonapi.entites.AdminChecking;
import com.example.fishingcommonapi.entites.CommonResult;
import com.fishing.fishingprividerserver.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AdminController {
    @Resource
    private AdminService adminService;
    @PostMapping("/landing")
    public CommonResult<AdminChecking> LandingAdminTest(String admin,String password){
        int i = adminService.LandingAdmin(admin, password);
        if(i==1){
            return new CommonResult<AdminChecking>(200,"登陆成功");
        }else if(i==0) {
            return new CommonResult<AdminChecking>(404,"用户名不存在,请注册");
        }else if(i==-1){
            return new CommonResult<AdminChecking>(404,"密码错误,登录失败");
        }else {
            return new CommonResult<AdminChecking>(405,"未知错误");
        }
    }
    @GetMapping("/logout")
    public CommonResult<AdminChecking> LogoutAdmin(){
        adminService.logout();
        return new CommonResult<>(200,"成功退出登录");
    }
    @PostMapping("/register")
    public CommonResult<AdminChecking> registerAdmin(AdminChecking adminChecking){
       adminService.register(adminChecking);
       return new CommonResult<>(200,"注册成功");
    }
}
