package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(public boolean add*())")
	public void forPointcutreuse() {}
	
	@Before("forPointcutreuse()")
	public void beforeAddAccountAdvise() {
		
		System.out.println("=======> Executing @before advice ");
		
		
	}

}
