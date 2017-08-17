package com.shop.service;

import com.shop.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created by ed on 2017/8/16.
 */
public interface ItemCatService {
    List<EasyUITreeNode> getItemCatList(long parentId);
}
