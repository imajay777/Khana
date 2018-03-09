package com.example.admin.foood.Model;

/**
 * Created by admin on 2/22/2018.
 */

public class User {

    private String name;
    private String password;

    public User() {
    }

    public User(String Pname, String Ppassword) {


        name = Pname;
        password = Ppassword;
    }

    public String setname(String Pname) {
        name = Pname;
        return name;
    }

    public String getName() {
        return name;
    }

    public String getpassword() {
        return password;
    }

}
