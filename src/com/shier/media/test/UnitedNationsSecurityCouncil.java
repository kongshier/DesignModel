package com.shier.media.test;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:42
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {
    private USA usa;
    private Iraq iraq;

    /**
     * 联合国安理会了解所有国家，所有拥有所有国家的对象属性
     *
     * @param usa
     */
    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    /**
     * 对象间的通信
     * @param message
     * @param country
     */
    @Override
    public void declare(String message, Country country) {
        if (country == this.usa) {
            iraq.getMessage(message);
        } else if (country == this.iraq){
            usa.getMessage(message);
        }
    }
}
