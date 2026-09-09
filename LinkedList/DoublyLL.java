class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;  
    }

class DLL{
    ListNode head;
    ListNode tail;
    int  size;

    // Add at head 
    void  insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head = null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
     // Add at tail

    void  insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head = null) head = tail = temp;
        else{
            tail.next = head;
            temp.prev = null;
            tail = temp;
        }
        size++;
     }

     // DeleteAtHead
     void DeleteAtHead(){
        if(size == 0){
           System.out.println("Lit is empty ");
           return;
        }
        if(size == 1) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
     }

      // DeleteAtHead
     void DeleteAtTail(){
        if(size == 0){
           System.out.println("Lit is empty ");
           return;
        }
        if(size == 1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
     }

     // Display elem

    void Display(){
         ListNode temp = head;
         while(temp != null){
            System.out.println(temp.val+ " ");
            temp = temp.next;
         }
        System.out.println();
      }

      // DisplayReverse
    void DisplayRaverse(){
         ListNode temp = tail;
         while(temp != null){
            System.out.println(temp.val+ " ");
            temp = temp.prev;
         }
        System.out.println();
     }

     // Inxert At any index



   }
}

// Questions 


     Reverse Doubly Linked List
     ListNode prev = null;
     ListNode curr = head;
     ListNode fwd = null ;
     while(curr!= null){
        fwd = curr.next;
        curr.next = prev;
        curr.prev = fwd;
        prev = curr;
        curr = fwd;
      }
      return prev;

 Roate Doubly LinkedList
 

 Flatten a multilevel Doubly LinkedList --> 430
   public Node flatten(Node head){
    if(head == null) return head;
    Node curr= head;
    while(curr!= null) {
        if(curr.child == null) curr= curr.next;
        else{
            Node fwd = curr.next;
            Node c = flatten(curr.child);
            curr.child = null;
            curr.next = c;
            c.prev = curr;
            Node temp = c;
            while(temp.next != null) temp = temp.next;// second loop for check child null hai ya nahi
            temp.next = fwd;
           if(fwd != null) fwd.prev = temp;
            curr = fwd;
        }
        return head;
    }

   }

Find the minimum and maxm num of nodes between critical points  -- > 
    public int[] nodesb/wCriticalPoints(ListNode hhead){
        ind [] ans = {-1, -1};
        int idx = 1; firstIdx = -1; lastIdx = -1;
        int minDst = Integer.MAX_VALUE;
        ListNode a = head;
        ListNode b = a.next;
        ListNode c = b.next;
        if(c == null) return ans; // to size ka linked list hai
        while(c!= null){
            // check critical points
            if((b.val>a.val && b.val> c.val) || (b.val<a.val && b.val<c.val)){
                if(firstIdx == -1) firstIdx = idx;
                if(lastIdx != -1) {
                    int distance = idx - lastIdx;
                    minDst = Math.min(distance, minDst);
                }
                lastIdx = idx;
            }
            idx++;
            a = a.next;
            b = b.next;
            c = c.next;
        }
        int maxDst = lastIdx - firstIdx;
        if(maxDst == 0) maxDst = -1;
        if(maxDst == Integer.MAX_VALUE) minDst = -1;
        ans[0] = minDst;
        ans[1] = maxDst;
        return ans;
    }

// Copy list with random pointer --> 138
    public Node deepCopy(Node head1){
        Node temp1 = head1;   
        Node head2 = new Node(-1);
        Node temp2 = head2; 
        while(temp1!= null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }  
        return head2.next;
    }

    public void merge(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp2 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
            
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
            
        }
    }

    public void randomConnection(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2!= null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next; // main cheez
            temp1 = temp1.next.next;
            if(temp2.next !=null)temp2 = temp2.next.next;

        }
    }

    public void split(Node head1){
        Node dummy1 = new Node(-1);
        Node temp1 = dummy1;
        Node dummy2 = new Node(-1); 
        Node temp2 = dummy2;
        Node temp = head1;// merge lis pr traverse
        while(temp != null){
            temp1.next = temp;
            temp = temp.next;
            temp1 = temp1.next;

            temp2.next = temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp1.next = null;
    }
    public Node copyRandomList(Node head1){
        //Step - 1: creating deepcopy with out random
    Node head2 = deepCopy(head1);
    // Step 2: Alternatively connecting lists
    merge(head1, head2);
    // step 3: Assigning Random poiner
    randomConnection(head1, head2);
    // step 4: split the 1 list into 2
    split(head1);
    return head2;// return deepcopy list

    }

public class DoublyLL {
    public static void main(String[] args) {
        DLL list = new DLL(); 
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.Display();
        list.DeleteAtHead();
        list.DeleteAtTail();
        list.Display();



    }
}
