package com.jab;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args) {
        Finch myFinch = new Finch();


        while (myFinch.getDistance() > 13) {
            int distance = myFinch.getDistance();
            System.out.println("Distance: " + distance);
            myFinch.setMove("F", 10, 100);
        }

        myFinch.setTurn("L", 90, 100);

while (myFinch.getDistance() > 13) {
            int distance = myFinch.getDistance();
            System.out.println("Distance: " + distance);
            myFinch.setMove("F", 10, 100);
        }
        
         myFinch.setTurn("L", 90, 100);

         while (myFinch.getDistance() > 30) {
            int distance = myFinch.getDistance();
            System.out.println("Distance: " + distance);
            myFinch.setMove("F", 10, 100);
        }

 myFinch.setTurn("R", 90, 100);


        myFinch.stopAll();
        myFinch.disconnect();
    }
}