package com.demo.module.store.repository.front;

import org.springframework.stereotype.Component;

import com.demo.module.store.repository.front.Store;
import com.demo.module.store.repository.front.StoreWithBLOBs;

@Component("storeMapper")
public interface StoreMapper {
    int deleteByPrimaryKey(Integer storeId);

    int insert(StoreWithBLOBs record);

    int insertSelective(StoreWithBLOBs record);

    StoreWithBLOBs selectByPrimaryKey(Integer storeId);

    int updateByPrimaryKeySelective(StoreWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(StoreWithBLOBs record);

    int updateByPrimaryKey(Store record);
}