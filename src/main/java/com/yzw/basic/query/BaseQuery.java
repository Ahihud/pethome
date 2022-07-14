package com.yzw.basic.query;

import lombok.Data;

@Data
public class BaseQuery {
    private Integer currentPage=1;  //当前页
    private Integer pageSize=5; //每页显示的条数

    private Integer getBegin(){ //计算limit的第1个参数a    limit a,b；a=当前页的起始下标，b=每页显示的条数
        return (this.currentPage-1)*this.pageSize;  //a可能的取值0，5，10，15。。。
    }

}
