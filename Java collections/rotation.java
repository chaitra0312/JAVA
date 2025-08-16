// through loop
import java.util.*;
class Main {
    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      list.add(7);
      int k=3;
      for(int i=0;i<k;i++){
        int last = list.remove(list.size()-1);         
        list.add(0,last);
    }
    System.out.println(list);
}
}


//optimized
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int k = 3; 
        int n = list.size();
        k = k % n; // handle cases when k > n

        // last k elements
        List<Integer> lastPart = list.subList(n - k, n);
        // first n-k elements
        List<Integer> firstPart = list.subList(0, n - k);

        // merge them into new ArrayList
        ArrayList<Integer> rotated = new ArrayList<>(lastPart);
        rotated.addAll(firstPart);

        System.out.println(rotated); 
        // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
