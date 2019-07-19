package com.lonelywolf.boot.linuxdatasource.mydemo.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 业务返回对象
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-19 14:38
 * @Description:
 */
@Data
public class CsDataVerifyDO {
    @JSONField(name = "commodity_name")
    private String commodityName;

}
