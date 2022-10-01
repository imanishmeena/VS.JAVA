import java.util.PriorityQueue;

public class LinkedList{
    static Node head;
    private int size;

    LinkedList(){
        this.size =0;
    }
    class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    public void addFirstDoublyNode(String a) {
        Node newnode = new Node(a);
        if (head == null) {
            head.prev = newnode;
            return;
        }
        newnode.next = head;
        newnode.prev = null;
        head = newnode;
    }

    public void addFirstNode(String a) {
        Node newnode = new Node(a);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLastNode(String a) {
        Node newnode = new Node(a);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    public void addNodeAnyPos(String a, int pos){
        Node newnode = new Node(a);
        if(pos == 0){
            newnode.next = head;
            head = newnode;
            return;
        }
        Node prev = head;
        for(int i =0; i<pos-1;i++){
            prev = prev.next;
        }
        newnode.next = prev.next;
        prev.next = newnode;
        
    } 

    public void deleteNode(int pos){
        size--;
        if(pos == 0){
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i =0; i< pos-1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public void printNode(){
        if (head == null) {
            System.out.println("Node is Empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public int getSize() {
        return size;
    }

    public Node reverseNode(){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public Node checkNodeLoop(){
        Node fastNode = head;
        Node slowNode = head;
        while(fastNode != null && slowNode != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if(fastNode == slowNode){
                System.out.println("Loop is present from"+ slowNode.data);
                return slowNode;
            }
        }
        return null;
    }

    public Node detectLoopNodes(){
        Node endNode = checkNodeLoop();
        Node startNode = head;
        while(startNode != endNode){
            startNode = startNode.next;
            endNode = endNode.next;
        }
        return startNode;
    }

    public void mergeSortedList(int[] b){
        
    }

    public int PriorityNRopes(int[] arr){
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int i =0;i<arr.length;i++){
            ans.add(i);
        }
        int end = 0;
        while(ans.size()>1){
            int no1= ans.poll();
            int no2= ans.poll();
            int sum = no1+no2;
            end+=sum;
            ans.add(sum);
        }
        return end;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addFirstNode("is");
        list.addLastNode("a");
        list.addNodeAnyPos("the", 0);
        System.out.println(list.getSize());
        list.deleteNode(0);
        System.out.println(list.getSize());
        list.printNode();
    }

}
