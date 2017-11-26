package com.auction.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.auction.dao.AuctionTimeLinePicMapper;
import com.auction.domain.AuctionTimeLinePic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.multipart.MultipartFile;  
  
@Controller
@RequestMapping("/file")
public class FileController extends AbstractController{

    @Autowired
    AuctionTimeLinePicMapper auctionTimeLinePicMapper;
    @RequestMapping(value = "down.do")
    public void upload(HttpServletRequest request, HttpServletResponse response ) {
    }

    @RequestMapping(value = "timeline/fetch")
    public void fetch(HttpServletRequest request, HttpServletResponse response,@RequestParam(value = "fileId", required = true) int fileId) throws FileNotFoundException {
        AuctionTimeLinePic pic = auctionTimeLinePicMapper.selectByPrimaryKey(fileId);
        down(response,pic.getPicPath());
    }
  
}  