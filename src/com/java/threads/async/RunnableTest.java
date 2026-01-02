package com.java.threads.async;

public class RunnableTest {

    public static void main(String[] args) {

         /*
        Thread t = new Thread(new Task());
        t.start();

       Thread t1 = new Thread(new Task());
        t1.start();
        Thread t2 = new Thread(new Task());
        t2.start();


        Thread t3 = new Thread(new Task());
        t3.start();
        Thread t4 = new Thread(new Task());
        t4.start();*/

        for (int i = 0; i <= 100; i++) {
            Thread t = new Thread(new Task());
            t.start();
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("main method is running this line..."+"ran by thread.. "+Thread.currentThread().getName());
        }
    }

}

class Task implements  Runnable{


    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("doing some task by runnable..."+"ran by thread.. "+Thread.currentThread().getName());
        }
    }
}

