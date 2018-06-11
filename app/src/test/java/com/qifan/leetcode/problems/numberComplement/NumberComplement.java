package com.qifan.leetcode.problems.numberComplement;


import org.junit.Test;


import java.util.logging.Level;
import java.util.logging.Logger;


import static org.junit.Assert.assertEquals;
/**
 * Created by Qifan on 2018/6/12.
 */

public class NumberComplement {
    @Test
    public void test1() throws Exception {
        assertEquals(2, findComplement(5));
    }

    private static int findComplement(int num) {
        int mask = 1, temp = num;
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.setLevel(Level.INFO);
        while (temp > 0) {
            mask = mask << 1;
            logger.info("findComplement mask=====>"+mask+"");
            temp = temp >> 1;
            logger.info("findComplement temp=====>"+temp+"");
        }
        return num ^ (mask - 1);
    }
}