package com.traffic.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("vehicle")
public class Vehicle {
    @TableId
    Integer id;
    @TableField("load")
    double load;
}
