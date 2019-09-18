package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
中文注释不乱码
 */
@Controller
public class UserController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
    @RequestMapping("/NoRequestParam")
    @ResponseBody
    public String testNoRequestParam(String username){
        String str="testNoRequestParam:"+username;
        System.out.println(str);
        return str;
    }
    @RequestMapping("/RequestParam")
    @ResponseBody
    public String testRequestParam(@RequestParam(required = false) String username){
        String str="testRequestParam:"+username;
        System.out.println(str);
        return str;
    }
    @RequestMapping("/paixv")
    @ResponseBody
    public String testPaiXv(){
        int arr[]={1,9,2,8,3,7};
        for (int j=0;j<arr.length-1;j++){
            for (int i=0;i<arr.length-j-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
    @RequestMapping("/demo")
    @ResponseBody
    public Map<String, String> testdemo() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("姓名:","镎镎");
        map.put("性别:","女");
        map.put("年龄:","23");
        return map;
    }
}
