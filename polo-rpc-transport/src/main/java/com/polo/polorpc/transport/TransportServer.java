package com.polo.polorpc.transport;

/**
 * 1、启动、监听
 * 2、接收请求
 * 3、关闭监听
 * @author polo
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);

    void start();

    void stop();
}
