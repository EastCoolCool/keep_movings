package com.lds.demo.mysql.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <p>
 *  CREATE TABLE `passengers_params` (
 *   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '存储过程编号',
 *   `shopId` int(11) DEFAULT NULL,
 *   `areaMin` varchar(30) NOT NULL COMMENT '1. 区域滞留最少人数AreaMin，最小为0，主要考虑商场正常时间内总体滞留不能太小',
 *   `beginTime` varchar(30) DEFAULT NULL COMMENT '3. 区域滞留清零开始时间AeraBeginTime，精确到分钟，此参数为从几点开始进行趋近于0的调节',
 *   `endTime` varchar(30) DEFAULT NULL COMMENT '2. 区域滞留清零结束时间AeraEndTime，精确到分钟，此参数可以与关门时间一样',
 *   `enable` smallint(6) DEFAULT '0' COMMENT '1:启用滞留调节,0:不起用滞留调节',
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COMMENT='存储过程日志操作';
 * <p>
 *
 * @author EastCool·Lee
 * @date 2021/11/22 上午10:34
 */
@TableName(value = "passengers_params")
@Data
public class PassengersParamsEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer shopId;

    private String beginTime;

    private String endTime;

    private Integer enable;

}
