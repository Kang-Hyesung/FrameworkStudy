/*===================================================
 *   CalculatorImpl.java
 *   - 클래스.
 *   - Calculator 인터페이스를 구현하는 클래스.
 *   - 주 업무, 보조 업무가 함께 처리되는 형태
 ==================================================*/

package com.test.spr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class CalculatorImpl implements Calculator
{
	// 주 업무(core concern) 진행을 위한 메소드 구현
	
	
	@Override
	public int add(int x, int y)
	{
		int result = 0;
		
		// 앞뒤에서 진행되기 때문에 Around Advice
		// 보조 업무(cross-cutting concern) 설정
		// 시간 측정
		Log log = LogFactory.getLog(this.getClass());
		// 현재 클래스인 CalculatorImpl을 기반으로 로그를 생성해 내겠다.
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작 ----------"); // 이 문구를 로그에 남긴다.
		
		// 주 업무(core concern) 실행 내용
		result = x + y;
		
		System.out.printf("%d + %d = %d%n", x, y, result);
		
		// 주 업무가 끝났으니 멈춤 처리
		// 보조 업무(cross-cutting concern) 설정
		sw.stop();
		log.info("처리 시간 측정 종료 ----------");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		
		return result;
	}

	@Override
	public int sub(int x, int y)
	{
		int result = 0;
		
		// 보조 업무(cross-cutting concern) 설정
		// 시간 측정
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작");
		
		// 주 업무(core concern) 실행 내용
		result = x - y;
		
		System.out.printf("%d - %d = %d%n", x, y, result);
		
		// 주 업무가 끝났으니 멈춤 처리
		// 보조 업무(cross-cutting concern) 설정
		sw.stop();
		log.info("처리 시간 측정 종료");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		
		return result;
	}

	@Override
	public int multi(int x, int y)
	{
		int result = 0;
		
		// 보조 업무(cross-cutting concern) 설정
		// 시간 측정
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작");
		
		
		// 주 업무(core concern) 실행 내용
		result = x * y;
		
		System.out.printf("%d * %d = %d%n", x, y, result);
		
		// 주 업무가 끝났으니 멈춤 처리
		// 보조 업무(cross-cutting concern) 설정
		sw.stop();
		log.info("처리 시간 측정 종료");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		return result;
	}

	@Override
	public int div(int x, int y)
	{
		int result = 0;
		// 보조 업무(cross-cutting concern) 설정
		// 시간 측정
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("처리 시간 측정 시작");
		
		// 주 업무(core concern) 실행 내용
		result = x / y;
		
		System.out.printf("%d / %d = %d%n", x, y, result);
		
		// 주 업무가 끝났으니 멈춤 처리
		// 보조 업무(cross-cutting concern) 설정
		sw.stop();
		log.info("처리 시간 측정 종료");
		log.info(String.format("경과시간 : %s/1000초", sw.getTotalTimeMillis()));
		
		return result;
	}
	
}
