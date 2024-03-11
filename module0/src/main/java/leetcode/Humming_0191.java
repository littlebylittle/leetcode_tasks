package leetcode;

public class Humming_0191 {
//jshell> 0x80_00_00_00
//        $43 ==> -2147483648

//        jshell> 0x80_00_00_00 -1
//        $44 ==> 2147483647

//    jshell> 0x80_00_00_00 >> 1
//    $45 ==> -1073741824       <==== so, when we use >>, we stil have a leading minus bit in our 32-bit integer ***

//    jshell> 0x40_00_00_00
//            0x40_00_00_00
//    $46 ==> 1073741824   <=== so we could expect this after >> but not

//    jshell> 0x40_00_00_00 + 0x80_00_00_00
//    $47 ==> -1073741824         <======= we obtained this, after >>

//    BUT!
//    jshell> 0x80_00_00_00 >>> 1
//            0x80_00_00_00 >>> 1
//    $48 ==> 1073741824
//
//    jshell>
//
//    jshell> 0x40_00_00_00
//            0x40_00_00_00
//    $49 ==> 1073741824
    public int hammingWeight(int n) {
        // Creating and assigning binary array size
        int sum = 0;
        while(n!=0) {
            sum += (n & 0x1);
            n = n>>>1;
        }
        return sum;
    }
}
