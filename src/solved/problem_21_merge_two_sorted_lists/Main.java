package solved.problem_21_merge_two_sorted_lists;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: [1,2,4] and [1,3,4] -> [1,1,2,3,4,4]
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result1 = solution.mergeTwoLists(list1, list2);
        System.out.print("Test 1: ");
        printList(result1);

        // Test case 2: [] and [] -> []
        ListNode result2 = solution.mergeTwoLists(null, null);
        System.out.print("Test 2: ");
        printList(result2);

        // Test case 3: [] and [0] -> [0]
        ListNode list3 = new ListNode(0);
        ListNode result3 = solution.mergeTwoLists(null, list3);
        System.out.print("Test 3: ");
        printList(result3);
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(", ");
            }
            head = head.next;
        }
        System.out.println("]");
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        while (list1 != null) {
            current.next = list1;
            current = current.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            current.next = list2;
            current = current.next;
            list2 = list2.next;
        }


        return dummy.next;
    }
}