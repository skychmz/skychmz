package com.shop.service;

import com.shop.common.pojo.EasyUIDataGridResult;
import com.shop.pojo.TbItem;

/**
 * Created by ed on 2017/8/15.
 */
public interface ItemService {
    public TbItem getItemById(Long itemId);
    public EasyUIDataGridResult getItemList(int page, int rows);
}
