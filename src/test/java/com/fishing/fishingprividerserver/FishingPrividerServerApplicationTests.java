package com.fishing.fishingprividerserver;

import com.example.fishingcommonapi.entites.AdminChecking;
import com.fishing.fishingprividerserver.dao.AdminDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class FishingPrividerServerApplicationTests {
    @Resource
    private AdminDao adminDao;

    @Test
    void contextLoads() {
        List<AdminChecking> adminCheckings = adminDao.selectList(null);
        System.out.println(adminCheckings);
    }

}
