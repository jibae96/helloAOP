package org.example.cse;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {

    @Pointcut("execution(void org.example.cse.*.sound())")
    private void selectSound(){ //signature

    }

    @Before("selectSound()")
    public void aboutToSound(){
        System.out.println("advice : about to sound");
    }
}
