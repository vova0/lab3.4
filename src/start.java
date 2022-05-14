import java.util.Scanner;
class Node {
    public int value;
    public Node next;
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }}
public class start {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введите число n");
        int n = sc.nextInt();
        int d = 0;
        int kol = 0;
        int nechet = 0;
        int cr=0;
        Node head = new Node(0, null);
        Node tail = head;
        for (int i = 0; i < n; i++) {
            if ((i+1) % 2 != 0) {
                cr=cr+1;
            nechet=nechet+(i+1);
            }
            tail.next = new Node(i + 1, null);
            tail = tail.next;
            kol = kol + 1;
        }
            Node ref = head;
            while (ref != null) {
                d = d + ref.value;
                ref = ref.next;
            }

            System.out.println("сумма=" + d);
            System.out.println("количество=" + kol);
            System.out.println("сумма нечетные чисел=" + nechet);
            System.out.println("кол-во нечетные чисел=" + cr);
            System.out.println("среднее значение среди нечетных чисел="+(nechet/cr));
    }
}
