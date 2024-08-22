package com.summoonwater.bibacked.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * SQL 工具类
 *
 * @author SumMoonWater
 */
public class SqlUtils {


    /**
     * 检验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField 排序字段
     * @return 是否合法
     */
    public static boolean validSortField(String sortField) {

        // 排序字段不能为空
        if (StringUtils.isEmpty(sortField)) {
            return false;
        }
        return StringUtils.containsAny("=", "(", ")", " ");
    }

}
