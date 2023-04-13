import java.util.Scanner;
class Main{
    static class Node {
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }

        public void setData(int data){
            this.data = data;
        }
        public int getData(){
            return this.data;
        }
        public void setNext(Node next){
            this.next=next;
        }
        public Node getNext(){
            return this.next;
        }
    }

    static class SinglyLinkedList{
        public Node head;

        public SinglyLinkedList(){
            this.head=null;
        }

        public void pushFront(Node data){
            data.setNext(head);
            this.head = data;
        }
        public void pushBack(Node data){
            Node start = head;
            if(start==null){
                data.setNext(head);
                this.head = data;
            }else{
                while(start.next!=null){
                    start = start.next;
                }
                start.next = data;
            }
        }
        public void popFront(){
            if(head==null){
                System.out.println("Can't pop. List is empty");
            }else{
                head = head.getNext();
            }
        }

        public void imprimir(){
            Node start = head;
            if(head==null){
                System.out.println("Nothing to print. List is empty");
            }
            else{
                while(start!=null){
                    if(start.next!=null){
                        System.out.print(start.data+" ");
                    }else if(start.next==null){
                        System.out.print(start.data);
                    }
                    start = start.next;
                }
            }

        }
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int acceptedDevelopers =0;
        SinglyLinkedList requirements = new SinglyLinkedList();
        int numberRequirements = Integer.parseInt(read.nextLine());
        String[] require = read.nextLine().split(" ");
        for(String a:require){
            int number = Integer.parseInt(a);
            requirements.pushBack(new Node(number));
        }

        int numberDevelopers = Integer.parseInt(read.nextLine());
        System.out.println();

        requirements.imprimir();
        System.out.println();


        for(int i=0;i<numberDevelopers;i++){
            SinglyLinkedList eachDeveloper = new SinglyLinkedList();
            String[] developer = read.nextLine().split(" ");
            System.out.println("each list");
            for(String a:developer){
                int number = Integer.parseInt(a);
                eachDeveloper.pushBack(new Node(number));
            }
            eachDeveloper.imprimir();
            System.out.println();
        }

    }
}