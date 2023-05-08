package com.shier.abstractfactory.actual;

/**
 * @author Shier
 * 具体产品类-现代沙发
 */
public class ModernSofa implements Sofa {
  public void printInfo() {
    System.out.println("类型: 沙发, 风格: 现代, 价格: 500.0");
  }
}