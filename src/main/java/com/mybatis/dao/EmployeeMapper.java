/**
 * Copyright (C), 2015-2019, 中信银行有限公司
 * FileName: EmployeeMapper
 * Author:   willem
 * Date:     2019-05-30 14:52
 * Description: mapper影射文件
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mybatis.dao;

import com.mybatis.entity.Employee;

/**
 * 〈一句话功能简述〉<br> 
 * 〈mapper影射文件〉
 *
 * @author willem
 * @create 2019-05-30
 * @since 1.0.0
 */
public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);
}
