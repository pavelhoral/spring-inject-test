/* Copyright 2013 Jonatan Jönsson
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.stackoverflow.springbug.beanfactorydependencyissue;

import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextLoader;

public class TestContextLoader implements ContextLoader
{

	public String[] processLocations(Class<?> clazz, String ... locations)
	{
		return locations;
	}

	public ApplicationContext loadContext(String ... locations) throws Exception
	{
		return Contexts.applicationContext();
	}

}
