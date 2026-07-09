package STACK;
import java.util.*;
public class CopyingStacktoAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        System.out.println("Enter the no of elements ypu wanna enter : ");
        int x = sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<x;i++){
            int num = sc.nextInt();
            st.push(num);
        }
        System.out.println(st)
        ;
        Stack <Integer> gt = new Stack<>();
        while(st.size() > 0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        // Now gt has the reversed order of the stack gt


        Stack <Integer> ht = new Stack<>();
        while(gt.size() > 0){
            ht.push(gt.pop());
        }
        System.out.println(ht);
        // Now ht is the new copy of the st but st erased completely

    }
}
