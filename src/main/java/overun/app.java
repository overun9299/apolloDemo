package overun;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: app
 * @Description:
 * @author: zhangPY
 * @version: V1.0
 * @date: 2019/4/30 15:24
 * @Copyright:
 */
@SpringBootApplication
@EnableApolloConfig
public class app {


    public static void main(String[] args) {
        SpringApplication.run(app.class ,args);
    }

}
