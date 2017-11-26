package com.auction.dao;

import com.auction.domain.Config;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigMapper {
    int deleteByPrimaryKey(Integer configId);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Integer configId);

    Config selectByConfigKey(String configKey);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}