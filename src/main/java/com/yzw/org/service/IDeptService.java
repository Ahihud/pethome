package com.yzw.org.service;

import com.yzw.basic.util.PageList;
import com.yzw.org.domain.Dept;
import com.yzw.org.query.DeptQuery;

import java.util.List;

public interface IDeptService {
    List<Dept> readAll();   //查，查询所有
    Dept readById(Long id); //查，查询id
    void create(Dept dept); //增，增加加1个对象
    void delete(Long id);   //删，根据id删除对象
    void update(Dept dept); //改，修改对象

    PageList<Dept> queryPage(DeptQuery deptQuery);
}
