package leetcode.expressions.basicCalculator.polishNotation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

@Slf4j
class TokenizerATest {
    @Test
    void name() {
        List<TokenB> res = new TokenizerA().parse("(( 10-(7+8))*11-(12+1)");
        System.out.println(res.toString());
    }

    @Test
    void name2() {
        List<TokenB> res = new TokenizerA().parse("22+1");
        System.out.println(res.toString());
    }

    @Test
    void name3() {
        List<TokenB> res = new TokenizerA().parse("-15+14");
        System.out.println(res.toString());
    }

    @Test
    void name4() {
        List<TokenB> res = new TokenizerA().parse("2-1+2");
        System.out.println(res.toString());
    }

    @Test
    void name5() {
        List<TokenB> res = new TokenizerA().parse("  -(-1+2*3)");
        System.out.println(res.toString());
    }
}