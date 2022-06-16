package com.wuyuhui.eurekaconsumer.service.impl;

import com.wuyuhui.common.feign.AddressFeignService;
import com.wuyuhui.common.pojo.CommonResult;
import com.wuyuhui.eurekaconsumer.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressFeignService addressFeignService;


    public CommonResult queryAddressById(int id) {
        // 通过Feign远程调用
        return addressFeignService.queryAddressById(id);
    }


}
