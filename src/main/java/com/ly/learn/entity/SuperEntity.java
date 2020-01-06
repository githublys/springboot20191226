package com.ly.learn.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName SuperEntity
 * @Description
 * @Author v_braveliu
 * @Date 2020/1/6
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class SuperEntity<T extends Model> extends Model<T> {
//    /**
//     * 主键ID
//     */
//    @TableId(type = IdType.ID_WORKER)
//    private Long id;
}
