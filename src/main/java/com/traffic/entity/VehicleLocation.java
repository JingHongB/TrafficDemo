package com.traffic.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("vehiclelocation")
public class VehicleLocation {
    @TableId(value = "id",type = IdType.AUTO)
    Integer id;
    @TableField("longitude")
    Double longitude;
    @TableField("latitude")
    Double latitude;
}
