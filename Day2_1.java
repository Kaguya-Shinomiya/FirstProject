package A;

import java.util.*;


public class Day2_1 {

    public static void main(String[] args)  {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1) != list.get(i) && list.get(i) != list.get(i+1))
                System.out.println(list.get(i));
        }
        System.out.println(list.get(list.size()-1));

    }
}
