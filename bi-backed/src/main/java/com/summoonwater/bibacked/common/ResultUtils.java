package com.summoonwater.bibacked.common;

/**
 * 返回工具类
 *
 * @author summoonwater
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data 返回的数据
     * @param <T>  返回的数据类型
     * @return BaseResponse
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }


    /**
     * 失败
     *
     * @param errorCode errorCode
     * @return BaseResponse
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code    errorCode
     * @param message message
     * @return BaseResponse
     */
    public static <T> BaseResponse<T> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode errorCode
     * @return BaseResponse
     */
    public static <T> BaseResponse<T> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}
