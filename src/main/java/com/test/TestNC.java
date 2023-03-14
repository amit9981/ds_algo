package com.test;

import java.util.*;
import java.util.stream.Collectors;
//Java compiler and JIT compiler
/*How hashMap work Internally
//time complexity of finding common element in two list
lambda how internally compile

*
* */
final public class TestNC {
    private String name;
    private String add;

    public TestNC(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public static void main(String[] args) {
        // TestNC testNC=new TestNC("amit","ban");

        List l1 = Arrays.asList(2, 3, 1, 3, 4, 5);
        List l2 = Arrays.asList(7, 3, 1, 6, 4, 0);
        //System.out.println(l1.stream().filter(c -> l2.contains(c)).collect(Collectors.toList()));
        Set newList = new HashSet();
        Set commonVal = new HashSet();

        newList.addAll(l1);
        for (int i = 0; i < l2.size(); i++) {
            if(newList.add(l2.get(i))){

            }else{
                commonVal.add(l2.get(i));
            }
            /*if (l2.contains(l1.get(i))) {
                newList.add(l1.get(i));
            }*/
        }
        System.out.println(commonVal);



    }


}
