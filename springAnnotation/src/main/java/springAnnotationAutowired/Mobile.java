package springAnnotationAutowired;

import org.springframework.stereotype.Component;

@Component
public class Mobile implements MobileProcessor {
	
	public void process() {
		System.out.println(" The Process Method ");
	}

}
