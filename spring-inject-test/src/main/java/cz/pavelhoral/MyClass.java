package cz.pavelhoral;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

@Component
public class MyClass implements BeanFactoryAware {

    private MyDependency myDependency;

    public MyDependency getMyDependency() {
        return myDependency;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    	myDependency = beanFactory.getBean(MyDependency.class);
    }
    
}
