package com.hhly.skeleton.base.util;

/**
 * @author lgs on
 * @version 1.0
 * @desc
 * @date 2017/12/5.
 * @company 益彩网络科技有限公司
 */
public class UserInfoBOUtil {

    /**
     * 获取头像地址
     *
     * @param headUrl
     * @param httpHead
     * @return
     */
    public static String getHeadUrl(String headUrl, String httpHead) {
        if (!ObjectUtil.isBlank(headUrl)) {
            if (headUrl.contains("http")) {
                return headUrl;
            } else {
                return httpHead + headUrl;
            }
        }
        return null;
    }
}
