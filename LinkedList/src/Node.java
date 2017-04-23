public class Node{
    int data;
    Node child;

    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.addNodeToListBegin(2);
        l1.addNode(3);
        l1.addNode(1);
        l1.addNodeToListBegin(7);
        l1.addNode(4);
        l1.addNode(5);
        l1.addNode(6);
        l1.printList();
//        testMethods m1 = new testMethods();
//        if(m1.isListCyclic(l1))
//            System.out.println("True");
//        else System.out.println("False");
        if(l1.doesNodeExist(99))
            System.out.println("True");
    }
}

class LinkedList extends Node{
     Node head;
    public LinkedList()
    {
     head = new Node();
    }

    public void addNodeToListBegin(int n){
        Node temp = new Node();
        temp.data = n;
        temp.child = head;
        head = temp;
     }


    public void addNode(int n){
        Node traverser = head;
        Node toBeAdded = new Node();
        while(traverser.child !=null){
            traverser = traverser.child;
        }
        traverser.child = toBeAdded;
        traverser.data=n;
    }

    public void printList(){
        Node trav = head;
        while(trav.child != null){
            System.out.println(trav.data);
            trav=trav.child;
        }
    }

    public boolean doesNodeExist(int n){
        Node trav = new Node();
        trav.child=head;
        while(trav!=null){
            if(trav.data == n)
                return true;
            else trav=trav.child;
        }
        return false;
    }

}

class testMethods {

    public boolean isListCyclic(LinkedList List){
        Node current = List.head;
        Node fast = current;
        Node slow = current;
        System.out.println(fast);
//
//        while (fast != null||fast.child!=null){
//            slow = slow.child;
//            fast = fast.child.child;
//            if(slow == fast)
//                return true;
//        }
        return false;
    }
}