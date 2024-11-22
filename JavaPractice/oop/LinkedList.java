
class Node {
    int value;
    Node nextNode;

    Node(){
        nextNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int incomingValue) {
        value = incomingValue;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node incomingNode) {
        nextNode = incomingNode;
    }

}

class List {
    int noOfNodes;
    Node firstNode;

    public void getLength() {

    }

    public void setFirstNode(Node incomingNode) {
        firstNode = incomingNode;
    }

    public void showList() {
        Node thisNode = firstNode;
        while(thisNode != null) {
            System.out.println("Node : " + thisNode.getValue());
            thisNode = thisNode.getNextNode();
        }
    }

    public void addItem(int item) {

        Node addItem = new Node();
        addItem.setValue(item);
         Node thisNode = firstNode;

        while(thisNode.getNextNode() != null) {
           thisNode = thisNode.getNextNode();
        }

        thisNode.setNextNode(addItem);
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node A = new Node();
        A.setValue(2);
        // Node D = new Node();
        // D.setValue(4);
        
        // A.setNextNode(D);

        List myList = new List();

        myList.setFirstNode(A);

        myList.addItem(10);
        myList.addItem(11);
        myList.addItem(12);
        myList.addItem(13);
        myList.showList();

    }
}