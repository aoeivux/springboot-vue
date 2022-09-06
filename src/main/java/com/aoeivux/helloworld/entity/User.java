package com.aoeivux.helloworld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")//实际开发中，的Pojo常常与数据库的不一致，通过TableName,TableField统一，括号里面为数据库的字段名
public class User {
    @TableId(type = IdType.AUTO)//虽然数据库的ID可以Auto_Increment但是java层面获取的ID仍是0，需要设置type
    @TableField("id")
    private int id;
    @TableField("name")
    private String name;
    @TableField("birthday")
    private String birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
