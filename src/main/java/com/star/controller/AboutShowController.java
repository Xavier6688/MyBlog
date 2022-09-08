package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 关于我界面显示控制器
 * @Date: Created in 23:26 2021/6/27
 * @Author: XAVIER
 * @QQ群: 暂无
 * @URL: https://onestar.newstar.net.cn/
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}