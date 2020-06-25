package com.alibaba.fastjson;

import junit.framework.TestCase;

public class BasicTest extends TestCase {
    public void test_for_jdk5() throws Exception {
        VO vo = new VO();

        String str = JSON.toJSONString(vo);
        JSON.parseObject(str, VO.class);
    }

    public static class VO {
        public int id;
    }
}
