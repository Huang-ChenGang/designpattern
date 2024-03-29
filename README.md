# Java 设计模式

## 首先解释一下面向对象的四大好处

- 第一、可维护：
要改只需要更改一个功能变动对应的部分，此为可维护。

- 第二、可复用：
这次写的代码并非这次用完就不再可用，而是在之后的其他地方都可重复使用，此为可复用。

- 第三、可扩展：
如要增加新功能，只需增加新的代码，原有代码无需更改，此为可扩展。

- 第四、灵活性好：
代码的顺序并不是以一种特定的顺序排列的，可以根据需求的变化任意改变顺序，此为灵活性好。

## 设计模式遵循原则
Java可以通过封装、继承、多态把程序的耦合度降低。
用设计模式使得程序更加的灵活，容易修改，并且易于复用。

设计模式设计或者说软件设计的目的就是做到高内聚低耦合
以下整理了一些设计模式所要遵循的原则

- [单一职责原则](/single-responsibility-principle.md) 

- [开放-封闭原则](/open-closed-principle.md)

- [依赖倒置原则(也叫依赖倒转原则，基础是里氏代换原则)](/dependency-inversion-principle.md)

- [里氏代换原则](/liskov-substitution-principle.md)

## 设计模式案例代码
以下是我整理和编写的设计模式的代码和说明：

项目采用maven多模块，各个设计模式的代码在每个单独的模块里。
每个模块都有示例代码和单元测试。

欢迎分享和指正，如果觉得可以的话，欢迎Star和Fork。谢谢

1. [观察者模式](/observer/observer.md)

2. [策略模式](/strategy/strategy.md)

3. [装饰者模式-开放封闭原则体现](/decorator/decorator.md)

4. 
    - [代理模式](/proxy/proxy.md)
    - [代理模式和装饰者模式](/proxy/proxy&decorator.md)

5. [工厂模式](/factory/factory.md)

6. [模板方法模式](/templateMethod/templateMethod.md)

- 更新中...