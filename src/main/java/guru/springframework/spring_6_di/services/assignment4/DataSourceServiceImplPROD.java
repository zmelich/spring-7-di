package guru.springframework.spring_6_di.services.assignment4;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("DataSourceService")
public class DataSourceServiceImplPROD implements DataSourceService {

    @Override
    public String getDSString() {
        return "jdbc:sqlserver://<prod_ip\\SQLExpress:1433;" + "databaseName=MyDatabase;" + "user=prodUser;" + "password=prodPassword;";
    }
}
