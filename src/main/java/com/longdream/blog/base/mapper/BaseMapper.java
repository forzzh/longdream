package com.longdream.blog.base.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zhaozhihang
 * @date 2017/5/16
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper {
}
