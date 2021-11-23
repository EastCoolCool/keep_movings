package com.lds.demo.mysql.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * <p>
 *  CREATE TABLE `t2021_11_ivas_33010` (
 *   `id` bigint(20) NOT NULL AUTO_INCREMENT,
 *   `channel` int(11) DEFAULT NULL,
 *   `name` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
 *   `in_num` int(11) DEFAULT NULL,
 *   `out_num` int(11) DEFAULT NULL,
 *   `record_time` datetime DEFAULT NULL,
 *   `in_numptall` int(11) DEFAULT NULL,
 *   `in_numpt1` int(11) DEFAULT NULL,
 *   `in_numpt2` int(11) DEFAULT NULL,
 *   `in_numpt3` int(11) DEFAULT NULL,
 *   `in_numdy` int(11) DEFAULT NULL,
 *   `out_numdy` int(11) DEFAULT NULL,
 *   PRIMARY KEY (`id`) USING BTREE
 * ) ENGINE=InnoDB AUTO_INCREMENT=35594 DEFAULT CHARSET=utf8mb4;
 * <p>
 *
 * @author EastCool·Lee
 * @date 2021/11/22 上午10:56
 */
@Data
public class IVasEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer channel;

    private String name;

    private Integer inNum;

    private Integer outNum;

    private String recordTime;

    private Integer inNumpt1;
    private Integer inNumpt2;
    private Integer inNumpt3;
    private Integer inNumdy;
    private Integer outNumdy;
}
