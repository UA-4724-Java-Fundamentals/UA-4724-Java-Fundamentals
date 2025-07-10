package com.softserve.academy.module01.Homework10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Collection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(250)-100);
        }
        System.out.println(myCollection);

        //1
        int min = Collections.min(myCollection);
        int max = Collections.max(myCollection);
        int imin = myCollection.indexOf(min);
        int imax = myCollection.indexOf(max);

        Collections.swap(myCollection, imin, imax);
        System.out.println(myCollection);
        //2
        int firstminusindex=0;

        for (int i = 0; i < 10; i++) {
            if(myCollection.get(i)<0){
                firstminusindex=myCollection.indexOf(myCollection.get(i));
                break;
            }
        }
        myCollection.add(firstminusindex, rand.nextInt(899)+100);
        System.out.println(myCollection);

        //3
        int i=0;
        while (i < myCollection.size() - 1) {
            if (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0 ||
                    myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
                i += 2;
            } else {
                i++;
            }
        }
        System.out.println(myCollection);
        //4
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.addAll(myCollection.subList(0, myCollection.size()/2));
        System.out.println(list1);

        list2.addAll(myCollection.subList(myCollection.size()/2, myCollection.size()));
        Collections.reverse(list2);
        System.out.println(list2);

        //5
        boolean found = false;
        for (int j = myCollection.size() - 1; j >= 0; j--) {
            if (myCollection.get(j) % 2 == 0&&myCollection.get(j) != 0) {
                myCollection.remove(j);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("There are no paired elements");
        }
        System.out.println(myCollection);
        //6
        int newmin = Collections.min(myCollection);
        int newindexmin = myCollection.indexOf(newmin);

        if(newindexmin<myCollection.size()){
            myCollection.remove(newindexmin+1);
        }
        System.out.println(myCollection);

    }
}
