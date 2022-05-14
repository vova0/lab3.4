import java.util.Scanner;
public class startN02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Введиите число n отрицательное ");
        int No=0;
        int max=0;
        int min=0;
        int n = sc.nextInt()*(-1);
        Node head=new Node(0, null);
        Node tail=head;
        for (int i = 0; i <n; i++) {
            if ((i+1) % 2 != 0) {
                tail.next=new Node(i+1, null);
                tail=tail.next;
            }
        }
        Node ref = head;
        ref = ref.next;
        min= ref.value;
        while (ref != null) {
            System.out.print("-"+ref.value);
            max= ref.value;
             No=No+1;
            if (max<min){
                max=min;
            }
            ref = ref.next;
        }
        System.out.println("");
        System.out.println("Вывод:");
        System.out.println("минимальное=-"+max+" номер "+No);
        System.out.println("максимальное=-"+min+" номер 1");
    mesto(min,max,n);
    }
    public static void mesto(int m,int d,int n){
        int max=m;
        int min=d;
        Node head=new Node(0, null);
        Node tail=head;
        head=new Node(min,head);
        for (int i = 0; i <n; i++) {
            if ((i+1) % 2 != 0) {
                tail.next=new Node(i+1, null);
                tail=tail.next;
            }
        }
        Node newtail=new Node(max, null);
        Node ref = head;
        int k=1;
        while (ref.next!= null && (k<6 )) {
            ref = ref.next;
            k++;
        }
        ref.next=ref.next.next;
        ref = head;
        int l=1;
        while (ref.next!= null && (l==1 )) {
            ref = ref.next;
            l++;
        }
        ref.next=ref.next.next;
         ref = head;

        while (ref != null) {
            if (ref.value!=0)
                System.out.print("-" + ref.value);
            ref = ref.next;
        }
        ref = head;
        ref.next=newtail;
        while (ref.next != null) {
            ref = ref.next;
        }
        System.out.print("-" + ref.value);
    }
}



