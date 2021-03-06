package com.polo.polorpc.transport;

import com.polo.polorpc.Peer;

import java.io.InputStream;

/**
 * 1、创建连接
 * 2、发送数据，并且等待响应
 *3、关闭连接
 *
 * @author polo
 */
public interface TransportClient {

    void connect(Peer peer);

    InputStream write(InputStream data);

    void close();
}
