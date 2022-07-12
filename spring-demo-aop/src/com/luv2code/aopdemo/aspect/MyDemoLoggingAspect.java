package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Before("execution(public boolean add*())")
	public void beforeAddAccountAdvise() {
		
		System.out.println("=======> Executing @before advice ");
		
		
	}

}
