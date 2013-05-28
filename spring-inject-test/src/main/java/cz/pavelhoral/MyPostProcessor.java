package cz.pavelhoral;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyPostProcessor implements BeanFactoryPostProcessor {

    private MyClass myClass;

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Registered bean definitions: " + Arrays.toString(beanFactory.getBeanDefinitionNames()));
		System.out.println("MyClass dependency: " + myClass);
	}
	
	public void setMyClass(MyClass myClass) {
		this.myClass = myClass;
	}

}
