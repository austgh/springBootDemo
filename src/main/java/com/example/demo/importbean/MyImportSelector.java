package com.example.demo.importbean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author qxt
 * @date 2022年12月29日 7:26 PM
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.example.demo.importbean.PersonDemo1"};
    }
}
