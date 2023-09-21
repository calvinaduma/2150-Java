package cpsc2150.listDec;

import java.util.*;

public interface IShuffleList <T> extends List<T>{

    default void shuffle (int swaps){
        Random rand = new Random();
        int one, two;
        for (int i=0; i<swaps; i++){
            one = rand.nextInt(this.size());
            two = rand.nextInt(this.size());
            swap(one,two);
        }
    }

    default void swap (int i, int j){
        T temp = this.get(i);
        this.set(i,this.get(j));
        this.set(j,temp);

    }
}
