package com.auction.controller;

import com.auction.domain.AuctionFile;
import com.auction.domain.Good;
import com.auction.domain.GoodImage;
import com.auction.service.FileService;
import com.auction.service.GoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/25.
 */
@Controller
@RequestMapping("/good")
public class GoodController {
    public static Logger logger = LoggerFactory.getLogger(GoodController.class);

    @Autowired
    GoodService goodService;
    @Autowired
    FileService fileService;

    @RequestMapping(value = "/create.do")
    public String upload(@RequestParam(value = "files", required = false) MultipartFile [] files, HttpServletRequest request, ModelMap model, Good good) {

        logger.info("开始");
        String path = request.getSession().getServletContext().getRealPath("upload");
        List<GoodImage> list = new ArrayList<GoodImage>();
        GoodImage goodImage = null;
        int count = 0;
        for(MultipartFile file: files){
            if(file.getSize() == 0){
                continue;
            }
            String fileName = file.getOriginalFilename();
            System.out.println(path);
            File targetFile = new File(path, fileName);
            if(!targetFile.exists()){
                targetFile.mkdirs();
            }
            try {
                file.transferTo(targetFile);
                AuctionFile auctionFile = new AuctionFile();
                if(count == 0){
                    Byte a = 1;
                    auctionFile.setImageStay(a);
                }
                auctionFile.setFilePath(targetFile.getPath());
                String url = fileService.saveFile(auctionFile);
                goodImage = new GoodImage();
                goodImage.setImageUrl(url);
                list.add(goodImage);
                count ++;
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
        good.setGoodImageList(list);
        int goodId =  goodService.createGood(good);
        good.setGoodId(goodId);
        model.addAttribute("good", good);
        return "result";
    }
}
