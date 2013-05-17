package cz.pavelhoral;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class MyTest extends AbstractTestNGSpringContextTests {

    @Resource
    private MyClass myClass;

    @Resource
    private MyDependency myDependency;

    @Test
    public void testThatMyDependencyIsInjected() {
        Assert.assertNotNull(myClass.getMyDependency());
    }

}
