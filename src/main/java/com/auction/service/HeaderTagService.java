package com.auction.service;

import com.auction.dao.HeaderTagMapper;
import com.auction.domain.Config;
import com.auction.domain.HeaderTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeaderTagService {

    @Autowired
    HeaderTagMapper headerTagMapper;


    
    public List<HeaderTag> getAllHeaderTags() {
        return headerTagMapper.selectAllUsedTag();
    }

    public HeaderTag getHeaderTagsById(int tagId) {
        return headerTagMapper.selectByPrimaryKey(tagId);
    }

}