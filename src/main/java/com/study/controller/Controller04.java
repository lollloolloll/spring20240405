package com.study.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Iterator;

@Controller
@RequestMapping("main4")
public class Controller04 {

    @RequestMapping("sub1")
    public void sub1(WebRequest request) {
        Iterator<String> names = request.getParameterNames();

        while (names.hasNext()) {
            String name = names.next();
            System.out.println(name);
        }
    }

    @RequestMapping(value = "sub2", params = {"name", "age", "city", "country"})
    public void sub2(WebRequest request) {
        Iterator<String> names = request.getParameterNames();

//        while (names.hasNext()) {
//            String name = names.next();
////            System.out.println(name);
//            String age = request.getParameter(name);
//            System.out.println(age + "=" + value);
//
//
//        }
    }

    @RequestMapping("sub3")
    public void sub3(WebRequest request) {
        String value = request.getParameter("query");
        if (value != null) {
            System.out.println(value + "검색하기 로직실행");
            System.out.println("검색결과 응답하기.");
        }
    }

    @RequestMapping("sub4")
    public void sub4(WebRequest request) {
        String value = request.getParameter("query");
        if (value != null) {
            System.out.println(value + "에 대한 정보");
        }
    }


    @RequestMapping("sub5")
    public void sub5(WebRequest request) {
        String value = request.getParameter("age");
        int age = Integer.parseInt(value);

        if (age < 13) {
            System.out.println("유아용 정보 검색");
        } else if (age < 19) {
            System.out.println("청소년 정보 검색");
        } else {
            System.out.println("성인용 정보 검색");
        }


    }

    @RequestMapping("sub6")
    public void sub6(WebRequest request) {
        String value = request.getParameter("weight");
        double weight = Double.parseDouble(value);

        if (weight < 50.0) {
            System.out.println("저체중");
        } else if (weight < 90.0) {
            System.out.println("보통");
        } else {
            System.out.println("과체중");
        }
    }
}
