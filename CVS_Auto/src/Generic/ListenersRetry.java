package Generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Listeners;


public class ListenersRetry implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testcons, Method testMethod) {
		
		annotation.setRetryAnalyzer(FailedRetry.class);
		
	}

}
