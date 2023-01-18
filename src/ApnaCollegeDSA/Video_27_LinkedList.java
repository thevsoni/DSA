package ApnaCollegeDSA;


public class Video_27_LinkedList {

    Node head;
    private int size;

    Video_27_LinkedList() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }

    public int getSize() {
        return size;
    }




//    How to insert in the middle of a Linked List (at a specified index ‘i’) ?

    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;

        Node newNode = new Node(data);
        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    // remove value in middle
    public void removeInMiddle(int index){
        if (head==null){
            System.out.println("nothing to remove");
            return;
        }
        if (index>size || index<0){
            System.out.println("invalid index");
            return;
        }

        Video_27_LinkedList.Node currNode = head;
        Video_27_LinkedList.Node curr2Node = head.next;
        for (int i=1;i<size;i++){
            if (i==index){
                currNode.next = curr2Node.next;
            }
            currNode=currNode.next;
            curr2Node=curr2Node.next;

        }

        size--;

    }

    //reverse linkedList using iterative
    public void reverseIterative(){
        Node previous = head;
        Node current = head.next;
        while (current != null){
            Node next = current.next;
            current.next=previous;

            //update
            previous=current;
            current=next;
        }
        head.next=null;
        head=previous;
    }

    //reverse linkedList using recursive
    public Node reverseRecursive(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    // video 29 Question 1

    //remove nth node from last end
     public Node removeNthFromEnd(Node head ,int n){
        if (head.next==null){
          return null;
        }
        //size
        int size =0;
        Node cuu = head;
        while (cuu != null){
          size++;
          cuu=cuu.next;
        }

        if (n==size){
          return head.next;
        }

        Node curr = head;
        int idx=size-n;
        int i=1;
        while (i<idx){
          curr=curr.next;
          i++;
        }
        curr.next=curr.next.next;
        return head;
      }

      //print nth node from last end
    public void printNthNodeFromEnd(Node head,int n){
        //size
        int size =0;
        Node cuu = head;
        while (cuu != null){
            size++;
            cuu=cuu.next;
        }
        System.out.println(size);
        if (n>size || n<0){
            System.out.println("invalid index");
            return;
        }
        if (head==null){
            System.out.println("null");
            return;
        }
        if (head.next==null){
            System.out.println(head.data);
            return;
        }
        int idx = size-n+1;
        int i=1;
        Node curr = head;
//        System.out.println(curr.data);
//        System.out.println(curr.next.data);
//        System.out.println(curr.next.next.data);
        while (i<idx){
            curr = curr.next;
            i++;
        }
        System.out.println(curr.data);

    }


    // Question 2 palindrome , is linked List palindrome or not
    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;
        while (hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public Node reverse(Node head){
        Node pre = null;
        Node curr = head;
        while (curr != null){
            Node next = curr.next;
            curr.next = pre;
            //update
            pre = curr;
            curr=next;

        }
        return pre;
    }
    public boolean isPalindrome(Node head){
        if (head==null || head.next==null){
            return true;
        }
        Node middle = findMiddle(head);
        Node startFromLast = reverse(middle.next);
        Node startFromFirst = head;

        while (startFromLast != null){
            if (startFromFirst.data != startFromLast.data){
                return false;
            }
            startFromLast=startFromLast.next;
            startFromFirst = startFromFirst.next;
        }
        return true;
    }

    // question 3 . find linked cycle / find is there any loop or not in linked list
    public boolean findCycle(Node head){
//        if (head == null || head.next == null){
//            return false;
//        }
        Node hare = head;
        Node turtle = head;
        while (hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare==turtle){
                return true;
            }

        }
        return false;
    }
    // if there is loop then print that node from where it is starting
    public void printStatingNodeOfCycle(Node head){
        Node hare = head;
        Node turtle = head;
        Node tempMain = head;
        while (hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare==turtle){
                Node temp=turtle;
                while (temp != tempMain){
                    temp=temp.next;
                    tempMain=tempMain.next;
                }
                System.out.println("loop is starting from here = "+temp.data);
                break;
            }
        }
    }
    public void removeCycle(Node head){
        Node hare = head;
        Node turtle = head;
        Node tempMain = head.next;
        while (hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare==turtle){
                Node temp=turtle.next;
                Node temp2=turtle;
                while (temp != tempMain){
                    temp=temp.next;
                    temp2=temp2.next;
                    tempMain=tempMain.next;
                }
                temp2.next=null;
                break;
            }
        }
    }

    public static void main(String args[]) {
        Video_27_LinkedList list = new Video_27_LinkedList();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.addFirst("1");
        list.addFirst("2");
        list.addFirst("3");
        list.printList();
        list.reverseIterative();
        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
        list.head=list.removeNthFromEnd(list.head, 2);
        list.printList();
        System.out.println("nth print from last end");
        list.printNthNodeFromEnd(list.head,2);
        System.out.println("checking palindrome");
        System.out.println(list.isPalindrome(list.head));
        list.printList();
        list.addLast("2");
        list.addLast("3");
        list.printList();
        System.out.println(list.isPalindrome(list.head));
        System.out.println(list.findCycle(list.head));
        list.printList();
    // i have created a loop using this     list.head.next.next.next.next.next=list.head.next;
    // isliye it throws error    list.printList();
        try {
            list.head.next.next.next.next.next=list.head.next;
            list.printList();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("run");
        list.printList();

        // bcs how it will print this loop
        // so using this we can create loop in linked list then remove
        // now we are going to remove this loop

        // creating loop
        list.head.next.next.next.next=list.head.next;
        System.out.println(" is there any loop in this linked list = "+list.findCycle(list.head));
        list.printStatingNodeOfCycle(list.head);
        list.removeCycle(list.head);
        System.out.println(" is there any loop in this linked list = "+list.findCycle(list.head));
        list.printList();
    }


}
/*
// normal linkedList using collections

class Video_27_LinkedList {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("shradha");
        list.addFirst("name");
        list.addFirst("my");
        System.out.println(list);

        list.add(2, "is");
        System.out.println(list);
    }
}


*/

