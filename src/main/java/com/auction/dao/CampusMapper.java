package com.auction.dao;

import com.auction.domain.Campus;
import org.springframework.stereotype.Repository;

@Repository
public interface CampusMapper {
    int deleteByPrimaryKey(Integer campusId);

    int insert(Campus record);

    int insertSelective(Campus record);

    Campus selectByPrimaryKey(Integer campusId);

    int updateByPrimaryKeySelective(Campus record);

    int updateByPrimaryKey(Campus record);
}