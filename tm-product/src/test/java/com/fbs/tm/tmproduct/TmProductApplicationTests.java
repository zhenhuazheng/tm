package com.fbs.tm.tmproduct;

import com.fbs.tm.tmproduct.mapper.TmProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TmProductApplicationTests {

    @Autowired
    TmProductMapper tmProductMapper;

    @Test
    void contextLoads() {
        tmProductMapper.selectList(null);
    }

}
