package com.briup.java.day7;

public class Test2 {
    public static void main(String[] args) {
        Object obj;
        String str;

        User u1 = new User(100,"wangwu1","121weas56");
        User u2= new User(100,"lisi1","231231");

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));

        String str1 = new String("x1");
        String str2 = new String("x1");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

    }
}

class User{
    int id;
    String name;
    String pwd;

    public User(int id,String name,String pwd){
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else {
            if(obj instanceof Person) {
                Person c = (Person)obj;
                if(c.id==this.id) {
                    return true;
                }
            }
        }
        return false;
    }

}
