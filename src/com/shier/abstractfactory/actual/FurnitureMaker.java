package com.shier.abstractfactory.actual;

/**
 * 抽象工厂类 - 家具大工厂
 */
interface FurnitureMaker {
    Chair createChair();

    Sofa createSofa();
}
