package com.hlb.web;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Fly on 2019/3/26.
 */
public class DownloadAction extends ActionSupport {
    private InputStream in;

    public void setIn(InputStream in) {
        this.in = in;
    }

    public InputStream getIn() throws FileNotFoundException {
        File file = new File("C:\\Users\\1\\Pictures");

        return new FileInputStream(file);
    }

    public String down() throws FileNotFoundException {
        //new File("D:\\java\\Idea\\Framework\\struts02\\src\\main\\webapp\\images\\",)
        File file = new File("D:\\java\\Idea\\Framework\\struts02\\src\\main\\webapp\\images\\image2");
        in = new FileInputStream(file);
        System.out.println(file);
        System.out.println(in);
        return SUCCESS;
    }

}