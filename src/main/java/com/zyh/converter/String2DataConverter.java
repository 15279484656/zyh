//package com.zyh.converter;
//
//
//import org.springframework.core.convert.converter.Converter;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//
///**
// * @author Administrator
// * 时间类型转换器
// * String:表示要转换的类型
// * Date：表示转换后的类型
// */
//public class String2DataConverter implements Converter<String, Date> {
//    @Override
//    public Date convert(String source) {
//        try {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
//            Date date = simpleDateFormat.parse(source);
//            return date;
//        } catch (ParseException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
