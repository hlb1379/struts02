package com.hlb.web;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by Fly on 2019/3/26.
 */
public class UploadAction extends ActionSupport {
    private File img01;
    private String img01FileName;
    private String img01ContentType;

    public void setImg01ContentType(String img01ContentType) {
        this.img01ContentType = img01ContentType;
    }

    public String getImg01ContentType() {
        return img01ContentType;
    }

    public void setImg01FileName(String img01FileName) {
        this.img01FileName = img01FileName;
    }

    public String getImg01FileName() {
        return img01FileName;
    }

    public void setImg01(File img01) {
        this.img01 = img01;
    }

    public File getImg01() {
        return img01;
    }

    public String upload() throws Exception{
        System.out.println("文件保存");
        FileUtils.copyFile(img01, new File("D:\\java\\Idea\\Framework\\struts02\\src\\main\\webapp\\images\\", img01FileName));
        //获取上传文件的类型
        System.out.println(img01ContentType);
        //获取文件上传的实际文件名
        System.out.println(img01FileName);
        System.out.println("文件上传成功");
        return SUCCESS;
    }
}