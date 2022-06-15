package com.wuyuhui.eruekaprovider9001.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wuyuhui.eruekaprovider9001.pojo.Address;
import com.wuyuhui.eruekaprovider9001.pojo.CommonResult;
import com.wuyuhui.eruekaprovider9001.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/query/{id}")
    public CommonResult<Address> queryAddressById(@PathVariable("id") int id) {

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        Address one = addressService.getOne(queryWrapper);
        if(one != null) {
            return new CommonResult(200,"查询成功 服务端口:serverPort:" + serverPort,one);
        }else {
            return new CommonResult(444,"查询失败 服务端口:serverPort:" + serverPort,null);
        }
    }


}
