package com.entity;
public class BbsAdmin {
    private Long id;
    private String password;
    private Integer gender;
    private String phone;
    private String imgUrl;
    private String name;
    private String realName;
    private Integer power;//1:高级2:中级3:低级
    private String email;
    private java.util.Date registerTime;
    public BbsAdmin() {
        super();
    }
    public BbsAdmin(Long id,String password,Integer gender,String phone,String imgUrl,String name,String realName,Integer power,String email,java.util.Date registerTime) {
        super();
        this.id = id;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
        this.imgUrl = imgUrl;
        this.name = name;
        this.realName = realName;
        this.power = power;
        this.email = email;
        this.registerTime = registerTime;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getPower() {
        return this.power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.util.Date getRegisterTime() {
        return this.registerTime;
    }

    public void setRegisterTime(java.util.Date registerTime) {
        this.registerTime = registerTime;
    }
	@Override
	public String toString() {
		return "BbsAdmin [id=" + id + ", password=" + password + ", gender=" + gender + ", phone=" + phone + ", imgUrl="
				+ imgUrl + ", name=" + name + ", realName=" + realName + ", power=" + power + ", email=" + email
				+ ", registerTime=" + registerTime + "]";
	}
    
}
