package com.recyclerview.recyclerview.utils;

import com.recyclerview.recyclerview.model.User;

import java.util.ArrayList;

public class UserData {

    // I am edited

    public static ArrayList<User> generateUserList(){

        ArrayList<User> userArrayList = new ArrayList<>();

        // creating some users
        User user1 = new User("Shafi","01xxxxxxxxxx","22");
        User user2 = new User("Rabbi","01xxxxxxxxxx","20");
        User user3 = new User("Ahmed","01xxxxxxxxxx","21");
        User user4 = new User("Apu","01xxxxxxxxxx","15");
        User user5 = new User("Emon","01xxxxxxxxxx","17");
        User user6 = new User("Robin","01xxxxxxxxxx","17");
        User user7 = new User("Rabbi","01xxxxxxxxxx","17");
        User user8 = new User("Hasan","01xxxxxxxxxx","17");
        User user9 = new User("Shahadin","01xxxxxxxxxx","17");
        User user10 = new User("Mridul","01xxxxxxxxxx","17");

        // adding users in arrayList
        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);
        userArrayList.add(user5);
        userArrayList.add(user6);
        userArrayList.add(user7);
        userArrayList.add(user8);
        userArrayList.add(user9);
        userArrayList.add(user10);

        return userArrayList;
    }


}
