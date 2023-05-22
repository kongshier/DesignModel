package com.shier.media.test;

/**
 * @author Shier
 * CreateTime 2023/5/22 15:44
 */
public class CountryClient {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil council = new UnitedNationsSecurityCouncil();
        // 各个国家知道安理会存在
        USA usa = new USA(council);
        Iraq iraq = new Iraq(council);

        // 联合国安理会知道每个国家存在
        council.setUsa(usa);
        council.setIraq(iraq);

        usa.declare("不准研制核武器，否则将对你发起战争");
        iraq.declare("我并没有研制核武器，但你不要威胁我");
    }
}
