package com.sakura.project.service;

import com.sakura.project.common.util.JsonResult;
import com.sakura.project.common.util.PageData;

/**
 * @author 李七夜
 * Created by 李七夜 on 2020/8/30 14:54
 */
public interface MgUserLoginService {

    /**
     * 发送验证码
     * @param pageData
     * @return
     */
    JsonResult<PageData> sendCaptcha(PageData pageData);

    /**
     * 登录
     * @param pageData
     * @return
     */
    JsonResult<PageData> login(PageData pageData);

}
