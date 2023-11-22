// 目标：掌握方法重载的应用场景。
// 开发武器系统，功能需求如下
// 1、默认发射一枚子弹
// 2、指定地区发射一枚子弹
// 3、指定地区指定次数发射子弹

package com.itheima.overload;

public class MethodTest1 {
    public static void main(String[] args) {
        WeaponSystem weaponSystem = new WeaponSystem();
        
        // 默认发射一枚子弹
        weaponSystem.fireBullet();
        
        // 在指定地区发射一枚子弹
        weaponSystem.fireBullet("米国");
        
        // 在指定地区指定次数发射子弹
        weaponSystem.fireBullet("脚盆国", 5);
    }
}

class WeaponSystem {
    public void fireBullet() {
        System.out.println("发射一枚子弹");
    }
    
    public void fireBullet(String area) {
        System.out.println("给" + area + "发射一枚子弹");
    }
    
    public void fireBullet(String area, int count) {
        System.out.println("给" + area + "发射" + count + "枚子弹");
    }
}
