package com.edu.cn.service.impl;

import com.edu.cn.beans.Logger;
import com.edu.cn.mapper.LoggerMapper;
import com.edu.cn.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangjingheng
 * @data 2021/12/29
 * @apiNote
 */
@Service
public class LoggerServiceImpl implements LoggerService {

    @Autowired
    private LoggerMapper loggerMapper;

    @Override
    public void saveLogger(Logger logger) {
        loggerMapper.saveLogger(logger);
    }
}
