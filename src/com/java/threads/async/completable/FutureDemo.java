package com.java.threads.async.completable;

public class FutureDemo {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        FutureDemo futureDemo = new FutureDemo();
        String firstName = futureDemo.getFirstName(); //blocking call consumes 2 secs
        String lastName = futureDemo.getLastName(); //blocking call consumes 2 secs
        String completeName = firstName+" "+lastName;
        System.out.println(completeName);
        System.out.println("time taken to execute these tasks : "+(System.currentTimeMillis()-startTime)+" ms");

    }

    public String getFirstName(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return  "Prasad";
    }

    public String getLastName(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return  "Yara";
    }

    //Output:
    //          Prasad Yara
    //          time taken to execute these tasks : 4438 ms
}
