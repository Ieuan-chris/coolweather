package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yanyun on 2017/3/11.
 */

public class Province extends DataSupport {
    private int id;

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    private String provinceName;
    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }
}
