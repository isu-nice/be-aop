package start.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

// 포인트컷 참조용(공용으로 사용하기 위함)
public class Pointcuts {

    @Pointcut("execution(* start.aop.order..*(..))")
    public void allOrder() {
    }

    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {
    }

    @Pointcut("allOrder() && allService()")
    public void orderAndService() {
    }
}
