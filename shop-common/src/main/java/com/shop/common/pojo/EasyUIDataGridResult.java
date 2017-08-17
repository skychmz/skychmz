package com.shop.common.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by ed on 2017/8/16.
 */
public class EasyUIDataGridResult {
     private long total;
    private List<?> rows;
    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}




