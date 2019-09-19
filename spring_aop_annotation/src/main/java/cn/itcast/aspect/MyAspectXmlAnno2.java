package cn.itcast.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author: badbad
 * @Date: 2019/9/11 21:51
 * @Version 1.0
 */
@Aspect
public class MyAspectXmlAnno2 {

    @Before(value = "MyAspectXmlAnno2.pointcut1()")
    public void checkPri(JoinPoint joinPoint){
        System.out.println("前置增强。。。"+joinPoint);
    }

    @AfterReturning(value = "MyAspectXmlAnno2.pointcut2()",returning = "rtn")
    public void writeLog(String rtn) {
        System.out.println("后置增强。。。" + rtn);
    }

    @Around(value = "MyAspectXmlAnno2.pointcut3()")
    public Object aound(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前置增强");
        Object rtn = joinPoint.proceed();
        System.out.println("环绕增强。。");
        return rtn;
    }


    @AfterThrowing(value = "MyAspectXmlAnno2.pointcut3()",throwing = "e")
    public void ahfterThrowing(Throwable e)  {

        System.out.println("异常增强"+e.getMessage());

    }

    @After(value = "MyAspectXmlAnno2.pointcut3()")
    public void after()  {
        System.out.println("最终增强");
    }


    @Pointcut("execution(* cn.itcast.service.UserService.save())")
    private void pointcut1(){};
    @Pointcut("execution(* cn.itcast.service.UserService.update())")
    private void pointcut2(){};
    @Pointcut("execution(* cn.itcast.service.UserService.delete())")
    private void pointcut3(){};

}
