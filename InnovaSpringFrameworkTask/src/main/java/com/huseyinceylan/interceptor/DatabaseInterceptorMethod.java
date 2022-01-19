package com.huseyinceylan.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@DatabaseInterceptor
@Interceptor
public class DatabaseInterceptorMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("Database bağlantısı kontrol ediliyor: " + context.getMethod());
		
		boolean isLogin = false;
		
		if (isLogin) {
			System.out.println("Database bağlantısı kurulamadı.");
			return null;
		} else {
			
			try {
				context.proceed();
				System.out.println("Database bağlantısı kuruldu: " + "Yönlendirme yapılıyor.");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
		}
		
		return null;
	}
	
}
