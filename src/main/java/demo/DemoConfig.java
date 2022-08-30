package demo;

import com.jfinal.config.*;
import com.jfinal.template.Engine;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/30 10:31
 * @Description ：
 */
public class DemoConfig extends JFinalConfig {

    /**
     * 此方法来配置Jfinal常量值，如开发模式常量devModel的配置，如下代码配置了JFinal运行在开发模式下：
     * 在开发模式下，JFinal会对每次请求输出报告，如：URL、Controller、method、以及请求参数
     * @param me
     */
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    /**
     * 此方法来配置JFinal访问路由
     * @param me
     */
    public void configRoute(Routes me) {
        // jfinal 4.9.03 版新增了路由扫描功能，不必手动添加路由
        // me.add("/hello", HelloController.class);
        // 使用路由扫描，参数 "demo." 表示只扫描 demo 包及其子包下的路由
        me.scan("demo.");
    }

    /**
     * 此方法用来配置 Template Engine
     * @param me
     */
    public void configEngine(Engine me) {}

    /**
     * 此方法来配置JFinal的Plugin
     * @param me
     */
    public void configPlugin(Plugins me) {}

    /**
     * 此方法来配置JFinal的全局拦截器，全局拦截器将拦截所有的action请求，除非使用@Clear注解在Controller中清除
     * @param me
     */
    public void configInterceptor(Interceptors me) {}

    /**
     * 此方法用来配置JFinal的Handler。Handler可以接管所有的web请求，并对应用拥有完全的控制权，可以很方便地实现更高层的功能性扩展
     * @param me
     */
    public void configHandler(Handlers me) {}


}
