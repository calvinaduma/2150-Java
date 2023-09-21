package cpsc2150.sets;

import java.util.*;

public class ArraySet<T> extends SetAbs<T> implements ISet<T>{

    /**
     * Correspondences size = myA.size() and self = myA
     *
     * @invariants [set contains no duplicate values]
     */
    private T myA[];

    private int myLength = 0;
    /**
     * @post [ArraySet is empty]
     */
    public ArraySet() {
        myA = (T[]) new Object[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++) myA[i] = null;
        myLength = 0;
    }

    @Override
    public void add(T val) {
        myA[myLength] = val;
        myLength++;
    }

    @Override
    public T remove() {
        Random rand = new Random();
        int r_num = rand.nextInt(myLength);
        T t = myA[r_num];
        for (int i=0; i<myLength; i++){
            if (i==r_num){
                myA[i] = null;
            }
            if (i>r_num && i<myLength){
                myA[i-1] = myA[i];
            }
        }
        myLength--;
        return t;
    }

    @Override
    public boolean contains(T val)
    {
        for (int i=0; i<myLength; i++){
            if (myA[i] == val){
                return true;
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return myLength;
    }
}
