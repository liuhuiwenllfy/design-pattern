# 设计模式

设计模式（Design
pattern）代表了最佳的实践，通常被有经验的面向对象的软件开发人员所采用。设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。
> 本教程将通过 Java 实例，一步一步向您讲解设计模式的概念。

# 设计模式的类型

| 序号 | 模式 & 描述                                                                                         | 包括                                                                                                                                                                                                                                                                                                                                                |
|----|-------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1  | 创建型模式<br/>这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。<br/>这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。 | 工厂模式（Factory Pattern）<br/>抽象工厂模式（Abstract Factory Pattern）<br/>单例模式（Singleton Pattern）<br/>建造者模式（Builder Pattern）<br/>原型模式（Prototype Pattern）                                                                                                                                                                                                     |
| 2  | 结构型模式<br/>这些模式关注对象之间的组合和关系，旨在解决如何构建灵活且可复用的类和对象结构。                                               | 适配器模式（Adapter Pattern）<br/>桥接模式（Bridge Pattern）<br/>过滤器模式（Filter、Criteria Pattern）<br/>组合模式（Composite Pattern）<br/>装饰器模式（Decorator Pattern）<br/>外观模式（Facade Pattern）<br/>享元模式（Flyweight Pattern）<br/>代理模式（Proxy Pattern）                                                                                                                          |
| 3  | 行为型模式<br/>这些模式关注对象之间的通信和交互，旨在解决对象之间的责任分配和算法的封装。                                                 | 责任链模式（Chain of Responsibility Pattern）<br/>命令模式（Command Pattern）<br/>解释器模式（Interpreter Pattern）<br/>迭代器模式（Iterator Pattern）<br/>中介者模式（Mediator Pattern）<br/>备忘录模式（Memento Pattern）<br/>观察者模式（Observer Pattern）<br/>状态模式（State Pattern）<br/>空对象模式（Null Object Pattern）策略模式（Strategy Pattern）<br/>模板模式（Template Pattern）<br/>访问者模式（Visitor Pattern） |
| 4  | J2EE 模式<br/>这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。                                           | MVC 模式（MVC Pattern）<br/>业务代表模式（Business Delegate Pattern）<br/>组合实体模式（Composite Entity Pattern）<br/>数据访问对象模式（Data Access Object Pattern）<br/>前端控制器模式（Front Controller Pattern）<br/>拦截过滤器模式（Intercepting Filter Pattern）<br/>服务定位器模式（Service Locator Pattern）<br/>传输对象模式（Transfer Object Pattern）                                                   |

# 设计模式的优点

1. 提供了一种共享的设计词汇和概念，使开发人员能够更好地沟通和理解彼此的设计意图。
2. 提供了经过验证的解决方案，可以提高软件的可维护性、可复用性和灵活性。
3. 促进了代码的重用，避免了重复的设计和实现。
4. 通过遵循设计模式，可以减少系统中的错误和问题，提高代码质量。

# 设计模式的六大原则

1. 开闭原则（Open Close Principle）

   开闭原则的意思是：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

2. 里氏代换原则（Liskov Substitution Principle）

   里氏代换原则是面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP
   是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。

3. 依赖倒转原则（Dependence Inversion Principle）

   这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

4. 接口隔离原则（Interface Segregation Principle）

   这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

5. 迪米特法则（最少知道原则）（Demeter Principle）

   最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。

6. 合成复用原则（Composite Reuse Principle）

   合成复用原则是指：尽量使用合成/聚合的方式，而不是使用继承。

# 工厂模式

> 工厂模式（Factory Pattern）是 Java
> 中最常用的设计模式之一，这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。<br/>
> 工厂模式提供了一种创建对象的方式，而无需指定要创建的具体类。<br/>
> 工厂模式属于创建型模式，它在创建对象时提供了一种封装机制，将实际创建对象的代码与使用代码分离。

## 介绍

**意图：** 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

**主要解决：** 主要解决接口选择的问题。

**何时使用：** 我们明确地计划不同条件下创建不同实例时。

**如何解决：** 让其子类实现工厂接口，返回的也是一个抽象的产品。

**关键代码：** 创建过程在其子类执行。

**优点：**

1. 一个调用者想创建一个对象，只要知道其名称就可以了。
2. 扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
3. 屏蔽产品的具体实现，调用者只关心产品的接口。

**缺点：**
每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的
复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。

**使用场景：**

1. 日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
2. 数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
3. 设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。

**注意事项：**
作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过
new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。

**工厂模式包含以下几个核心角色：**

