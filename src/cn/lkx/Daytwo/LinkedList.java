package cn.lkx.Daytwo;

class Node {
    Node next;
    int val;
    Node(Node next,int val){
        this.next=next;
        this.val=val;
    }

}
public class LinkedList {
    public static void display(Node head){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.printf("(%d)->",cur.val);

        }
        System.out.println("null");

    }
    public static Node reverList(Node head){
      Node prev=null;
      Node cur=head;
      while(cur!=null){
          Node nextTemp=cur.next;
          cur.next=prev;
          prev=cur;
          cur=nextTemp;


      }
      return prev;

    }

    public static void main(String[] args) {
        Node n3=new Node(null,3);
        Node n2=new Node(n3,2);
        Node n1=new Node(n2,1);
        display(n1);

        display(reverList(n1));

    }
}
