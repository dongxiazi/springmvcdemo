package cn.tx.demo2;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xiazidong
 * @Date: 2020/11/3
 */
public class StringToDate implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (s==null){
            throw new RuntimeException("请填写日期");
        }
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = sdf.parse(s);
            return d;

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
