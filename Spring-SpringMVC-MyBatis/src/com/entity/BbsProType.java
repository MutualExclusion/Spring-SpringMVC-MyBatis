package com.entity;
public class BbsProType {
    private Long id;
    private Long typeId;
    private Long productId;
    public BbsProType() {
        super();
    }
    public BbsProType(Long id,Long typeId,Long productId) {
        super();
        this.id = id;
        this.typeId = typeId;
        this.productId = productId;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return this.typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

}
