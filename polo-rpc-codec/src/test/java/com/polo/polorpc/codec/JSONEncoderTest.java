package com.polo.polorpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author polo
 */
public class JSONEncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("polo");
        bean.setAge(20);

        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);
    }
}