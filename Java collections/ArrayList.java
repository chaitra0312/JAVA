import java.util.*;
class Main {
    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
      list.add(10);
      list.add(10);
      list.add(20);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(10);
      list.add(30);
      ArrayList<Integer> result = new ArrayList<>();
      result.add(list.get(0));
      for(int i=1;i<list.size();i++){
          if(!list.get(i).equals(list.get(i-1))){
              result.add(list.get(i));
          }
      }
      System.out.println(result);
    }
}
// to add the elements in the list use the get() method. 
// don't add elements directly like result.add(i) (it will store and add the index of element.
