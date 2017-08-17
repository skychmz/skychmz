package com.shop.service;

import com.shop.common.pojo.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ed on 2017/8/17.
 */
public interface PictureService {
    PictureResult uploadPic(MultipartFile picFile);
}
