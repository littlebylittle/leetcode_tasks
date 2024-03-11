package leetcode.robHouse_0020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobHouse_0020Test {
    @Test
    void name() {
        int rob = new RobHouse_0020().rob(new int[]{2, 7, 9, 3, 1});
        assertEquals(12, rob);
        /**
         * [I]nput array:  {   2,    7,    9,    3,    1}
         *                      0    1     2     3     4
         * iteration i =====================> -1 (before cycle)
         * for go from left to right and keep two accumulators what is the sum for the previous house if it was robbed or not (prev[R]obbed, prev[NR]notRobbed)
         *
         * before cycle R = 0, NR = 0;
         *                  ^                                   i==0; I[i] = 2; CR(currentRobed) = NR + I[i]; (cause we can't robb previous house and current);
         *                                                      CR = 0 + 2
         *                                                      NR = max(NR, R) = max(0, 0) = 0
         *                                                      R = CR -> 2
         *    CR,NR,R =>  0,0,2                                  --------i=1; I[1]=7;
         *                                                      CR=NR+I[i]= 0+7;                CR=7;
         *                                                      NR = max(NR,R) = max(0, 2);     NR=2;
         *                                                      R  = CR =>                      R =7;
         *                                                      -------i=2, I[i]=9;
         *                                                      CR = NR + I[i] = 2+9=11;        CR=11
         *                                                      NR = MAX(NR,R)=> max(2,7)=7;    NR=7
         *                                                      R=CR;                           R:=11;
         *                                                      -----i=3; I[3] =3;
         *                                                      CR =NR+I[3]=7+3=>               CR=10;
         *                                                      NR=MAX(NR,R)=MAX(7,11);         NR=11
         *                                                      R=CR;                           R=10;
         *                                                      -----i-4; I[i]=1
         *                                                      CR=NR+I[4]=11+1;                CR=12
         *                                                      NR=MAX(NR,R)=MAX(11,10);        NR=11
         *                                                      R=CR;                           R=12
         *
         *---------------------CYCLE END--------------------------
         * return max(R,CR) == MAX(11, 12)
         *
         *
         * [I]nput array:  {   2,               7,              9,                  3,                  1}
         *  NR=~0, R=0
         *  i=0         max(~0,0);0+2
         *                   ~0, 2
         *  i=1                         max(~0,0+2);7+~0
         *                                     2;7
         *  i=2                                             max(2,7);9+2
         *                                                        7,11
         *  i=3                                                             max(7,11);3+7
         *                                                                      11, 10
         *  i=4                                                                                   max(11,10), 1+11
         *                                                                                           11, 12
         *                                                                                         NR=11; R=12
         *  //end loop
         *  RETURN MAX(11,12) => 12;
         *  ANSWER = 12;
         *
         */
    }

    @Test
    void name001() {
        int rob = new RobHouse_0020().rob(new int[]{1,2,3,1});
        assertEquals(4, rob);
        /**
         * [I]nput array:  {   1,               2,                  3,              1}
         *  NR=~0, R=0
         *  i=0         max(~0,0);0+1
         *                   ~0, 1
         *  i=1                         max(~0,1);2+~0
         *                                     1;2
         *  i=2                                             max(1,2);3+1
         *                                                        2,4
         *  i=3                                                             max(2,4);1+2
         *                                                                      4, 3
         *
         *  //end loop
         *  RETURN MAX(4,3) => 4;
         */
    }

    @Test
    void name002() {
        int rob = new RobHouse_0020().rob(new int[]{3,0,5,500});
        assertEquals(4, rob);
        /**
         * [I]nput array:  {   3,               0,                 5,              500}
         *  NR=~0, R=0
         *  i=0         max(~0,0);0+3
         *                   ~0, 3
         *  i=1                         max(~0,3);0+~0
         *                                     3;0
         *  i=2                                             max(3,0);5+3
         *                                                        3,8
         *  i=3                                                             max(3,8);500+3
         *                                                                      8; 503
         *
         *  //end loop
         *  RETURN MAX(8,503) => 503;
         */
    }

    @Test
    void name003() {
        int rob = new RobHouse_0020().rob(new int[]{6, 0, 0, 5, 500});
        assertEquals(506, rob);
        /**
         * [I]nput array:  {   6,               0,                 0,                   5,               500}
         *  NR=~0, R=0
         *  i=0  NR,R=  max(~0,0);6+~0
         *                   ~0, 6
         *  i=1                         max(~0,6);0+~0
         *                                     6;0
         *  i=2                                             max(6,0);0+6
         *                                                        6,6
         *  i=3                                                                    max(6,6);5+6
         *                                                                            6, 11
         *  i=4                                                                                        max(6,11);500+6
         *                                                                                                   11; 506
         *  //end loop
         *  RETURN MAX(1,506) => 506;
         */
    }
}