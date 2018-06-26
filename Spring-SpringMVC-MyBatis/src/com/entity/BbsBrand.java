package com.entity;
public class BbsBrand {
    private Long id;//ID
    private String imgUrl;//图片Url
    private String name;//名称
    private Integer isDel;
    private String description;//描述
    private Integer sort;//排序:最大最排前
    private String webSite;//品牌网址
    private Integer isDisplay;//是否可见 1:可见 0:不可见
    public BbsBrand() {
        super();
    }
    public BbsBrand(Long id,String imgUrl,String name,Integer isDel,String description,Integer sort,String webSite,Integer isDisplay) {
        super();
        this.id = id;
        this.imgUrl = imgUrl;
        this.name = name;
        this.isDel = isDel;
        this.description = description;
        this.sort = sort;
        this.webSite = webSite;
        this.isDisplay = isDisplay;
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

    public Integer getIsDel() {
        return this.isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getWebSite() {
        return this.webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Integer getIsDisplay() {
        return this.isDisplay;
    }

    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

}
