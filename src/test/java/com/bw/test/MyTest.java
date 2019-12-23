/**
 * Create Date:2019年12月22日
 */
package com.bw.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.dao.CarDao;
import com.bw.entity.Car;
import com.bw.utils.GPSUtil;
import com.bw.utils.NumberUtil;
import com.bw.utils.WeekUtil;
import com.lzy.weekutils.CSVUtils;
import com.lzy.weekutils.StringUtils;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:小明1114@qq.com)
 * <br>Date:2019年12月22日
 */
public class MyTest {


  @Test
  public void TestOne(){
    ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("spring.xml");
    CarDao dao = c.getBean(CarDao.class);
      // 天安门经纬度
     String tamJD = "116.39746999999998";
     String tamWD = "39.90958013090996";
      List<Car>list=new ArrayList<>();
      List<String> csv = CSVUtils.importCsv(new File("e:\\monthA.csv"));
      for (String ss : csv) {
      
        String[] s = ss.split(",");
        //截取车牌,判断
        String CarBegin = s[0].substring(0, 1);
        if (CarBegin.equals("京") && s[1].equals("C")) {//京牌小轿车
          if (StringUtils.isNumber(s[0].substring(s[0].length()-1))) {//车盘尾号是数字
            
            Boolean oddNumber = NumberUtil.isOddNumber(Integer.parseInt(
              s[0].substring(s[0].length()-1)));//尾号奇偶数
            
            boolean b = WeekUtil.isOddDayOfWeekFromDateTime(s[4]);//日期判断星期奇偶数
            if (b!=oddNumber) {//非字母单双号
              Car car=new Car(s[0], s[1], Double.valueOf(s[2]),  Double.valueOf(s[3]),
                s[4], s[5], s[6], "单双号限行", s[0].substring(s[0].length()-1),"");
             
             list.add(car);
            }
          } else{
            boolean b = WeekUtil.isOddDayOfWeekFromDateTime(s[4]);//日期判断星期奇偶数
            if (b!=true) {//字母单双号
              Car car=new Car(s[0], s[1], Double.valueOf(s[2]),  Double.valueOf(s[3]),
                s[4], s[5], s[6], "字母为奇数,单双号限行", s[0].substring(s[0].length()-1),"");
             
             list.add(car);
            }
          }
          
          
          
        }else if (CarBegin.equals("京") && s[1].equals("A")) {//京A类摩托车
          double d = GPSUtil.getDistance(tamJD, tamWD, s[2],s[3]);
          if (d<15) {
            Car car=new Car(s[0], s[1], Double.valueOf(s[2]),  Double.valueOf(s[3]),
              s[4], s[5], s[6], "京牌A类摩托车违章进入2环", s[0].substring(s[0].length()-1),"2环以内");
           
            list.add(car);
          }
        }else if (CarBegin.equals("京") && s[1].equals("B")) {//京B类摩托车
          double d = GPSUtil.getDistance(tamJD, tamWD, s[2],s[3]);
          if (d<40) {
            Car car=new Car(s[0], s[1], Double.valueOf(s[2]),  Double.valueOf(s[3]),
              s[4], s[5], s[6], "京牌B类摩托车违章进入4环", s[0].substring(s[0].length()-1),"4环以内");
           
            list.add(car);
          }
        }else if (!CarBegin.equals("京") && s[1].equals("C")) {//外省汽车
        double d = GPSUtil.getDistance(tamJD, tamWD, s[2],s[3]);
        if (d<60) {
          Car car=new Car(s[0], s[1], Double.valueOf(s[2]),  Double.valueOf(s[3]),
            s[4], s[5], s[6], "外省汽车违章进入5环", s[0].substring(s[0].length()-1),"5环以内");
         
          list.add(car);
        }
      }
        
        
        
      }
      for (Car a : list) {
        dao.add(a);
      }
  }
}
