/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // Brute force approach:-

        // HashMap<Node , Node> map = new HashMap<>();
        // Node temp = head;
        // //Step 1:- new node create karna and usko Map meh put karna 
        // while(temp != null){
        //     map.put(temp ,new Node(temp.val));
        //     temp=temp.next;
        // }
        // //Step 2:- jo new node create hua hai usko connect karna (next pointer,random pointer)
        // temp = head;
        // while(temp != null){
        //     Node copyNode = map.get(temp);
        //     copyNode.next = map.get(temp.next);
        //     copyNode.random = map.get(temp.random);
        //     temp = temp.next;
        // }
        // return map.get(head);

        // Optimal Approach:-
        // 1)Create dummy node and place in betweeen 
        // 2)connect random pointers
        // 3)conect next pointer
        
        // step 1:-
        if (head == null) return null;
        Node temp = head;
        while(temp != null){
            Node CopyNode = new Node(temp.val);
            CopyNode.next = temp.next;
            temp.next = CopyNode;
            temp=temp.next.next;
        }
        // Step 2:-
        temp = head;
        while(temp != null){
            Node CopyNode = temp.next;
            if(temp.random != null)CopyNode.random = temp.random.next;
            else CopyNode.random = null;
            temp = temp.next.next;
        }

        Node Dnode = new Node(-1);
        Node res = Dnode;
        temp=head;
        while(temp != null){
            Node CopyNode = temp.next;
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp = temp.next;
        }
        return Dnode.next;
    }
}