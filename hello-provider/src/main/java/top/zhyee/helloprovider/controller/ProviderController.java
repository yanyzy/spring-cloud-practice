package top.zhyee.helloprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhyee
 * @date 2018/7/10 下午4:56
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {
    @GetMapping
    public String sayhello() {
        return "hello , this is provider!";
    }
}
