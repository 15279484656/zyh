package com.zyh.controller;

import com.zyh.pojo.Account;
import com.zyh.pojo.User;
import com.zyh.pojo.User02;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping(path = "/save")
    public String save(String name,Integer age){
        System.out.println(name + ":::" + age);
        System.out.println("AccountController----->save()");
        return "false";
    }
    @RequestMapping(path = "/update")
    public String update(Account account){
        System.out.println("AccountController----->update()"+ account);
        return "success";
    }
    @RequestMapping(path = "/delete")
    public String delete(User user){
        System.out.println("AccountController----->delete()"+ user);
        return "success";
    }

    @RequestMapping(path = "/findAll")
    public String findAll(User02 user02){
        System.out.println("AccountController----->findAll()"+ user02.getName());
        return "success";
    }
    @RequestMapping(path = "/findById")
    public String findById(String birthday){
        //自己转换

        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
            Date date = simpleDateFormat.parse(birthday);
            System.out.println("AccountController----->findById()"+date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("AccountController----->findById()"+ birthday);
        return "success";
    }
//    @RequestMapping(path = "/count")
//    public String count(HttpServletRequest request, HttpServletResponse response, HttpSession session){
//        String name = request.getParameter("name");
//        System.out.println(name);
//        System.out.println(request);
//        System.out.println(response);
//        System.out.println(session);
//        return "success";
//    }
}













