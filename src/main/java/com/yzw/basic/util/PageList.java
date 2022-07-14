package com.yzw.basic.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor  //无参构造
@AllArgsConstructor //全参构造
public class PageList<T> {
    private Integer totals=0;   //总数量，前端计算分页栏
    private List<T> data=new ArrayList<>(); //当前页的数据，前端显示数据的地方

}
