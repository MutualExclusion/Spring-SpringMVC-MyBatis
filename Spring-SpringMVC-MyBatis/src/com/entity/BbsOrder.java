package com.entity;
public class BbsOrder {
    private Long id;//ID或订单号
    private Integer delivery;//送货时间
    private String note;//附言
    private Integer paymentWay;//支付方式 0:到付 1:在线 2:邮局 3:公司转帐
    private Double totalPrice;//应付金额
    private Double orderPrice;//订单金额
    private Integer isPaiy;//支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败
    private Long buyerId;//用户ID
    private Integer paymentCash;//货到付款方式.1现金,2POS刷卡
    private Integer isConfirm;//是否电话确认 1:是  0: 否
    private Double deliverFee;//运费
    private java.util.Date createDate;//订单生成时间
    private Integer orderState;//订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货
    public BbsOrder() {
        super();
    }
    public BbsOrder(Long id,Integer delivery,String note,Integer paymentWay,Double totalPrice,Double orderPrice,Integer isPaiy,Long buyerId,Integer paymentCash,Integer isConfirm,Double deliverFee,java.util.Date createDate,Integer orderState) {
        super();
        this.id = id;
        this.delivery = delivery;
        this.note = note;
        this.paymentWay = paymentWay;
        this.totalPrice = totalPrice;
        this.orderPrice = orderPrice;
        this.isPaiy = isPaiy;
        this.buyerId = buyerId;
        this.paymentCash = paymentCash;
        this.isConfirm = isConfirm;
        this.deliverFee = deliverFee;
        this.createDate = createDate;
        this.orderState = orderState;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDelivery() {
        return this.delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPaymentWay() {
        return this.paymentWay;
    }

    public void setPaymentWay(Integer paymentWay) {
        this.paymentWay = paymentWay;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getOrderPrice() {
        return this.orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getIsPaiy() {
        return this.isPaiy;
    }

    public void setIsPaiy(Integer isPaiy) {
        this.isPaiy = isPaiy;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getPaymentCash() {
        return this.paymentCash;
    }

    public void setPaymentCash(Integer paymentCash) {
        this.paymentCash = paymentCash;
    }

    public Integer getIsConfirm() {
        return this.isConfirm;
    }

    public void setIsConfirm(Integer isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Double getDeliverFee() {
        return this.deliverFee;
    }

    public void setDeliverFee(Double deliverFee) {
        this.deliverFee = deliverFee;
    }

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    public Integer getOrderState() {
        return this.orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

}
