package com.sakura.project.service;

import org.springframework.data.domain.Pageable;

import com.sakura.project.common.dto.MgUserInfoDto;
import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;
import com.sakura.project.common.util.PageResult;
import com.sakura.project.entity.MgUserInfo;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/28 16:53
 */
public interface MgUserService {

    /**
     * 获取单个用户信息
     * @param userId
     * @return
     */
    JsonResult<MgUserInfoDto> get(Integer userId);

    /**
     * 分页列表
     * @param pageable
     * @param pageData
     * @return
     */
    PageResult<MgUserInfoDto> list(Pageable pageable, PageData pageData);

    /**
     * 新增用户
     * @param mgUserInfo
     * @return
     */
    JsonResult<Boolean> add(MgUserInfo mgUserInfo);

    /**
     * 修改用户
     * @param mgUserInfo
     * @return
     */
    JsonResult<Boolean> update(MgUserInfo mgUserInfo);

    /**
     * 修改密码
     * @param pageData
     * @return
     */
    JsonResult<Boolean> updatePwd(PageData pageData);

    /**
     * 删除用户(支持批量删除)
     * @param userId
     * @return
     */
    JsonResult<Boolean> del(Integer... userId);

}
