# 开放-封闭原则

## 软件实体(类、模块、函数等)应该可以扩展，但是不可修改       

对于扩展是开放的：Open for extension     
对于更改是封闭的：Closed for modification

构建抽象，使面对需求的改变可以保持相对稳定，从而使得系统可以在第一个版本以后不断推出新的版本

无论模块多么的"封闭"，都会存在一些无法对之封闭的变化。
既然不可能完全封闭，设计人员必须先猜出最有可能发生变化的种类，
然后构造抽象来隔离那些变化。

在我们最初编写代码时，假设变化不会发生。
当变化发生时，我们就创建抽象来隔离以后发生的同类变化。

开放-封闭原则是面向对象设计的核心所在。
遵循这个原则可以带来面向对象技术所声称的巨大好处，
也就是可维护、可扩展、可复用、灵活性好。

开发人员应该仅对程序中呈现出频繁变化的部分做抽象，
对于程序中每个部分都可以的进行抽象并不是一个好主意。
拒绝不成熟的抽象和抽象本身一样重要!!!