
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class main {//main ApplicationContext启动
    public static void main(String[] args) throws IOException {
        args=new String[]{
                "classpath:spring-beans.xml"

        };
        ApplicationContext ctx=new ClassPathXmlApplicationContext(args);
        UserUtils utils = (UserUtils)ctx.getBean("utils");
        System.out.println(utils.getName());
        System.out.println(new UserUtils().getName());//此方法不能自动注入--建议用ctx设为static。
    }
}