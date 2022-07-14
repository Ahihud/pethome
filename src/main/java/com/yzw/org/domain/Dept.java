package com.yzw.org.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
//@NoArgsConstructor  无参构造
//@AllArgsConstructor 有参构造
public class Dept {
    //部门id
    private Long id;
    //部门编号
    private String sn;
    //部门名称
    private String name;
    //部门路径
    private String dirPath;
    //部门状态1=启用，0=禁用
    private Integer state;
    //部门经理id（employee）
    private Long manager_id;
    //employee对象 领导 manager_id
    private Ee manager;
    //上级部门id
    private Long parent_id;
    private Dept parent;
    //子集部门
    List<Dept> children = new ArrayList<>();
}
