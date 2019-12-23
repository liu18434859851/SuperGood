/**
 * Create Date:2019年12月23日
 */
package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bw.entity.Car;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:小明1114@qq.com)
 * <br>Date:2019年12月23日
 */
public interface CarDao {

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:小明1114@qq.com)
   * <br>Date:2019年12月23日
   * @param car
   * @return
   */
  @Insert("insert into yklx_car values(null,#{CarNum},#{lx},#{j},#{w},#{sj},#{name},#{phone},#{yy},#{Num},#{address})")
  int add(Car car);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:小明1114@qq.com)
   * <br>Date:2019年12月23日
   * @return
   */
  
  List<Car> getList();

}
