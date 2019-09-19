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
public class MyAspectXmlAnno {

    @Before(value = "execution(* cn.itcast.service.UserService.save())")
    public void checkPri(JoinPoint joinPoint){
        System.out.println("前置增强。。。"+joinPoint);
    }

    @AfterReturning(value = "execution(* cn.itcast.service.UserService.update())",returning = "rtn")
    public void writeLog(String rtn) {
        System.out.println("后置增强。。。" + rtn);
    }

    @Around(value = "execution(* cn.itcast.service.UserService.delete())")
    public Object aound(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前置增强");
        Object rtn = joinPoint.proceed();
        System.out.println("环绕增强。。");
        return rtn;
    }


    @AfterThrowing(value = "execution(* cn.itcast.service.UserService.delete())",throwing = "e")
    public void ahfterThrowing(Throwable e)  {

        System.out.println("异常增强"+e.getMessage());

    }

    @After(value = "execution(* cn.itcast.service.UserService.delete())")
    public void after()  {
        System.out.println("最终增强");
    }
}
