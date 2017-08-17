package com.shop.controller;

import com.shop.common.pojo.EasyUIDataGridResult;
import com.shop.pojo.TbItem;
import com.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ed on 2017/8/15.
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    private TbItem getItemById(@PathVariable Long itemId) {
        TbItem item = itemService.getItemById(itemId);
        return item;
    }
    /**
     * 查询商品列表
     * <p>Title: getItemList</p>
     * <p>Description: </p>
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(@RequestParam(defaultValue="1") Integer page,
                                            @RequestParam(defaultValue="30") Integer rows) {
        //调用service查询商品列表
        EasyUIDataGridResult result = itemService.getItemList(page, rows);
        //返回结果
        return result;

    }
}

