package com.ly.learn.service.impl;

//
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ly.learn.entity.TbAdminUserEntity;
import com.ly.learn.mapper.TbAdminUserRepository;
import com.ly.learn.service.ITbAdminUserService;
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
public class TbAdminUserServiceImpl extends ServiceImpl<TbAdminUserRepository, TbAdminUserEntity> implements ITbAdminUserService {
   @Override
    public TbAdminUserEntity getById(int id) {
       TbAdminUserEntity e = new TbAdminUserEntity();
       e.setId(1L);
        return e;
    }
}
