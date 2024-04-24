package com.traffic.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("GasStation")
public class GasStation {
    @TableId
    Integer id;
    @TableField("name")
    String name;
    @TableField("longitude")
    double longitude;
    @TableField("latitude")
    double latitude;
}
