package sample1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LoggingAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		String methodName = invocation.getMethod().getName();
		StopWatch sw = new StopWatch();
		
		sw.start(methodName);
		
		System.out.println("[LOG]METHOD: " + methodName + " is calling");
		Object rtnObj = invocation.proceed(); // 대상 메소드를 실행 시킨다.
		
		sw.stop();
		
		System.out.println("[LOG]METHOD: " + methodName + " was called");
		System.out.println("[LOG]처리시간: " + sw.getTotalTimeMillis()/1000 + "초");
		
		return rtnObj;
	}

}
