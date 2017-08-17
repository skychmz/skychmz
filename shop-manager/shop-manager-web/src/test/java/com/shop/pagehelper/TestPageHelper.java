package com.shop.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.mapper.TbItemMapper;
import com.shop.pojo.TbItem;
import com.shop.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ed on 2017/8/16.
 */
public class TestPageHelper {
    @Test
    public void testPageHelper() throws Exception{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        TbItemMapper tbItemMapper=applicationContext.getBean(TbItemMapper.class);
        PageHelper.startPage(1,30);
        TbItemExample example=new TbItemExample();
        List<TbItem> list=tbItemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo=new PageInfo<TbItem>(list);
        long total=pageInfo.getTotal();
        System.out.println("total:"+total);
        int pages=pageInfo.getPages();
        System.out.println("pages:"+pages);
        int pageSize = pageInfo.getPageSize();
        System.out.println("pageSize:" + pageSize);

    }
}
