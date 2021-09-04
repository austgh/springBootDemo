package com.example.demo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by think on 2021/2/18.
 */
public class Myclass implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("annotationMetadata 信息:"+annotationMetadata);
        return new String[]{"com.example.demo.TestC"};
    }
}
