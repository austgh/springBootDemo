package com.example.demo.copy;

import org.springframework.beans.BeanUtils;
/**
 *
 * @author think
 * @date 2021/3/27
 */

public class CopyTest{
    public static void main(String[] args) {
        CopyTest1 test1 = new CopyTest1();
        test1.outerName = "hahaha";
        CopyTest1.InnerClass innerClass = new CopyTest1.InnerClass();
        innerClass.innerName = "hohoho";
        test1.innerClass = innerClass;

        System.out.println(test1.toString());
        CopyTest2 test2 = new CopyTest2();
        test2.innerClass = new CopyTest2.InnerClass();
        BeanUtils.copyProperties(test1, test2);
        BeanUtils.copyProperties(test1.innerClass, test2.innerClass);

        System.out.println(test2.toString());
    }
}
