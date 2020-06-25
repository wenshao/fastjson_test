package com.alibaba.fastjson;

import junit.framework.TestCase;

import java.util.Date;

public class BasicTest extends TestCase {
    public void test_for_jdk5() throws Exception {
        VO vo = new VO();
        vo.date = new Date();

        String str = JSON.toJSONString(vo);

        System.out.println(str);
        JSON.parseObject(str, VO.class);


    }

    public static class VO {
        public int id;
        public Date date;
    }
}
