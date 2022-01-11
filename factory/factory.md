## 工厂模式

工厂模式是为了把初始化对象的逻辑从具体业务代码中分离出来，做到业务代码和初始化对象的松耦合。

### 简单工厂模式

简单工厂模式就是声明一个工厂类，将初始化对象的逻辑放在这个工厂类里。
简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，
对于客户端来说，去除了与具体产品的依赖。

这样每新增一个对象类型，就要在这个工厂类里新增初始化逻辑，违反了开放封闭原则。
策略模式文件下的normal包就用了简单工厂模式。

### 工厂方法模式

工厂方法模式，定义一个用于创建对象的接口，让子类或实现类决定实例化那一个类。
工厂方法使一个类的实例化延迟到其子类或实现类。

工厂方法模式实现时，客户端需要决定实例化哪一个工厂类来执行具体的实例化。
选择判断问题还是存在的，也就是说工厂方法把简单工厂的内部逻辑判断移到了客户端代码来进行。
你想要加功能，简单工厂中是修改工厂类，工厂方法中是修改客户端。