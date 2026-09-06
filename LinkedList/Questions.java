import java.lang.classfile.components.ClassPrinter.ListNode;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
public class Question {
    public static void main(String[] args) {
        // Delete Node in a Linked List --> 237

    }
   // Delete node in a linkedlist
    public void deleteNode(ListNode target) {
        // ListNode temp = new ListNode();
        target.val = target.next.next;
        target.next = target.next.next.; // delete the value of the idx 
    }

 // Find the middle elem in linkedList
 public ListNode middleNode(ListNode head) {
     // Find middle elem
     //find length of Ll
     int length = 0;
     ListNode temp = head;
     while (temp != null) { // Count total nodes
         temp = temp.next;
         length++;
     }
     temp = head; // Traverse to the middle element
     for (int i = 1; i <= length / 2; i++) {
         temp = temp.next;
     }
     return temp; // return the listnode object

     // Using slow fast approach
     ListNode slow = head;
     ListNode fast = head;
     while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
     }
     return slow;
   }
    
   /// Kth from End of linkedList
   int getKthFromLast(Node head, int k) {
       Node slow = head;
       Node fast = head;
       // Fast ko k step aage le jaao
       for (int i = 0; i <= k; i++) {
           if (fast == null)
               return -1;
           fast = fast.next;
       }
       while (fast != null) {
           slow = slow.next;
           fast = fast.next;

       }
       return slow;
   }
        
   // Remove Nth node from End of list --> 19
   // same as above question
    
        // Intersection of two Linked Lists --> 160
        // Fint first node length
            int len1 = 0;
            ListNode temp1 = head1;
            while (temp1 != null) {
                temp1 = temp1.next;
                len1++;
            }
            // Fint second node length
            int len2 = 0;
            ListNode temp2 = head2;
            while (temp2 != null) {
                temp2 = temp2.next;
                len2++;
            }
            // Jiska length big hai usse aage bhej do
            temp1 = head1;
            temp2 = head2;
            // Advance the pointer of the longer list
            if (len1 > len2) { // temp1 ko aage bhejenge
                for (int i = 0; i < len1 - len2; i++) {
                    temp1 = temp1.next;
                }
            } else {// temp1 ko aage bhejenge
                for (int i = 0; i < len2 - len1; i++) {
                    temp2 = temp2.next;
                }
            }
            // Move both pointers until they meet
            while (temp1 != temp2) { // Jab tak temp 1 ==  temp2 nhi ho jata tab tak loop chalate raaho
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return temp1;
        
 // Swapping Nodes In A linked List ---> 1721

        public ListNode SwapNodes(ListNode head, int k) {
           ListNode slow = head;
            ListNode fast = head;
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            fast = head; // firse loop chalao k-1 , first swap ekem ke liye
             for (int i = 0; i < k-1; i++) {
                fast = fast.next;
            }
            // 'slow' is now the k-th node from the end
            // Step 3: Swap values between the two nodes
            int temp = fast.val;
            fast.val = slow.val;
            slow.val = temp;
            return head;
        }

 // Detect loop in linked list -->141
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return ture;
        }
        return false;
            

        // Detect loop in linked list // Interview ques if we inc speed next.next
        // Node slow = head;
        // Node fast = head;
        // while(fast != null && fast.next != null && fast.next.next != null){
        //     slow = slow.next;
        //     fast = fast.next.next.next;
        //     if (fast == slow)
        //         return ture;
        // }
        // return false;
            


        // Remove duplicate elem from sorted linked list --> 83
        Node slow = head;
        Node fast = head;
        while(fast!=null){
            if (slow.val == fast.val)
                fast = fast.next;
        }else{
            slow.next = fast;
            slow = fast;
        }
        slow.next=fast;
        return head;

        // Remove duplicate elem from sorted linked list || --> 82-->
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode i = head; // i will travel linkedlist
        while(i!=null)
        {
            if (i.next == null || i.val != i.next.val) {
                t.next = i;
                t = i;
                i = i.next;
            } else { // i.val == i.next.val
                ListNode j = i.next;
                while (j != null && j.val == i.val) {
                    j = j.next;
                }
                i = j;
            }
        }
        t.next = i;
        return dummy.next;
           


        // Rotate List --> 61
        public int length(ListNode head){
            int len = 0;
            ListNode = head;
            while( temp != null){
                temp = temp.next;
                len++;
            }
            return len;
        }

        public ListNode rotateRight(ListNode head, int k){
            if(head == null || head.next == null) return head;
            int n = length(head);
            k %= n;
            if(k == 0) return head;
            ListNode slow =head;
            ListNode fast = head;
            for(
            int i = 1;i<=k+1;i++)
            {
                fast = fast.next;
            }
            while(fast!=null)
            {
                slow = slow.next;
                fast = fast.next;
            }
            ListNode a = slow.next;
            slow.next = null;
            ListNode tail = a;
            while(tail.next!=null)
            {
                tail = tal.next;
            }
            tail.next=head;
        }
        return a;

        // Partition list --> 86
        public ListNode partition(ListNode head, int x){
    // Dummy nodes smaller aur larger values track karne ke liye
            ListNode d1 = new ListNode(-1);
            ListNode d2 = new ListNode(-1);
            ListNode t1 = d1; // Smaller list ka pointer
            ListNode t2 = d2; // larger value ka poingter
            ListNode temp = head;
            while(temp != null){
                if(temp.val< x){
                    t1.next = temp;
                    t1 = t1.next;// t1 ko aage badhao
                }
                else{
                    t2.next = temp;
                    t2 = t2.next; //t2 ko aage badhao
                }
                temp = temp.next;
            } /// connect number smaller to larger
            // Dono lists ko connect karo
            t1.next = d2.next; // // Smaller list ke end ko larger list se jodo
            t2.next = null; // Resulting list ka head return karo
            return d1.next;
        }

        

        // Reverse a linkedlist GFG // Leetcode
        Node temp = head;
        ArrayList<Node> arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp);
            temp = temp.next;
        }
        int n arr.size();
        for(int i = n - 1;i>=1;i--){
            arr.get(0).next = arr.get(i - 1);
        }
        arr.get(0).next=null;
        return arr.get(i-1);
        
        // Reverse linkedlist [iterative]
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;

        // Reverse linkedlist [Recursive]
        if(head==null||head.next==null)return head;
        Node a = head.next;
        head.next=null;
        Node b = reverseList(a);
        a.next=head;
        return b;


        // Palindrome LinkedList --->234
        Node temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }
        int i = 0, j = arr.size() - 1;
        while(i<=j)
        {
            int a arr.get(i), b = arr.get(j);
            if(a != b) return false;
            i++;
            j--;
        }
        return ture;


        // Odd even linkedlist ---> 328
        public ListNode oddEvenList(ListNode head) {
            ListNode odd = new ListNode(-1);
            ListNode even = new ListNode(-1);
            ListNode t = head;
            ListNode t1 = odd;
            ListNode t2 = even;
            while(t != null){
                t1.next = t;
                t = t.next;
                t1 = t1.next;
                t2.next = t;
                if(t != null) t = t.next;
                t2 = t2.next;
            }
            t1.next = even.next;
            return odd.next;


        }

        // swaps nodes in pair --- > 24
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = dummy;
        while( a != null && b != null){
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next;
            if(a != null) b = b.next;
        }
        return dummy.next;


        // Merge K sorted linked lists
        if(lists.length == 0) return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        for(ListNode n : lists) arr.add(n);
        while(arr.size() >1){
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = merger(a, b);
            arr.add(c);  
        }
        return arr.get(0); // iske baad merge two sorted arr code


        // Maximum twin sum of a linkedList --> 2130
        // Reorder List
    }
