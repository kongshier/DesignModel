package com.shier.abstractfactory.actual;

/**
 * @author Shier
 * 具体工厂类-传统风格家具
 */
public class TraditionalFurnitureFactory implements FurnitureMaker {
  public Chair createChair() {
    return new TraditionalChair();
  }

  public Sofa createSofa() {
    return new TraditionalSofa();
  }
}