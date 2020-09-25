package com.polo.polorpc.codec;

/**
 * 序列化
 *
 * @author polo
 */
public interface Encoder {
    byte[] encode(Object obj);
}
