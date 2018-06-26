package com.entity;
public class BbsSku {
    private Long id;//ID
    private Double deliveFee;//运费 默认10元
    private Long colorId;//颜色ID
    private String size;//尺码
    private java.util.Date createTime;
    private Double price;//售价
    private Long productId;//商品ID
    private Double marketPrice;//市场价
    private Integer upperLimit;//购买限制
    private Integer stock;//库存
    public BbsSku() {
        super();
    }
    public BbsSku(Long id,Double deliveFee,Long colorId,String size,java.util.Date createTime,Double price,Long productId,Double marketPrice,Integer upperLimit,Integer stock) {
        super();
        this.id = id;
        this.deliveFee = deliveFee;
        this.colorId = colorId;
        this.size = size;
        this.createTime = createTime;
        this.price = price;
        this.productId = productId;
        this.marketPrice = marketPrice;
        this.upperLimit = upperLimit;
        this.stock = stock;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDeliveFee() {
        return this.deliveFee;
    }

    public void setDeliveFee(Double deliveFee) {
        this.deliveFee = deliveFee;
    }

    public Long getColorId() {
        return this.colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Double getMarketPrice() {
        return this.marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getUpperLimit() {
        return this.upperLimit;
    }

    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

}