- 抽象产品（Abstract Product）：定义了产品的共同接口或抽象类。它可以是具体产品类的父类或接口，规定了产品对象的共同方法。
- 具体产品（Concrete Product）：实现了抽象产品接口，定义了具体产品的特定行为和属性。
- 抽象工厂（Abstract Factory）：声明了创建产品的抽象方法，可以是接口或抽象类。它可以有多个方法用于创建不同类型的产品。
- 具体工厂（Concrete Factory）：实现了抽象工厂接口，负责实际创建具体产品的对象。

## 实现

[工厂模式示例（Factory Pattern）](src/main/java/cn/liulingfengyu/designpattern/factorypattern)

1. 创建日志接口（抽象产品）

```java
public interface ILogService {
    /**
     * 保存日志
     */
    void save();
}
```

2. 创建日志实现类（具体产品）

```java
public class LoginLogServiceImpl implements ILogService {
    @Override
    public void save() {
        System.out.println("保存了登录日志");
    }
}
```

```java
public class OperationLogServiceImpl implements ILogService {

    @Override
    public void save() {
        System.out.println("保存了操作日志");
    }
}
```

```java
public class UpdateLogServiceImpl implements ILogService {
    @Override
    public void save() {
        System.out.println("保存了更新日志");
    }
}
```

3. 创建日志工厂（抽象工厂）

```java
/**
 * 工厂类
 *
 * @author liulingfengyu
 */
public class LogFactory {

    /**
     * 获取日志服务实现类对象
     *
     * @param logType 日志类型
     * @return 日志服务实现类对象
     */
    public ILogService getLogService(String logType) {
        ILogService logService = null;

        // 检查日志类型是否为空
        Assert.hasText(logType, "日志类型不能为空");

        // 根据日志类型创建相应的日志服务实现类对象
        if (logType.equals(LogTypeEnum.LOGIN.name())) {
            logService = new LoginLogServiceImpl();
        } else if (logType.equals(LogTypeEnum.OPERATION.name())) {
            logService = new OperationLogServiceImpl();
        } else if (logType.equals(LogTypeEnum.UPDATE.name())) {
            logService = new UpdateLogServiceImpl();
        }

        // 检查是否成功创建了日志服务实现类对象
        Assert.notNull(logService, "没有匹配的日志类型");

        return logService;
    }
}
```

4. 测试类

```java
public class FactoryPatternDemo {

    public static void main(String[] args) {
        // 创建一个日志工厂对象
        LogFactory logFactory = new LogFactory();

        // 根据登录日志类型获取登录日志服务，并调用保存方法
        ILogService loginLogService = logFactory.getLogService(LogTypeEnum.LOGIN.name());
        loginLogService.save();

        // 根据操作日志类型获取操作日志服务，并调用保存方法
        ILogService operationLogService = logFactory.getLogService(LogTypeEnum.OPERATION.name());
        operationLogService.save();

        // 根据更新日志类型获取更新日志服务，并调用保存方法
        ILogService updateLogService = logFactory.getLogService(LogTypeEnum.UPDATE.name());
        updateLogService.save();
    }
}
```

5. 测试结果

```text
保存了登录日志
保存了操作日志
保存了更新日志
```

# 抽象工厂模式

> 抽象工厂模式（Abstract Factory
> Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。<br/>
> 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。<br/>
> 抽象工厂模式提供了一种创建一系列相关或相互依赖对象的接口，而无需指定具体实现类。通过使用抽象工厂模式，可以将客户端与具体产品的创建过程解耦，使得客户端可以通过工厂接口来创建一族产品。

## 介绍

**意图：** 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

**主要解决：** 主要解决接口选择的问题。

**何时使用：** 系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。

**如何解决：** 在一个产品族里面，定义多个产品。

**关键代码：** 在一个工厂里聚合多个同类产品。

**优点：** 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。

**缺点：** 产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。

**抽象工厂模式包含以下几个核心角色：**

- 抽象工厂（Abstract Factory）：声明了一组用于创建产品对象的方法，每个方法对应一种产品类型。抽象工厂可以是接口或抽象类。
- 具体工厂（Concrete Factory）：实现了抽象工厂接口，负责创建具体产品对象的实例。
- 抽象产品（Abstract Product）：定义了一组产品对象的共同接口或抽象类，描述了产品对象的公共方法。
- 具体产品（Concrete Product）：实现了抽象产品接口，定义了具体产品的特定行为和属性。

> 抽象工厂模式通常涉及一族相关的产品，每个具体工厂类负责创建该族中的具体产品。客户端通过使用抽象工厂接口来创建产品对象，而不需要直接使用具体产品的实现类。

## 实现

