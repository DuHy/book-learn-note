package com.learn.red_rob.entity;

import java.math.BigDecimal;
import com.learn.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 抢红包记录
 * </p>
 *
 * @author dhy
 * @since 2020-10-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("red_rob_record")
public class RedRobRecordEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户账号
     */
    private Integer userId;

    /**
     * 红包标识串
     */
    private String redPacket;

    /**
     * 红包金额（单位为分）
     */
    private BigDecimal amount;

    /**
     * 时间
     */
    private LocalDateTime robTime;

    private Integer isActive;


}
