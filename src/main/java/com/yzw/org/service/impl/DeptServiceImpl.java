package com.yzw.org.service.impl;

import com.yzw.basic.util.PageList;
import com.yzw.org.domain.Dept;
import com.yzw.org.mapper.DeptMapper;
import com.yzw.org.query.DeptQuery;
import com.yzw.org.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> readAll() {
        return deptMapper.readAll();
    }

    @Override
    public Dept readById(Long id) {
        return deptMapper.readById(id);
    }

    @Override
    @Transactional
    public void create(Dept dept) {
        deptMapper.create(dept);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        deptMapper.delete(id);
    }

    @Override
    @Transactional
    public void update(Dept dept) {
        deptMapper.update(dept);
    }

    @Override
    public PageList<Dept> queryPage(DeptQuery deptQuery) {
        Integer count = deptMapper.queryCount(deptQuery);   //先查询总量
        if(count==null || count==0){    //没有数据
            return new PageList<>();
        }
        List<Dept> depts = deptMapper.queryData(deptQuery); //再查询当前页的分页数据
        return new PageList<>(count,depts);
    }
}
