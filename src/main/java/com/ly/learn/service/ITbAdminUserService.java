package com.ly.learn.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ly.learn.entity.TbAdminUserEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author braveliu
 * @since 2020-01-06
 */
public interface ITbAdminUserService extends IService<TbAdminUserEntity> {
   TbAdminUserEntity get(int id);
}
