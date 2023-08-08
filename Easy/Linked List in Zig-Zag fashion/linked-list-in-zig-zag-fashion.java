//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            Solution g = new Solution();
            printList(g.zigZag(head));
        }
    } 
}

// } Driver Code Ends


/*Node is as follows:

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

*/
class Solution {
    public static Node zigZag(Node head) {
        if (head == null || head.next == null)
            return head;

        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (i % 2 == 0 && list.get(i) > list.get(i + 1)) {
                int tempValue = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, tempValue);
            } else if (i % 2 != 0 && list.get(i) < list.get(i + 1)) {
                int tempValue = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, tempValue);
            }
        }

        Node newHead = new Node(list.get(0));
        temp = newHead;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }

        return newHead;
    }
}
