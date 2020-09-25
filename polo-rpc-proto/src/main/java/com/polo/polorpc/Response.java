package com.polo.polorpc;

import lombok.Data;

/**
 * 表示 RPC 的返回
 *
 * @author polo
 */
@Data
public class Response {
    /**
     * 服务返回编码，0-成功，非0-失败
     */
    private int code = 0;
    /**
     * 具体的错误信息
     */
    private String message = "ok";
    /**
     * 返回的数据
     */
    private Object data;
}
