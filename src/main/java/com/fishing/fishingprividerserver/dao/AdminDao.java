package com.fishing.fishingprividerserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.fishingcommonapi.entites.AdminChecking;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends BaseMapper<AdminChecking> {

}
