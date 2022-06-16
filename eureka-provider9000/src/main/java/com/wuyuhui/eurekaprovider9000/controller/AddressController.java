package com.wuyuhui.eurekaprovider9000.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wuyuhui.eurekaprovider9000.pojo.Address;
import com.wuyuhui.eurekaprovider9000.pojo.CommonResult;
import com.wuyuhui.eurekaprovider9000.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class AddressController {

    @Autowired
    private AddressService addressService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/query/{id}")
    public CommonResult<Address> queryAddressById(@PathVariable("id") int id) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        Address one = addressService.getOne(queryWrapper);
        if(one != null) {
            return new CommonResult(200,"查询成功 服务端口:serverPort:" + serverPort,one);
        }else {
            return new CommonResult(444,"查询失败",null);
        }
    }

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("*****element:" + element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-PROVIDER");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t" +
                    instance.getHost()+ "\t" +
                    instance.getPort()+"\t" +
                    instance.getUri());
        }
        return this.discoveryClient;
    }


}
