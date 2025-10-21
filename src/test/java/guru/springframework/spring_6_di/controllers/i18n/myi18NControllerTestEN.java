package guru.springframework.spring_6_di.controllers.i18n;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles("EN")
@SpringBootTest
public class myi18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello(){
        System.out.println(myi18NController.sayHello());
    }

}
