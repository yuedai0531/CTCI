
public class addTwoSums {

	public static void main(String[] args) {
		
		int i;
		for(i=1;i<3;i++) {
			System.out.println(i);
		}
		System.out.println("last " + i);
	}

	
	
public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode n = new ListNode(0);
    	int carry = 0;
    	
    	while(l1 != null && l1 != null) {
	    	
	    	if(l1.val + l2.val > 10) {
	        	carry = 1;
	        }
	    	n.val = (l1.val + l2.val + carry) % 10;
            
	    	n = n.next;
	    	l1 = l1.next;
	    	l2 = l2.next;
        }
        return n;
    }
}

}
