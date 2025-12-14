package guru.springframework.spring_6_di.services.assignment4;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service("DataSourceService")
public class DataSourceServiceImplDEV implements DataSourceService {

    @Override
    public String getDSString() {
        return "jdbc:sqlserver://<dev_ip\\SQLExpress:1433;" + "databaseName=MyDatabase;" + "user=devUser;" + "password=devPassword;";
    }
}
