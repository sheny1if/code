package com.example.code.utils;


import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

/**
 *  @Description 返回应答信息的工具类
 *  @author xunzhang
 *  @Date 2020.08.08 16:42
 */
public class ResultUtil {
    private static final String SUCCESS_CODE = "0000";
    private static final String SUCCESS_DESC = "操作成功";
    private static final String FAIL_CODE = "9999";
    private static final String FAIL_DESC = "操作失败";
    /**
     * @description 默认操作成功的应答
     * @return 应答信息
     * @author xunzhang
     * @date 2020.08.08 17:00
     */
    public static JSONObject success(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rspCode", SUCCESS_CODE);
        jsonObject.put("rspDesc", SUCCESS_DESC);
        return jsonObject;
    }

    /**
     * @description 指定描述信息的操作成功应答
     * @return 应答信息
     * @author xunzhang
     * @date 2020.08.08 17:00
     */
    public static JSONObject success(String successDesc){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rspCode", SUCCESS_CODE);
        jsonObject.put("rspDesc", StringUtils.isEmpty(successDesc) ? SUCCESS_DESC : successDesc);
        return jsonObject;
    }

    /**
     * @description 带有返回数据的成功应答
     * @return 应答信息
     * @author xunzhang
     * @date 2020.08.08 17:00
     */
    public static JSONObject success(Object data){
        JSONObject jsonObject = success();
        jsonObject.put("data", data);
        return jsonObject;
    }

    /**
     * @description 指定描述信息和返回数据的成功应答
     * @return 应答信息
     * @author xunzhang
     * @date 2020.08.08 17:00
     */
    public static JSONObject success(String successDesc, Object data){
        JSONObject jsonObject = success(successDesc);
        jsonObject.put("data", data);
        return jsonObject;
    }

    /**
     * @description 默认操作失败的应答
     * @return 应答信息
     * @author xunzhang
     * @date 2020.08.08 17:00
     */
    public static JSONObject fail(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rspCode", FAIL_CODE);
        jsonObject.put("rspDesc", FAIL_DESC);
        return jsonObject;
    }

    /**
     * @description 指定描述信息的操作失败应答
     * @return 应答信息
     * @author xunzhang
     * @date 2020.08.08 17:00
     */
    public static JSONObject fail(String failDesc){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rspCode", FAIL_CODE);
        jsonObject.put("rspDesc", StringUtils.isEmpty(failDesc) ? FAIL_DESC : failDesc);
        return jsonObject;
    }
    public static JSONObject fail(String failCode ,String failDesc){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rspCode", failCode);
        jsonObject.put("rspDesc", StringUtils.isEmpty(failDesc) ? FAIL_DESC : failDesc);
        return jsonObject;
    }
}
