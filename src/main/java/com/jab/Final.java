package com.jab;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args) {
        //create a new finch robot instance
        Finch myFinch = new Finch();

// move forward while there's at least 15cm space ahead moving 10cm with the speed being 100
        while (myFinch.getDistance() > 15) {
            int distance = myFinch.getDistance();
            System.out.println("Distance: " + distance);
            myFinch.setMove("F", 10, 100);
        }

        //turn left 90 degrees at 100 speed
        myFinch.setTurn("L", 90, 100);

        //move forward while there's at least 13cm space ahead moving 10cm at a time with speed being 100
while (myFinch.getDistance() > 13) {
            int distance = myFinch.getDistance();
            System.out.println("Distance: " + distance);
            myFinch.setMove("F", 10, 100);
        }
        
        //turn left 90 degres at speed 100
         myFinch.setTurn("L", 90, 100);

         //move forward while there's at least 30cm space ahead moving 10cm at a time, with speed being 100
         while (myFinch.getDistance() > 30) {
            int distance = myFinch.getDistance();
            System.out.println("Distance: " + distance);
            myFinch.setMove("F", 10, 100);
        }

        //turn right 90 degrees at a speed of 100
 myFinch.setTurn("R", 90, 100);

 //move forward 45cm at a 100 speed
myFinch.setMove("F", 45, 100);

//turn right 90 degrees at a speed of 100
myFinch.setTurn("R", 90, 100);

//move forward while there's at least 9cm space ahead moving 10cm at a time, with speed being 100
while (myFinch.getDistance() > 9) {
    int distance = myFinch.getDistance();
    System.out.println("Distance: " + distance);
    myFinch.setMove("F", 10, 100);
}

// turn right 90 degrees at speed 100
myFinch.setTurn("R", 90, 100);

// move forward while there's at least 8cm space ahead moving 10cm at a time, with speed being 100
while (myFinch.getDistance() > 8) {
    int distance = myFinch.getDistance();
    System.out.println("Distance: " + distance);
    myFinch.setMove("F", 10, 100);
}

//turn left 90 degrees at speed 100
myFinch.setTurn("L", 90, 100);

//move forward while theres at least 10cm space ahead moving 10cm at a time, with speed being 100
while (myFinch.getDistance() > 10) {
    int distance = myFinch.getDistance();
    System.out.println("Distance: " + distance);
    myFinch.setMove("F", 10, 100);
}

//turn left 90 degrees at speed 100
myFinch.setTurn("L", 90, 100);

//move forward with at least 5cm of space ahead, moving 10 cm at a time, with speed being 100
while (myFinch.getDistance() > 5) {
    int distance = myFinch.getDistance();
    System.out.println("Distance: " + distance);
    myFinch.setMove("F", 10, 100);
}
//stop all finch movements and disconnects
        myFinch.stopAll();
        myFinch.disconnect();
    }
}