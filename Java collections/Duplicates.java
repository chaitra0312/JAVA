import java.util.*;
public class Duplicate {
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(5,2,3,4,3,5,6);
        Set<Integer> set=new HashSet<>();
        Integer Duplicate = null;
        for(int num : list){
            if(set.contains(num)){
                Duplicate = num;
                break;
            }
            set.add(num);
        }
        if(Duplicate != null){
            System.out.println("Duplicates are: "+ Duplicate);
        }
        else {
            System.out.println("Duplicates not found.");
        }
    }
}
