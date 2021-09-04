package com.example.demo.copy;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 *
 * @author think
 * @date 2021/3/27
 */
@ToString
@Data
public class CopyTest2 {
    public String outerName;
    public InnerClass innerClass;
    public List<InnerClass> clazz;

    @ToString
    @Data
    public static class InnerClass {
        public String innerName;
    }
}