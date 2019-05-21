package overun.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: apolloController
 * @Description:
 * @author: zhangPY
 * @version: V1.0
 * @date: 2019/4/30 15:41
 * @Copyright:
 */
@RestController
public class apolloController {


    private static Logger logger = LoggerFactory.getLogger(apolloController.class);

    @Value("${server.port}")
    String port;

    @GetMapping("hi")
    public String test(String name) {

        logger.debug( "debug log..." );
        logger.info( "info log..." );
        logger.warn( "warn log..." );

        return "hi " + name + " ,i am from port:" + port;

    }



}
