package com.yzw.org.mapper;

import com.yzw.org.domain.Dept;
import com.yzw.org.query.DeptQuery;

import java.util.List;

public interface DeptMapper {
    //mapper的方法定义要贴近数据库
    //service的方法定义要贴近前端用户
    List<Dept> readAll();   //查，查询所有
    Dept readById(Long id); //查，查询id
    void create(Dept dept); //增，增加加1个对象
    void delete(Long id);   //删，根据id删除对象
    void update(Dept dept); //改，修改对象

    Integer queryCount(DeptQuery deptQuery);    //请求计数，查询中总条数，为了分页使用
    List<Dept> queryData(DeptQuery deptQuery);  //当前请求的数据
}
