public class HelloWorld2 {
    public static void main(String args[]) {
//        BitSet bits1 = new BitSet(16);
//        BitSet bits2 = new BitSet(16);
//
//        // set some bits
//        for(int i=0; i<16; i++) {
//            if((i%2) == 0) bits1.set(i);
//            if((i%5) != 0) bits2.set(i);
//        }
//        System.out.println("Initial pattern in bits1: ");
//        System.out.println(bits1);
//        System.out.println("\nInitial pattern in bits2: ");
//        System.out.println(bits2);
//
//        // AND bits
//        bits2.and(bits1);
//        System.out.println("\nbits2 AND bits1: ");
//        System.out.println(bits2);
//
//        // OR bits
//        bits2.or(bits1);
//        System.out.println("\nbits2 OR bits1: ");
//        System.out.println(bits2);
//
//        // XOR bits
//        bits2.xor(bits1);
//        System.out.println("\nbits2 XOR bits1: ");
//        System.out.println(bits2);


        String s1 = new String("zxy");    // 结论3
//        s1.intern(); // 常量池非空，返回值是常量池里的内容
        String s2 = "zxy"; // 常量池非空，返回值是常量池里的内容
        String s3 = new String("zxy");
        System.out.println(s1 == s2); //false
        System.out.println(s1.intern() == s2); // true
        System.out.println(s1.intern() == s3.intern());

//        String s1 = "zxy"; // 加到常量池
//        String s2 = new String("zxy"); // 加到堆，常量池有东西所以啥也不干
//        System.out.println(s1 == s2); // false
//        System.out.println(s1 == s2.intern()); // true 常量池非空，intern返回常量池里的内容

    }
}
