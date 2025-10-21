package guru.springframework.spring_6_di.services.assignment4;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("DataSourceService")
public class DataSourceServiceImplQA implements DataSourceService {

    @Override
    public String getDSString() {
        return "jdbc:sqlserver://<qa_ip\\SQLExpress:1433;" + "databaseName=MyDatabase;" + "user=qaUser;" + "password=qaPassword;";
    }
}
