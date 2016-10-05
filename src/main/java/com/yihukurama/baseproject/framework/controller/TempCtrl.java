package com.yihukurama.baseproject.framework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * 功能描述: 
 * @Author:dengshuai
 * @Date:2016年10月5日 下午12:59:35
 */
@RestController
public class TempCtrl {
	@ApiOperation(value="简单测试", notes="")
    @RequestMapping(value = "/temptest", method = RequestMethod.GET)
    public String getCode(@RequestParam String phone) {
		//1.生成验证码
		//2.把该验证码和手机号存入数据库
		//3.调用聚合数据发送短信接口
        return "Hello World";
    }
}
