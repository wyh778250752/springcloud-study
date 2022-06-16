package com.wuyuhui.eurekaconsumer.controller;


import com.wuyuhui.common.pojo.Address;
import com.wuyuhui.common.pojo.CommonResult;
import com.wuyuhui.eurekaconsumer.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private AddressService addressService;


//    使用restTemplate方式
//    @GetMapping("/consumer/query/{id}")
//    public CommonResult<Address> getAddress(@PathVariable("id") int id) {
//        return restTemplate.getForObject(REST_URL + "/query/" + id, CommonResult.class);
//    }

    @GetMapping("/consumer/query/{id}")
    public CommonResult<Address> getAddress(@PathVariable("id") int id) {
        return addressService.queryAddressById(id);
    }

}
