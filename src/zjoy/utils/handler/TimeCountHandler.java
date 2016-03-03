package zjoy.utils.handler;

 import java.lang.reflect.InvocationHandler;
 import java.lang.reflect.Method;

 /**
 * 实现在方法调用前后向控制台输出两句字符串
 * 
 * @author jiqinlin
 *
 */
 public class TimeCountHandler implements InvocationHandler{
    //要代理的原始对象
     private Object obj;
    
    public TimeCountHandler(Object obj) {
        super();
        this.obj = obj;
    }

    /**
     * 在代理实例上处理方法调用并返回结果
     * 
     * @param proxy 代理类
     * @param method 被代理的方法
     * @param args 该方法的参数数组
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //调用之前
        long start = System.currentTimeMillis();
        //调用原始对象的方法
        result=method.invoke(obj, args);
        //调用之后
        long end = System.currentTimeMillis();
        System.out.println("方法 ："+method.getName()+"消耗的时间是  ： "+(end-start)+"毫秒");
        return result;
    }
}