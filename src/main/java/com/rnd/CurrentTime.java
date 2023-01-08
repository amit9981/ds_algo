package com.rnd;

import java.time.LocalDate;

public class CurrentTime {
    public static void main(String[] args) {
        new CurrentTime().generateGitMsg();
    }

    public String generateGitMsg() {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date=" + today);
        String str = this.getClass().getName().substring(8, 19) + " Changes on " + today;
        System.out.println(System.getProperty("user.dir")+"/ds_algo");
        String gitCommandnew = "git commit -a -m " + "'" + str + "'";
        System.out.println(gitCommandnew);


        return str;
    }
}
