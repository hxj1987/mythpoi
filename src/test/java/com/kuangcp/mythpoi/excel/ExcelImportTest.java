package com.kuangcp.mythpoi.excel;

import com.kuangcp.mythpoi.excel.base.ExcelTransform;
import com.kuangcp.mythpoi.excel.base.MainConfig;
import com.kuangcp.mythpoi.utils.Employee;
import com.kuangcp.mythpoi.utils.config.DateUtil;
import org.junit.Test;

import javax.sql.rowset.spi.SyncResolver;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by https://github.com/kuangcp on 18-2-23  下午9:54
 *
 * @author kuangcp
 */
public class ExcelImportTest {
//    private static MainConfig mainConfig = MainConfig.getInstance();

    @Test
    public void testImportExcel(){
//        ExcelImport excelImport = new ExcelImport<Employee>();
        // TODO 接收对应类型
        List<Employee> result = ExcelImport.importExcel("/home/kcp/test/employee.xls", Employee.class);
        result.forEach(item -> {
            System.out.println(item.toString());
//            System.out.print(DateUtil.format(item.getBirth())+"|");
//            System.out.print(item.getNames()+"|");
//            System.out.print(item.getQQ());
//            System.out.println();

        });

    }

    @Test
    public void testType(){
//        Boolean a;
//        boolean b;
//        int c;
//        double d;
//        System.out.println(d);
//        System.out.println(c);
//        System.out.println(a);
//        System.out.println(b);
    }
}

