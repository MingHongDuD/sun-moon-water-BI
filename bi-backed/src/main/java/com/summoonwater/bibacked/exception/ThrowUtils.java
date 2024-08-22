package com.summoonwater.bibacked.exception;

import com.yupi.yucongming.dev.common.ErrorCode;

/**
 * 抛异常工具类
 *
 * @author summoonwater
 */
public class ThrowUtils {

    /**
     * 条件成立则抛异常
     *
     * @param condition        条件是否成立
     * @param runtimeException 要抛的运行时异常
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition 条件是否成立
     * @param errorCode 错误码
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    /**
     * 条件成立则抛异常
     *
     * @param condition 条件是否成立
     * @param errorCode 错误码
     * @param message 消息
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }

}
