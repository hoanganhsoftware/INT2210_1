import java.util.*;

public class bt{
    static Node head;
    static Node a;
    static Node b;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    //(In ra các phần từ của một danh sách liên kết)
    public static void b1(Node node)
    {
        while (node != null) {
            System.out.print(node.data + "\r");
            node = node.next;
        }
    }
    //(Chèn một phần từ vào đuôi danh sách liên kết)
    public static Node b2(Node node, int data)
    {
        Node a = new Mode(data);
        if (node == null) {
            node = a;
            return node;
        }

        Node listmoi = node;
        while (tail.next != null) {
            listmoi = tail.next;
        }
        tail.next = a;

        return node;
    }
    //(Chèn một phần từ vào đầu danh sách liên kết)
    public static Node b3(int data)
    {
        Node moi = new Node(data);
        moi.next = head;
        head = moi;
        return moi;
    }
    //(Chèn một phần từ vào vị trí cụ thể trong danh sách liên kết)
    public static Node B4(Node node, int a, int vitri)
    {
        Node Pos = new Node(a);
        if(vitri == 1) {
            Pos.next = head;
            head = Pos;
            return Pos;
        }
        for(int i = 1; i < vitri; i++){
            Pos = head;
            head = head.next;
        }
        Node new_node = new Node(a);
        new_node.next = Pos.next;
        Pos.next = new_node;
        return node;
    }
    //(Xoá một phần tử)
    public static Node b5(Node node, int vitri) {
        Node temp = head;
        if(vitri == 1) {
            head = temp.next;
            return head;
        }
        Node Pos = new Node(node.data);
        for(int i = 1; i < vitri ; i++)
        {
            Pos = head;
            head = head.next;
        }
        Pos.next = Pos.next.next;
        return node;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution list = new Solution();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int data = scanner.nextInt();
            head = b2(head, data);
        }
        //BT1
        /*
        b1(head);
        */
        //BT2
        /*
        int new_data = scanner.nextInt();
        head = b2(head, new_data);
        b1(head);
        */

        //BT3
        /*
        int new_head = scanner.nextInt();
        head = b3(new_head);
        b1(head);
        */

        //BT4
        /*
        int new_node = scanner.nextInt();
        int position = scanner.nextInt();
        if(position <= count+1) {
            head = b4(head, new_node, position);
        }
        b1(head);
        */

        //BT5
        /*
        int del_position = scanner.nextInt();
        if(del_position <= count) {
            head = b5(head, del_position);
        }
        b1(head);
        */
    }
}
