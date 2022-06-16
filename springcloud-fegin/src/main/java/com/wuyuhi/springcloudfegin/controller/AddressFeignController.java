package com.wuyuhi.springcloudfegin.controller;

import com.wuyuhi.springcloudfegin.service.AddressFeignService;
import com.wuyuhui.common.pojo.Address;
import com.wuyuhui.common.pojo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressFeignController {


    @Autowired
    private AddressFeignService addressFeignService;

    @GetMapping("/consumer/query/{id}")
    public CommonResult<Address> getAddressById(@PathVariable("id") int id) {
        return addressFeignService.queryAddressById(id);
    }
}

