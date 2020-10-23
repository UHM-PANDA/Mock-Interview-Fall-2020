public class MergeSortedLinkedLists {
	public ListNode mergeTwoLists(ListNode L1, ListNode L2) {

	ListNode dummyhead = new ListNode(0, null);
	ListNode current = dummyhead;

	// while both lists are not empty
	while (L1 != null && L2 != null) {

		// if data from L1 is <= L2
		if (L1.val <= L2.val) {
			// add L1 to current
			current.next = L1;
			L1 = L1.next;

		} else {
			// add l2 to current
			current.next = L2;
			L2 = L2.next;
		}

		// updates current
		current = current.next;

	}
	// apprends remaining nodes of L1 or L2
	current.next = L1 != null ? L1 : L2;

	return dummyhead.next;

}

public ListNode mergeTwoListsRecusive(ListNode l1, ListNode l2) {
	if (l1 == null) {
		return l2;
	}

	if (l2 == null) {
		return l1;
	}

	if (l1.val <= l2.val) {
		return new ListNode(l1.val, mergeTwoLists(l1.next, l2));
	} else {
		return new ListNode(l2.val, mergeTwoLists(l1, l2.next));
	}
}
}
