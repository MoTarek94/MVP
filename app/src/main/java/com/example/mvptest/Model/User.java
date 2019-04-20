package com.example.mvptest.Model;

public class User {

    private static int counter = 0;

    public void increaseCounter()
    {
         User.counter++;
    }
    public int getCounter()
    {
        return User.counter;
    }

}
