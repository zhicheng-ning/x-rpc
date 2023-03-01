package cn.nzcer.xrpc.codec;

import junit.framework.TestCase;

/**
 * @project: x-rpc
 * @ClassName: JsonDecoderTest
 * @author: nzcer
 * @creat: 2023/3/1 21:26
 * @description:
 */
public class JsonDecoderTest extends TestCase {

    public void testDecode() {
        JsonEncoder je = new JsonEncoder();
        TestBean bean = new TestBean();
        bean.setName("nzcer");
        bean.setAge(23);
        byte[] bytes = je.encode(bean);
        JsonDecoder jd = new JsonDecoder();
        TestBean decode = jd.decode(bytes, TestBean.class);
        assertEquals(bean, decode);
    }
}