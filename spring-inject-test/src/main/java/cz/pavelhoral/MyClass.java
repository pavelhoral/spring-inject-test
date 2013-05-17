package cz.pavelhoral;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class MyClass implements MyInterface {

    @Resource
    private MyDependency myDependency;

    public MyDependency getMyDependency() {
        return myDependency;
    }

}
