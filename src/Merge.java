public class Merge {
    public static ListNode merge(ListNode firstOfList1, ListNode firstOfList2){
        ListNode first = null; //declare the node for the return value

        ListNode current1 = firstOfList1;
        ListNode current2 = firstOfList2;

        ListNode prev = null;
        while(current1 != null && current2 != null){
            if(current1.data <= current2.data){ //pick c1
                if(prev == null) {
                    first = current1;
                }else{
                    prev.next = current1;
                }
                prev = current1;
                current1 = current1.next;
            }else{ //pick c2 clause
                if(prev == null) {
                    first = current2;
                }else{
                    prev.next = current2;
                }
                prev = current2;
                current2 = current2.next;
            }
        }
        //post while loop statements to take care of the remainders
        ListNode choice = (current1 != null) ? current1 : current2;
        if(prev == null) {
            first = choice;
        } else {
            prev.next = choice;
        }
        return first; //return the first node of the merged linked list
    }
}
