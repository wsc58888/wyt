package www.wyt.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableEurekaServer  //启动一个服务注册中心提供给其他应用进行对话
public class EurekaServerApplication 
{
    public static void main( String[] args )
    {
    	  SpringApplication.run(EurekaServerApplication.class, args);
    }
}
