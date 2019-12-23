/**
 * Create Date:2019年12月22日
 */
package com.bw.entity;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:小明1114@qq.com)
 * <br>Date:2019年12月22日
 */
public class Car {

  private Integer id;
  private String carnum;
  private String lx;
  private Double j;
  private Double w;
  private String sj;
  private String name;
  private String phone;
  private String yy;
  private String num;
  private String address;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getCarnum() {
    return carnum;
  }
  public void setCarnum(String carnum) {
    this.carnum = carnum;
  }
  public String getLx() {
    return lx;
  }
  public void setLx(String lx) {
    this.lx = lx;
  }
  public Double getJ() {
    return j;
  }
  public void setJ(Double j) {
    this.j = j;
  }
  public Double getW() {
    return w;
  }
  public void setW(Double w) {
    this.w = w;
  }
  public String getSj() {
    return sj;
  }
  public void setSj(String sj) {
    this.sj = sj;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getYy() {
    return yy;
  }
  public void setYy(String yy) {
    this.yy = yy;
  }
  public String getNum() {
    return num;
  }
  public void setNum(String num) {
    this.num = num;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public Car(Integer id, String carnum, String lx, Double j, Double w, String sj, String name, String phone,
    String yy, String num, String address) {
    super();
    this.id = id;
    this.carnum = carnum;
    this.lx = lx;
    this.j = j;
    this.w = w;
    this.sj = sj;
    this.name = name;
    this.phone = phone;
    this.yy = yy;
    this.num = num;
    this.address = address;
  }
  public Car(String carnum, String lx, Double j, Double w, String sj, String name, String phone, String yy,
    String num, String address) {
    super();
    this.carnum = carnum;
    this.lx = lx;
    this.j = j;
    this.w = w;
    this.sj = sj;
    this.name = name;
    this.phone = phone;
    this.yy = yy;
    this.num = num;
    this.address = address;
  }
  public Car() {
    super();
    // TODO Auto-generated constructor stub
  }
  @Override
  public String toString() {
    return "Car [id=" + id + ", carnum=" + carnum + ", lx=" + lx + ", j=" + j + ", w=" + w + ", sj=" + sj
      + ", name=" + name + ", phone=" + phone + ", yy=" + yy + ", num=" + num + ", address=" + address + "]";
  }
 
  
}
