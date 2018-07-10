package top.zhyee.helloclient.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhyee
 * @date 2018/7/10 下午4:51
 */
@FeignClient("hello-provider")
public interface FeignService {
    @GetMapping("/provider")
    String sayHello();
}
