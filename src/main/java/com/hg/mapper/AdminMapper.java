package com.hg.mapper;

import com.hg.entity.AdminInfo;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * Created by sstl on 2017/8/11.
 */

public interface AdminMapper {

    public List<AdminInfo> getAllAdmin();
    public AdminInfo getAdminById(Integer id);
}
