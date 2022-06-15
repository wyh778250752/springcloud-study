package com.wuyuhui.eurekaconsumer.controller;


import com.wuyuhui.common.pojo.Address;
import com.wuyuhui.common.pojo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static com.wuyuhui.eurekaconsumer.Const.RestConst.REST_URL;


@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/query/{id}")
    public CommonResult<Address> getAddress(@PathVariable("id") int id) {
        return restTemplate.getForObject(REST_URL + "/query/" + id, CommonResult.class);
    }

}
