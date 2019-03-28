package com.hlb.web;

import com.opensymphony.xwork2.Action;

import java.util.Arrays;

/**
 * Created by Fly on 2019/3/25.
 */
public class Action03{
    private Integer[] ids;

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public String batchDel(){
        System.out.println(Arrays.toString(ids));
        return Action.SUCCESS;
    }

}