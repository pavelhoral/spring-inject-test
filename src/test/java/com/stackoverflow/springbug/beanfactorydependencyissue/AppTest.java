package com.stackoverflow.springbug.beanfactorydependencyissue;

import static org.fest.assertions.Assertions.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.stackoverflow.springbug.beanfactorydependencyissue.bootstrap.DependantBean;

@ContextConfiguration(loader = TestContextLoader.class)
public class AppTest extends AbstractJUnit4SpringContextTests
{

	@Resource private DependantBean annotatedBean;

	@Test
	public void testThatDependencyIsInjected()
	{
		// Fails as dependency injection of myClass.myDependency does not work
		assertThat(annotatedBean.getDependencyBean()).isNotNull();
	}
}
