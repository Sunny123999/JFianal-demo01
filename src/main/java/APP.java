import com.jfinal.server.undertow.UndertowServer;
import demo.DemoConfig;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/30 10:40
 * @Description ：启动类
 */
public class APP {
    public static void main(String[] args) {
        UndertowServer.start(DemoConfig.class, 70, true);
    }
}
