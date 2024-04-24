package com.traffic.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("route")
public class Route {
    @TableId
    Integer id;
    @TableField("startname")
    String startName;
    @TableField("endname")
    String endName;
    @TableField("startlongitude")
    double startLongitude;
    @TableField("startlatitude")
    double startLatitude;
    @TableField("endlongitude")
    double endLongitude;
    @TableField("endlatitude")
    double endLatitude;
}
