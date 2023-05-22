package com.shier.media.test;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:34
 * 国家类
 */
public abstract class Country {
    protected UnitedNations unitedNations;

    /**
     * 得到安理会中介者
     * @param unitedNations
     */
    public Country(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }
}
