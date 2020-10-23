package com.learn.red_rob.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.learn.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 红包明细金额
 * </p>
 *
 * @author dhy
 * @since 2020-10-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("red_detail")
public class RedDetailEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 红包记录id
     */
    private Integer recordId;

    /**
     * 金额（单位为分）
     */
    private BigDecimal amount;

    private Integer isActive;

    private LocalDateTime createTime;


}
