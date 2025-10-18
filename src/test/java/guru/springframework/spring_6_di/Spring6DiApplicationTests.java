package guru.springframework.spring_6_di;

import guru.springframework.spring_6_di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testGetControllerFromCtx(){
        MyController myController = applicationContext.getBean(MyController.class);

        System.out.println(myController.sayHello());
    }

    @Autowired
    MyController myController;

    @Test
    void testAutowireOfController(){
        System.out.println(myController.sayHello());
    }

}
