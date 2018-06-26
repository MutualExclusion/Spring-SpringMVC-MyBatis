package com.entity;

import java.util.Arrays;

public class BbsProduct {
    private Long id;//ID或商品编号
    private java.util.Date createTime;//添加时间
    private Integer isNew;//是否新品:0:旧品,1:新品
    private Integer isCommend;//推荐 1推荐 0 不推荐
    private Double weight;//重量 单位:克
    private Object description;//商品描述
    private Object packageList;//包装清单
    private Integer isShow;//上下架:0否 1是
    private String colors;//颜色集
    private Long brandId;//品牌ID
    private String sizes;//尺寸集
    private Object imgUrl;//商品图片集
    private String[] imgUrls;
    private Integer isHot;//是否热销:0,否 1:是
    private String name;//商品名称
    private Integer isDel;//是否删除:0删除,1,没删除
    public BbsProduct() {
        super();
    }
    public BbsProduct(Long id,java.util.Date createTime,Integer isNew,Integer isCommend,Double weight,Object description,Object packageList,Integer isShow,String colors,Long brandId,String sizes,Object imgUrl,Integer isHot,String name,Integer isDel) {
        super();
        this.id = id;
        this.createTime = createTime;
        this.isNew = isNew;
        this.isCommend = isCommend;
        this.weight = weight;
        this.description = description;
        this.packageList = packageList;
        this.isShow = isShow;
        this.colors = colors;
        this.brandId = brandId;
        this.sizes = sizes;
        this.imgUrl = imgUrl;
        this.isHot = isHot;
        this.name = name;
        this.isDel = isDel;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public java.util.Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	public Integer getIsNew() {
		return isNew;
	}
	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}
	public Integer getIsCommend() {
		return isCommend;
	}
	public void setIsCommend(Integer isCommend) {
		this.isCommend = isCommend;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Object getDescription() {
		return description;
	}
	public void setDescription(Object description) {
		this.description = description;
	}
	public Object getPackageList() {
		return packageList;
	}
	public void setPackageList(Object packageList) {
		this.packageList = packageList;
	}
	public Integer getIsShow() {
		return isShow;
	}
	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public Object getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(Object imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String[] getImgUrls() {
		return imgUrls;
	}
	public void setImgUrls(String[] imgUrls) {
		this.imgUrls = imgUrls;
	}
	public Integer getIsHot() {
		return isHot;
	}
	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	@Override
	public String toString() {
		return "BbsProduct [id=" + id + ", createTime=" + createTime + ", isNew=" + isNew + ", isCommend=" + isCommend
				+ ", weight=" + weight + ", description=" + description + ", packageList=" + packageList + ", isShow="
				+ isShow + ", colors=" + colors + ", brandId=" + brandId + ", sizes=" + sizes + ", imgUrl=" + imgUrl
				+ ", imgUrls=" + Arrays.toString(imgUrls) + ", isHot=" + isHot + ", name=" + name + ", isDel=" + isDel
				+ "]";
	}
    

}
