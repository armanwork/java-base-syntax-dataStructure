public class LinkedList {
    private class Node {
        private int value;
        private Node next ;

        public Node(int value){
                this.value= value;
        }


    }


    private Node first;
    private Node last;


    public void addLast(int value){
        Node node = new Node(value);
        if (first == null){
            first = last = node;
        }
        else{
            last.next=node;
            last = node;
        }
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if (first == null){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }
    }

    public void deleteFirst(int value){

    }

    //addFirst
    //addLast
    //deleteFirst
    //delteLast
    //contain
    //indexOf



}
