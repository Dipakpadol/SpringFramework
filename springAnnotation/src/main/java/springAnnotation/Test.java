package springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
		Samsung s=context.getBean(Samsung.class);
		s.getSamsung();
		

	}

}
