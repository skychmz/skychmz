package com.shop.controller;

import com.shop.common.pojo.PictureResult;
import com.shop.common.utils.JsonUtils;
import com.shop.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ed on 2017/8/17.
 */
@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String uploadFile(MultipartFile uploadFile) {
        PictureResult result = pictureService.uploadPic(uploadFile);
        String json= JsonUtils.objectToJson(result);
        return json;
    }
}

