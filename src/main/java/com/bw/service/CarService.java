/**
 * Create Date:2019年12月23日
 */
package com.bw.service;

import java.util.List;

import com.bw.entity.Car;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:小明1114@qq.com)
 * <br>Date:2019年12月23日
 */
public interface CarService {

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:小明1114@qq.com)
   * <br>Date:2019年12月23日
   * @param car
   * @return
   */
  int add(Car car);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:小明1114@qq.com)
   * <br>Date:2019年12月23日
   * @return
   */
  List<Car> getList();

}
