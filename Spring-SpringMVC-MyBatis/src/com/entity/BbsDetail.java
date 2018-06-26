package com.entity;
public class BbsDetail {
    private Long id;//ID
    private Integer amount;//购买数量
    private String color;// 颜色名称
    private String size;//尺码
    private Double price;//商品销售价
    private Long productId;//商品编号
    private Long orderId;//订单ID
    private String productName;//商品名称
    public BbsDetail() {
        super();
    }
    public BbsDetail(Long id,Integer amount,String color,String size,Double price,Long productId,Long orderId,String productName) {
        super();
        this.id = id;
        this.amount = amount;
        this.color = color;
        this.size = size;
        this.price = price;
        this.productId = productId;
        this.orderId = orderId;
        this.productName = productName;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
