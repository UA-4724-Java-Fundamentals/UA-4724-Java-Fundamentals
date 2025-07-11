package com.softserve.academy.module01.Homework10.PracticalTasks.Task3_Numbers;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(30));
        }
        System.out.println("myCollection:\n"+myCollection);

        List<Integer> newCollection = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i)>5) {
                newCollection.add(i);
            }
        }
        System.out.println("Positions of element more than 5 in the collection:");
        System.out.println(newCollection);


        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next()>20) {
                iterator.remove();
            }
        }
        System.out.println("Remove from collection elements, which are greater then 20\n"+myCollection);
        try{
            myCollection.add(2,1);
            myCollection.add(8,-3);
            myCollection.add(8,-4);

            for (Integer integer : myCollection) {
                System.out.println("value of element: "+myCollection.indexOf(integer)+" posotion:"+integer);
            }
        } catch (Exception e){
            System.out.println("Error in adding elements"+e.getMessage());
        }

        Collections.sort(myCollection);
        System.out.println("Sorted collection\n"+myCollection);
    }
}
