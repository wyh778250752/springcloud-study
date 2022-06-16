package com.wuyuhi.springcloudfegin.service;

import com.wuyuhui.common.pojo.Address;
import com.wuyuhui.common.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@Component
@FeignClient(value = "EUREKA-PROVIDER")
public interface AddressFeignService {

    @GetMapping("/query/{id}")
    CommonResult<Address> queryAddressById(@PathVariable("id") int id);

}
