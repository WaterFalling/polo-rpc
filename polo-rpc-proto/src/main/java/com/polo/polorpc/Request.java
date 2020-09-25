package com.polo.polorpc;

import lombok.Data;

/**
 * 表示 RPC 的一个请求
 * @author polo
 */
@Data
public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}
