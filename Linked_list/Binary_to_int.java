package Linked_list;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next = next;} 

}


public class Binary_to_int {
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while(head != null){
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;        
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        Binary_to_int obj = new Binary_to_int();
        System.out.println(obj.getDecimalValue(head));

    }
    
}

