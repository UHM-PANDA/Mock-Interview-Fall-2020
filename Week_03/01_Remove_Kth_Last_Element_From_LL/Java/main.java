public class RemoveKthLastElement {

	/**
	Iterate to end, while simultanusly iterating a node k behind it, removes when first node reaches end
	**/
	public ListNode removeNthFromEnd(ListNode head, int k) {

   		ListNode dummyHead = new ListNode(0, head);
   		ListNode first = dummyHead.next;

   		// iterate to kth elmenent
   		while (k-- > 0) {
   			first = first.next;
   		}

   		ListNode second = dummyHead;
   		// there are now two pointers, first and second
   		// first is at the kth element, second is at the beginning

   		// iterating first to the last element, second will be at the kth last element
   		while (first != null) {
   			second = second.next;
   			first = first.next;
   		}

   		// remove kth element (aka second)
   		second.next = second.next.next;

   		//return head
   		return dummyHead.next;
	}

	/**
	Finds length - n, iterates to length - n, removes that element
	**/
	public ListNode removeNthFromEnd(ListNode head, int n) {

	ListNode dummy = new ListNode(0);
	dummy.next = head;
	ListNode first = head;

	int length = 0;

	while (first != null) {
		length++;
		first = first.next;
	}

	length -= n;
	first = dummy;
	while (length > 0) {
		length--;
		first = first.next;
	}

	first.next = first.next.next;
	return dummy.next;
	}
}
