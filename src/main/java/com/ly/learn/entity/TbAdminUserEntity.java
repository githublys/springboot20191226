package com.ly.learn.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author braveliu
 * @since 2020-01-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_admin_user")
public class TbAdminUserEntity extends SuperEntity {

    private static final long serialVersionUID = 1L;

    private String userName;

    private String passwordMd5;

    private String userToken;

    private Boolean isDeleted;

    private LocalDateTime createTime;


}
