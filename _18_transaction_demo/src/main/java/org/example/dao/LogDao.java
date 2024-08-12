package org.example.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface LogDao {
    @Insert("insert tbl_log values(null, #{info}, now())")
    void log(String info);
}
