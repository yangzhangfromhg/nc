package com.hg.mapper;

import com.hg.entity.AdminInfo;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * Created by sstl on 2017/8/11.
 */

public interface AdminMapper {

    List<AdminInfo> getAllAdmin();
    AdminInfo getAdminById(Integer id);

    int addAdmin(AdminInfo adminInfo);
    int updateAdmin(AdminInfo adminInfo);
    int deleteAdminById(Integer id);
}
