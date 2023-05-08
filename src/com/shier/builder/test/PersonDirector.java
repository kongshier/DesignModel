package com.shier.builder.test;

/**
 * @author Shier
 * CreateTime 2023/4/25 23:08
 */
public class PersonDirector {
    private PersonBuilder personBuilder;

    /**
     * 初始化时指定要画什么样的人
     *
     * @param personBuilder
     */
    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }
    public void CreatePerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegRight();
        personBuilder.buildLegLeft();
    }
}
