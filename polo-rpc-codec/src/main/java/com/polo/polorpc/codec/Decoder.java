package com.polo.polorpc.codec;

/**
 * 反序列化
 *
 * @author polo
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
