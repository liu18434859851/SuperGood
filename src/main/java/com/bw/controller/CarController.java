/**
 * Create Date:2019年12月23日
 */
package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.dao.CarDao;
import com.bw.entity.Car;
import com.bw.service.CarService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:小明1114@qq.com)
 * <br>Date:2019年12月23日
 */
@Controller
public class CarController {

  @Autowired
  private CarService ser;
  
  //添加
  @RequestMapping("add.do")
  public String add(Car car){
    int i=ser.add(car);
    return"redirect:list.do";
  }
  
  
  
  @RequestMapping("list.do")
  public String GetList(Model model,@RequestParam(defaultValue="1")Integer pageNum){
    PageHelper.startPage(pageNum, 4);
    List<Car>list=ser.getList();
    PageInfo page=new PageInfo(list);
    model.addAttribute("page", page);
    return"list";
  }
}
