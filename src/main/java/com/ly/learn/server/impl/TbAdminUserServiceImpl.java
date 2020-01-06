package com.ly.learn.server.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.learn.entity.TbAdminUserEntity;
import com.ly.learn.mapper.TbAdminUserMapper;
import com.ly.learn.server.ITbAdminUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author braveliu
 * @since 2020-01-06
 */
@Slf4j
@Service
public class TbAdminUserServiceImpl extends ServiceImpl<TbAdminUserMapper, TbAdminUserEntity> implements ITbAdminUserService {
//    public TbAdminUserEntity get(int id) {
//        return getById(id);
//    }
}
