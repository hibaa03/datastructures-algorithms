import java.util.Iterator;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(2);
        s1.push(4);
        s1.push(3);
        System.out.println(s1);

       //  s1.pop();
        System.out.println(s1);


        System.out.println(s1.peek());
        // s1.pop();
        // s1.pop();

        boolean status = s1.empty();
        System.out.println(status);

        int indexfound = s1.search(4);
        System.out.println(indexfound);

        Iterator it = s1.iterator();
        while (it.hasNext()) {
            Object s2 = it.next();
            System.out.println(s2);
        }

        System.out.println();
        System.out.println(s1.size());
        s1.sort(null);
        System.out.println(s1);


    }
}
