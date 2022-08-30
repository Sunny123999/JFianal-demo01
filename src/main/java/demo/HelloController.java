package demo;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

/**
 * @Author ：sunny
 * @Date ：Created in 2022/8/30 10:37
 * @Description ：
 */
@Path("/hello")
public class HelloController extends Controller {
    public void index() {
        renderText("Hello JFinal World.");
    }
}
