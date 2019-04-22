public class ListNode {
    public final int data;       // data stored in this node
    public ListNode next;        // link to next node in the list

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(int data) {
        this(data, null);
    }

    public void print(){
        ListNode current = this;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