/*


public class Practice {
  Node head;
  private int size;
  Practice(){
    size=0;
  }
  class Node{
    String data;
    Node next;
    Node(String data){
      this.data=data;
      this.next = null;
      size++;
    }
  }

  // adding element in first place
  public void addFirst(String data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  // adding element in last place
  public void addLast(String data){
    Node newNode = new Node(data);

    if (head==null){
      head=newNode;
      return;
    }
    Node lastNode = head;
    while (lastNode.next != null){
      lastNode=lastNode.next;
    }
    lastNode.next=newNode;
  }

  // print linkedlist
  public void printLinkedList(){
    Node currNode = head;
    while (currNode != null){
      System.out.print(currNode.data+" -> ");
      currNode = currNode.next;
    }
    System.out.println("null");
  }

  // remove first element
  public void removeFirst(){
    if (head==null){
      System.out.println("empty list, nothing to delete");
      return;
    }
    head = head.next;
    size--;
  }

  // remove last element
  public void removeLast(){
    if (head==null){
      System.out.println("empty list, nothing to delete");
      return;
    }
    size--;
    if (head.next == null) {
      head=null;
      return;
    }
    Node secondLast = head;
    Node last = head.next;
    while (last.next != null) {
      secondLast = last;
      last = last.next;
    }
    secondLast.next = null;

  }
  public int getSize(){
    return size;
  }


  // insert value in middle
  public void insertInMiddle(int index,String data){
    if (index>size || index<0){
      System.out.println("invalid index !");
      return;
    }
    Node newNode = new Node(data);
    if (head==null || index==0){
      // can do separately also
      newNode.next = head;
      head = newNode;
    }
    Node currNode = head;
    for (int i=1;i<size;i++){
      if (i==index){
        Node nn = currNode.next;
        currNode.next = newNode;
        newNode.next = nn;
        break;
      }
      currNode = currNode.next;
    }
  }

  // remove value in middle
  public void removeInMiddle(int index){
    if (head==null){
      System.out.println("nothing to remove");
      return;
    }
    if (index>size || index<0){
      System.out.println("invalid index");
      return;
    }

    Node currNode = head;
    Node curr2Node = head.next;
    for (int i=1;i<size;i++){
      if (i==index){
        currNode.next = curr2Node.next;
      }
      currNode=currNode.next;
      curr2Node=curr2Node.next;

    }

    size--;

  }


  public static void main(String[] args) {
    Practice p = new Practice();
    p.addFirst("a");
    p.addFirst("is");
    p.addFirst("this");
    p.addLast("list");
    p.printLinkedList();
    p.removeFirst();
    p.printLinkedList();
    p.removeLast();
    p.printLinkedList();
    System.out.println(p.getSize());
    p.insertInMiddle(0,"this");
    p.printLinkedList();
    p.insertInMiddle(3,"list");
    p.printLinkedList();
    p.removeInMiddle(1);
    p.printLinkedList();
    System.out.println(p.getSize());


  }
}
 */