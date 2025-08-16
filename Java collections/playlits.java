import java.util.*;
class Main {
    public static void main(String[] args) {
      ArrayList<String> list=new ArrayList<>();
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");
      list.add("E");
      list.add("F");
      list.add("G");
      Scanner sc=new Scanner(System.in);
      int k = sc.nextInt();
      int n = list.size();
      k =k%n;
     List<String> lastPart = list.subList(n - k, n);
        List<String> firstPart = list.subList(0, n - k);

        ArrayList<String> rotated = new ArrayList<>(lastPart);
        rotated.addAll(firstPart);
        System.out.println(rotated); 
}
}
