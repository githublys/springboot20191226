package com.ly.learn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author braveliu
 * @since 2020-01-06
 */
@Data
@Accessors(chain = true)
@TableName("tb_admin_user")
public class TbAdminUserEntity{

    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;

    private String passwordMd5;

    private String userToken;

    private Boolean isDeleted;

    private Date createTime;


}
