package com.shier.abstractfactory.actual;

/**
 * @author Shier
 * 具体产品类-传统沙发
 */
public class TraditionalSofa implements Sofa {
  public void printInfo() {
    System.out.println("类型: 沙发, 风格: 传统, 价格: 600.0");
  }
}