package org.example.service.impl;

import org.example.dao.LogDao;
import org.example.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.transaction.annotation.Propagation.REQUIRES_NEW;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    @Override
    @Transactional(propagation=REQUIRES_NEW)
    public void log(Integer outId, Integer inId, Double amt) {
        String logStr = String.format("转账操作由%s到%s, 金额：%f", outId, inId, amt);
        System.out.println(logStr);
        logDao.log(logStr);
    }
}
