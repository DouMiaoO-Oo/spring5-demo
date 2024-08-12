package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountDao {
    @Update("update tbl_account set money = money + #{amt} where id = #{id}")
    void inMoney(@Param("id") Integer account_id, @Param("amt") double amt);

    @Update("update tbl_account set money = money - #{amt} where id = #{id}")
    void outMoney(@Param("id") Integer account_id, @Param("amt") double amt);
}
