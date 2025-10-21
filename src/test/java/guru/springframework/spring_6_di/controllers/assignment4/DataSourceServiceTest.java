package guru.springframework.spring_6_di.controllers.assignment4;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("UAT")
public class DataSourceServiceTest {

    @Autowired
    DataSourceController myDataSourceController;

    @Test
    public void getDataSourceString()
    {
        System.out.println(myDataSourceController.getDataSourceString());
    }

}
