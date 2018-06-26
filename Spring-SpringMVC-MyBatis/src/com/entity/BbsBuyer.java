package com.entity;
public class BbsBuyer {
    private Long id;//主键
    private Integer gender;//性别:0:保密,1:男,2:女
    private String town;//县ID
    private String city;//市ID
    private String realName;//真实名字
    private java.util.Date registerTime;//注册时间
    private String password;//密码
    private String province;//省ID
    private String phone;
    private Integer isDel;//是否已删除:1:未,0:删除了
    private String addr;//地址
    private String email;//邮箱
    private String username;//用户名
    public BbsBuyer() {
        super();
    }
    public BbsBuyer(Long id,Integer gender,String town,String city,String realName,java.util.Date registerTime,String password,String province,String phone,Integer isDel,String addr,String email,String username) {
        super();
        this.id = id;
        this.gender = gender;
        this.town = town;
        this.city = city;
        this.realName = realName;
        this.registerTime = registerTime;
        this.password = password;
        this.province = province;
        this.phone = phone;
        this.isDel = isDel;
        this.addr = addr;
        this.email = email;
        this.username = username;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public java.util.Date getRegisterTime() {
        return this.registerTime;
    }

    public void setRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getIsDel() {
        return this.isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
