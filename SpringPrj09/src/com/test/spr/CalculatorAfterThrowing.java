/*==================================
 *   CalculatorAfterThrowing.java
 *   - After Throwing Advice 구성
 =================================*/

package com.test.spr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class CalculatorAfterThrowing implements ThrowsAdvice
{
	// CalculatorImpl 에서 숫자가 100보다 크면 예외 발생하도록 처리함
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable
	{
		/*
		try
		{
		} catch (Exception e2)
		{
		}
		*/
		
		Log log = LogFactory.getLog(this.getClass());
		log.info("After Throwing Advice-----------------------------");
		log.info("주업무 처리과정에서 예외 발생시 실행되는 사후 업무");
		log.info("-----------------------------After Throwing Advice");
		
		
	}
}
