/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

            ListNode ptr = head.next;
            ListNode preptr = head;
            int first = -1;
            int second = Integer.MAX_VALUE;
            int third = Integer.MAX_VALUE;
            int i=1;

            while(ptr.next!=null){

                if(ptr.val>preptr.val && ptr.val>ptr.next.val || ptr.val<preptr.val && ptr.val<ptr.next.val){

                    if(third != Integer.MAX_VALUE){
                        second = Math.min(second,i-third);
                    }

                    if(first==-1){
                        first = i;
                    }

                    third = i;
                }

                preptr = ptr;
                ptr = ptr.next;
                i++;
            }


            if(second==Integer.MAX_VALUE){
                return new int[]{-1,-1};
            }


            return new int[]{second,third - first};

    }
}