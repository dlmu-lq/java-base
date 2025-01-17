package test.oom;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 测试栈溢出，栈大小不能太小
 * VM 参数：-Xss128k：The Java thread stack size specified is too small. Specify at least 180k
 *  -Xss180k -Xss228k
 */
@Slf4j
public class TestSOF {

    static int stackLength1 = 0;
    static int stackLength2 = 0;

    @Test
    void test1(){
        try {
            callSelf();
        }finally {
            log.info("stackLength1：{}", stackLength1);
        }
    }

    @Test
    void test2(){
        try {
            callSelf2();
        }finally {
            log.info("stackLength2：{}", stackLength2);
        }
    }

    static void callSelf(){
        stackLength1++;
        callSelf();
    }

    static void callSelf2(){
        long unused1, unused2, unused3, unused4, unused5,
                unused6, unused7, unused8, unused9, unused10,
                unused11, unused12, unused13, unused14, unused15,
                unused16, unused17, unused18, unused19, unused20,
                unused21, unused22, unused23, unused24, unused25,
                unused26, unused27, unused28, unused29, unused30,
                unused31, unused32, unused33, unused34, unused35,
                unused36, unused37, unused38, unused39, unused40,
                unused41, unused42, unused43, unused44, unused45,
                unused46, unused47, unused48, unused49, unused50,
                unused51, unused52, unused53, unused54, unused55,
                unused56, unused57, unused58, unused59, unused60,
                unused61, unused62, unused63, unused64, unused65,
                unused66, unused67, unused68, unused69, unused70,
                unused71, unused72, unused73, unused74, unused75,
                unused76, unused77, unused78, unused79, unused80,
                unused81, unused82, unused83, unused84, unused85,
                unused86, unused87, unused88, unused89, unused90,
                unused91, unused92, unused93, unused94, unused95,
                unused96, unused97, unused98, unused99, unused100;
        stackLength2++;
        callSelf2();
    }
}
