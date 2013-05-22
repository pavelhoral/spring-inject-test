package com.springbug.beanfactorydependencyissue;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactoryPostProcessorConfiguration {

    /**
     * The {@link DependantBean} here causes the bug, can
     * {@link BeanFactoryPostProcessor} have regular beans as dependencies?
     */
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor(
            DependantBean dependantBean) {
        return new BeanFactoryPostProcessor() {

            public void postProcessBeanFactory(
                    ConfigurableListableBeanFactory beanFactory)
                    throws BeansException {

            }
        };
    }
}
