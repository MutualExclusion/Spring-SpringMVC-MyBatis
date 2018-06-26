package com.entity;
public class BbsType {
    private Long id;
    private String imgUrl;//图片url地址
    private String name;//类型名
    public BbsType() {
        super();
    }
    public BbsType(Long id,String imgUrl,String name) {
        super();
        this.id = id;
        this.imgUrl = imgUrl;
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
