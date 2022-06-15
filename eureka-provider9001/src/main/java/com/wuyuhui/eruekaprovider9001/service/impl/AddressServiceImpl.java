package com.wuyuhui.eruekaprovider9001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wuyuhui.eruekaprovider9001.mapper.AddressMapper;
import com.wuyuhui.eruekaprovider9001.pojo.Address;
import com.wuyuhui.eruekaprovider9001.service.AddressService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author 86178
* @description 针对表【smbms_address】的数据库操作Service实现
* @createDate 2022-06-15 11:53:07
*/
@Service
@Transactional
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {



}




