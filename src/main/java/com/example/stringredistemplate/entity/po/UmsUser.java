package com.example.stringredistemplate.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 劳务系统用户信息表
 * </p>
 *
 * @author sword-dance
 * @since 2020-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ums_user")
public class UmsUser extends Model<UmsUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 用户昵称帐号
     */
    private String nickname;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 出生日期
     */
    private LocalDate birthday;

    /**
     * 性别
     */
    private String gender;

    /**
     * 头像
     */
    private String headPortrait;

    /**
     * 手机绑定时间
     */
    private LocalDateTime mobileBindTime;

    /**
     * 邮箱绑定时间
     */
    private LocalDateTime emailBindTime;

    /**
     * 最后登录时间
     */
    private LocalDateTime loginTime;

    /**
     * 用户状态 0 禁用 1启用
     */
    private String userStatus;

    /**
     * 创建人
     */
    private Integer createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private Integer updateBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 1 表示删除，0 表示未删除
     */
    private String delFlag;

    /**
     * 备注

     */
    private String remarks;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
