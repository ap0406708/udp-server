package com.jancky.app;

import static java.lang.System.exit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Function:
 *
 * @author jancky
 *         Date: 18/09/2018 15:30
 * @since JDK 1.8
 */

@ComponentScan("com.jancky")
//@Configuration
@SpringBootApplication
//@EnableAutoConfiguration
public class SpringBootConsoleApplication {

	private final static Logger LOGGER = LoggerFactory.getLogger(SpringBootConsoleApplication.class);
	
    public static void main(String[] args) throws Exception {

        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        LOGGER.info("启动 Server 成功");
        //SpringApplication.run(SpringBootConsoleApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//
//        if (args.length > 0 ) {
//            System.out.println(args[0].toString());
//        }else{
//            System.out.println("null args");
//        }
//
//        exit(0);
//    }
}

