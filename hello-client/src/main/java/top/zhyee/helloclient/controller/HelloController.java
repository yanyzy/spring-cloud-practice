package top.zhyee.helloclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhyee.helloclient.service.FeignService;

/**
 * @author zhyee
 * @date 2018/7/10 下午4:50
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/say")
    public String getHello() {
        return feignService.sayHello();
    }
}
