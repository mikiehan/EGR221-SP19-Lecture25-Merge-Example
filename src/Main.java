public class Main {

    public static void main(String[] args) {
        test0(); //print nothing
        test1(); //1 2 2 3 4 5
        test2(); //1 2 2 3 4 5
        test3(); //2 3 4
        test4(); //1 2 5
        test5(); //1 2 3 4 5 6
        test6(); //1 2 3 4 5 6
        test7(); //0 1 12 13 14 16
    }

    public static void test0(){
        test(null, null);
    }

    public static void test1(){
        ListNode first1 = new ListNode(1,
                             new ListNode(2,
                               new ListNode(5)));

        ListNode first2 = new ListNode(2,
                             new ListNode(3,
                                     new ListNode(4)));
        test(first1, first2);
    }

    public static void test2(){
        ListNode first2 = new ListNode(1,
                new ListNode(2,
                        new ListNode(5)));

        ListNode first1 = new ListNode(2,
                new ListNode(3,
                        new ListNode(4)));
        test(first1, first2);
    }

    public static void test3(){
        ListNode first1 = null;

        ListNode first2 = new ListNode(2,
                new ListNode(3,
                        new ListNode(4)));
        test(first1, first2);
    }

    public static void test4(){
        ListNode first1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(5)));

        ListNode first2 = null;
        test(first1, first2);
    }

    public static void test5(){
        ListNode first1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3)));

        ListNode first2 = new ListNode(4,
                new ListNode(5,
                        new ListNode(6)));
        test(first1, first2);
    }

    public static void test6(){
        ListNode first1 = new ListNode(1,
                new ListNode(3,
                        new ListNode(5)));

        ListNode first2 = new ListNode(2,
                new ListNode(4,
                        new ListNode(6)));
        test(first1, first2);
    }

    public static void test7(){
        ListNode first1 = new ListNode(1,
                new ListNode(13,
                        new ListNode(14)));

        ListNode first2 = new ListNode(0,
                new ListNode(12,
                        new ListNode(16)));
        test(first1, first2);
    }

    public static void test(ListNode first1, ListNode first2){
        ListNode first = Merge.merge(first1, first2);
        if(first != null) first.print();
    }
}
