package com.shop.service.impl;

import com.shop.common.pojo.EasyUITreeNode;
import com.shop.mapper.TbItemCatMapper;
import com.shop.pojo.TbItemCat;
import com.shop.pojo.TbItemCatExample;
import com.shop.pojo.TbItemCatExample.Criteria;
import com.shop.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ed on 2017/8/16.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId) {
        // 根据parentId查询分类列表
        TbItemCatExample example = new TbItemCatExample();
        //设置查询条件
        Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //执行查询
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        //转换成EasyUITreeNode列表
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (TbItemCat tbItemCat : list) {
            //创建一个节点对象
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            //添加到列表中
            resultList.add(node);
        }
        return resultList;
    }

}

