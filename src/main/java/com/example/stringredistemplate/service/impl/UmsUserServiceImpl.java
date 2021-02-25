package com.example.stringredistemplate.service.impl;

import com.example.stringredistemplate.entity.po.UmsUser;
import com.example.stringredistemplate.mapper.UmsUserMapper;
import com.example.stringredistemplate.service.UmsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 劳务系统用户信息表 服务实现类
 * </p>
 *
 * @author sword-dance
 * @since 2020-11-23
 */
@Service
public class UmsUserServiceImpl extends ServiceImpl<UmsUserMapper, UmsUser> implements UmsUserService {

}
