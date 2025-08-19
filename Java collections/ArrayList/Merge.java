import java.util.*;
class Demo {
    public static void main(String[]args){
        ArrayList<String> playlist1 = new ArrayList<>();
        playlist1.add("Baby");
        playlist1.add("Lover");
        playlist1.add("No one");
        ArrayList<String> playlist2 = new ArrayList<>();
        playlist2.add("Mawa");
        playlist2.add("Lahari");
        playlist2.add("Chaitu");
        ArrayList<String> merge = new ArrayList<>(playlist1);
        merge.addAll(playlist2);
        ArrayList<String> result = new ArrayList<>();
        for(String song:merge){
            if(!result.contains(song)){
                result.add(song);
            }
        }
        System.out.println("Final Playlist: "+result);
    }
}
