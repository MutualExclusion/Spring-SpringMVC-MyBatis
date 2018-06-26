package com.entity;
public class BbsColor {
    private Long id;//ID
    private String imgUrl;//颜色对应的衣服小图
    private Long parentId;//父ID为色系
    private String name;//名称
    public BbsColor() {
        super();
    }
    public BbsColor(Long id,String imgUrl,Long parentId,String name) {
        super();
        this.id = id;
        this.imgUrl = imgUrl;
        this.parentId = parentId;
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

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
