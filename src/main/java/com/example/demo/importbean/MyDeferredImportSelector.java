package com.example.demo.importbean;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author qxt
 * @date 2022年12月29日 7:58 PM
 */
public class MyDeferredImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        // 也是直接将Person的全限定名放进去
        return new String[]{PersonDemo1.class.getName()};
    }
}
