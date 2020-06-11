# jdk8 新特性
## 函数式接口
- 概念

  - **有且只有一个**抽象方法的接口，适用于函数式编程，java中的函数式编程的体现就是Lambda
  - 语法糖：更加方便，但是原理不变的代码语法，比如for-each 就是迭代器的实现
  - **Lamda 也可以当作是匿名内部类的语法糖，但是又不一样，因为匿名内部类会产生class文件，但是lambda不会产生，效率更高，会延迟执行**
  - 

- 格式

  - 定义方式

  ```java
  修饰符 interface 接口名称{
  		public abstract 返回值类型 方法名称(可选参数信息)；
  		// 其他非抽象方法
  }
  ```

  - @FunctionalInterface 
    - 用来检测接口是否为函数式接口，如果在不是函数式接口的接口上标注该注解，编译时就会出错

- 使用
  - 使用延时加载的特性来记录日志
  - 作为方法的参数或者返回值来使用
    - Runnable 接口就是一个函数接口，可以使用lambda方式来使用
    - Comparator 接口就是 一个函数接口，可以作为方法的返回值

### 常用的函数式接口

#### Supplier接口

- T get()方法  生产指定范型的字符串，怎么生产需要自己实现

#### Consumer接口

- void accept(T t) 消费范型指定的数据，怎么消费需要自己实现
- andThen(Comsumer<T> after) 组合Consumer接口

#### Predicate 接口

- boolean test(T t) 对于传入的范型数据进行判断
- Predicate<T> and(Predicate<T> p) 与运算
- Predicate<T> or(Predicate<T> p) 或运算
- Predicate<T> negate() 取反

#### Function 接口

- 通过 一个类型的数据得到另外一个类型的数据，转换作用，前者称之为前置条件，后者称为后置条件
- R apply(T t)
- andThen



## Stream流

- 概念
  - 解决集合和数组的弊端，循环遍历主要是解决怎么做，但是Lambda解决的是What而不是How，比如要解决集合元素的过滤，传统的便利方式存在了弊端
  - 类似生产车间的流水线
    - 拼接流式模型：建立一个生产线，按照生产线生产产品
  - Stream 并不会存储数据，而是按需计算
  - Stream 流式管道流，只能被消费一次，Stream流调用完毕，数据就会流转到下一个Stream上，而这时上一个Stream就会关闭，就不能调用方法了
  - 中间操作都返回的是Stream
  - 内部迭代
- 获取流
  - 所有Collection集合都可以通过stream方法获取流
  - Stream接口的静态of方 static <T>  of(T..... values)

### 常用方法

#### 延迟方法

- filter(Predicate<?  super T> predicate);
- <R> Stream<R> map(Function<? super T,? extends R> mapper);
- Stream<T> limit(long n); // 截取流的前n个元素
- Stream<T> skip(long n); //跳过前n个元素，如果n的长度大于流的长度返回长度为0的流
- static <T> Stream<T> concat(Stream<? extends T> a,Stream<? extends T> b);



#### 最终方法

- long count() 
- forEach(Consumer<? super T> action);
  - 用来遍历流中的数据



## 方法引用

### 基本定义

- 如果已经存在的对象的方法刚好符合lambda表达式实现的方法，那么可以使用方法引用替代lambda表达式ß
- 使用 :: 作为语意

### 常见使用

- 类的静态方法，直接使用类名::静态方法名 进行方法引用
- 对象的成员方法，使用对象名::成员方法 进行方法引用
- 在继承体系中，子类中可以使用super::父类方法名 进行方法引用
- 本类中，可以使用this::本类方法 进行方法引用
- 构造方法的引用，使用类名::new 进行方法引用



