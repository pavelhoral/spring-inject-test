package com.springbug.beanfactorydependencyissue;

import static org.fest.assertions.Assertions.assertThat;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.springbug.beanfactorydependencyissue.DependantBean;

@ContextConfiguration(locations = "/applicationContext.xml")
public class AppTest extends AbstractTestNGSpringContextTests {

    @Resource
    private DependantBean annotatedBean;

    @Test
    public void testThatDependencyIsInjected() {
        // Fails as dependency injection of myClass.myDependency does not work
        assertThat(annotatedBean.getDependencyBean()).isNotNull();
    }
}
