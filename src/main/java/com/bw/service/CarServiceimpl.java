/**
 * Create Date:2019年12月23日
 */
package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.CarDao;
import com.bw.entity.Car;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:小明1114@qq.com)
 * <br>Date:2019年12月23日
 */
@Service
public class CarServiceimpl implements CarService{

  @Autowired
  private CarDao dao;

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:小明1114@qq.com)
   * <br>Date:2019年12月23日
   * @see com.bw.service.CarService#add(com.bw.entity.Car)
   */
  @Override
  public int add(Car car) {
    // TODO Auto-generated method stub
    return dao.add(car);
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:小明1114@qq.com)
   * <br>Date:2019年12月23日
   * @see com.bw.service.CarService#getList()
   */
  @Override
  public List<Car> getList() {
    // TODO Auto-generated method stub
    return dao.getList();
  }
  
  
}
