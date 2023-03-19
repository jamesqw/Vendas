/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nicolas
 */
public class Datas {

    public java.sql.Date converterDataParaDateUS(Date pData) throws ParseException {
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy/MM/dd");
        String dataString = formatarDate.format(pData);
        if (pData == null || pData.equals("")) {
            return null;
        }

        java.sql.Date date = null;

        try {
            DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            date = new java.sql.Date(((java.util.Date) formatter.parse(dataString)).getTime());
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }
}
