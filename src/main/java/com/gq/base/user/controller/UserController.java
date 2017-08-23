package com.gq.base.user.controller;

import com.gq.base.user.model.User;
import com.gq.base.user.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ZSL on 2017/7/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name="userService")
    private IUserService userService;
    @RequestMapping("/showUser")
    public String toIndex(ModelMap model, Long id){
//        final CountDownLatch startCount=new CountDownLatch(1);
//        final CountDownLatch endCount=new CountDownLatch(1);
//
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 1; i++) {
//            executor.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        startCount.await();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    userService.updateCountAddOne(1L);
//                    endCount.countDown();
//                }
//            });
//        }
//        long a=System.currentTimeMillis();
//        startCount.countDown();
//        try {
//            endCount.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        long b=System.currentTimeMillis();
//        System.out.println(b-a+"ms");

        User user=userService.getUserByID(id);
        model.addAttribute("user",user);
        return "user";
    }
}
