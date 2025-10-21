package guru.springframework.spring_6_di.controllers.assignment4;


/*
Created by Zsolt Melich (BT - IVR team)
*/

import guru.springframework.spring_6_di.services.assignment4.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class DataSourceController {

    public final DataSourceService dataSourceService;

    public DataSourceController(@Qualifier("DataSourceService") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSourceString()
    {
        return dataSourceService.getDSString();
    }


}
