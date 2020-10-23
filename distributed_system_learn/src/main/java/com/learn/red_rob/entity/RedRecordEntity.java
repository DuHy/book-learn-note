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
 * 发红包记录
 * </p>
 *
 * @author dhy
 * @since 2020-10-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("red_record")
public class RedRecordEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 红包全局唯一标识串
     */
    private String redPacket;

    /**
     * 人数
     */
    private Integer total;

    /**
     * 总金额（单位为分）
     */
    private BigDecimal amount;

    private Integer isActive;

    private LocalDateTime createTime;


}
