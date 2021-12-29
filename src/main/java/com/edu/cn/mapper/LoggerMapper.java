package com.edu.cn.mapper;

import com.edu.cn.beans.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author huangjingheng
 * @data 2021/12/29
 * @apiNote
 */

@Repository
public interface LoggerMapper {
    void saveLogger(Logger logger);
}
