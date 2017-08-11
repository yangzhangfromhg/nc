package com.hg.service;

import com.hg.entity.AdminInfo;
import com.hg.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sstl on 2017/8/11.
 */
@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public List<AdminInfo> getAllAdmin(){
        return adminMapper.getAllAdmin();
    }

    public AdminInfo getAdminById(Integer id){
         //System.out.println(" # getAdminById : " + adminMapper.getAdminById(id).toString());
         Integer length = getAllAdmin().size();
         if(id <= length && id > 0){
             AdminInfo adminInfo = adminMapper.getAdminById(id);
             return adminInfo;
         }else{
             return new AdminInfo();
         }
    }
}
