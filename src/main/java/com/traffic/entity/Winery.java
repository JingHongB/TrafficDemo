package com.traffic.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("winery")
public class Winery {
    @TableId
    Integer id;
    @TableField("name")
    String name;
    @TableField("longitude")
    Double longitude;
    @TableField("latitude")
    Double latitude;
}
