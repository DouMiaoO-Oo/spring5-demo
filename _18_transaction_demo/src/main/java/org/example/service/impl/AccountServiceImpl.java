package org.example.service.impl;

import org.example.dao.AccountDao;
import org.example.service.AccountService;
import org.example.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    @Override
//    @Transactional
    @Transactional(rollbackFor = Throwable.class)
    public void transfer(Integer outId, Integer inId, Double amt) {
        try{
            accountDao.outMoney(outId, amt);
            Integer i = 1/0;  // 制造异常
            accountDao.inMoney(inId, amt);
        }
//        catch (Exception e){  // 不能抛出异常
//            e.printStackTrace();
//        }
        finally {
            logService.log(outId, inId, amt);
        }
    }
}
