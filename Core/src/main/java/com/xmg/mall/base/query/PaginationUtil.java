package com.xmg.mall.base.query;

/**
 * Created by lony on 2016/11/11.
 */
public class PaginationUtil {

    public  static int getPages(int rows, int pageSize){
        return (rows + pageSize - 1) / pageSize;
    }

}
