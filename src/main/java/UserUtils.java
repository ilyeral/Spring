import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserUtils {
    @Autowired
    @Qualifier("User1")//如果有类型相同的bean，那么此注释用来区分注入哪个
    User user;
    public String getName(){
       return  user.getName();
    }
}
