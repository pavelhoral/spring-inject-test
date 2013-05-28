package cz.pavelhoral;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class MyTest {

    @Resource
    private MyClass myClass;

    @Test
    public void testThatMyDependencyIsInjected() {
        Assert.assertNotNull(myClass.getMyDependency());
    }

}
