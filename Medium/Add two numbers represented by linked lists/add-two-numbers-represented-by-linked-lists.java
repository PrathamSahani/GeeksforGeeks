//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2 =new Stack<>();
        while(first!=null){
            s1.push(first.data);
            first= first.next;
        }
        while(second!=null){
            s2.push(second.data);
            second = second.next;
        }
        Node res = null;
        int carry =0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry!=0){
            int sum = carry;
            if(!s1.isEmpty()){
                sum+=s1.pop();
            }
            if(!s2.isEmpty()){
                sum+=s2.pop();
            }
            Node res1 = new Node(sum%10);
            res1.next = res;
            res = res1;
            carry = sum/10;
        }
        return res;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}