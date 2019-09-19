package cn.itcast.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author: badbad
 * @Date: 2019/9/11 21:51
 * @Version 1.0
 */
public class MyAspectXml {

    public void checkPri(JoinPoint joinPoint){
        System.out.println("前置增强。。。"+joinPoint);
    }

    public void writeLog(String rtn) {
        System.out.println("后置增强。。。" + rtn);
    }

    public Object aound(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前置增强");
        Object rtn = joinPoint.proceed();
        System.out.println("环绕增强。。");
        return rtn;
    }

    public void ahfterThrowing(Throwable e)  {

        System.out.println("异常增强"+e.getMessage());

    }

    public void after()  {
        System.out.println("最终增强");
    }
}
