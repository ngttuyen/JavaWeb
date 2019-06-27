/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.ProductDAO;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author quynh
 */
public class GetCurrentDate {

    public static String getCurrentTimeStamp() {
        SimpleDateFormat formDate = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formDate.format(new Date());
        return strDate;
    }
}
