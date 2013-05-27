package com.stackoverflow.springbug.beanfactorydependencyissue.bootstrap;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component
public class DependantBean {

    @Resource
    DependencyBean dependencyBean; // Isn't initialized correctly

    public DependencyBean getDependencyBean() {
        return dependencyBean;
    }
}