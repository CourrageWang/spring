## 解决spring bean自动装配的歧义性问题
* 使用@Primary
* 使用@Qualifier 限定符。
#### 使用限定符和类Id
```
@Component("festival")
```
* 也可以不用指定类的Id名称，类名的默认id为类名的首字母小写。
### 处理自定义Bean装配的歧义性
 * 首选bean  在声明的时候使用@primary  但是只能定义一个@Primary。
 * 使用限定符  在声明的时候和装配的时候，分别使用@Qualifer 
 ####  使用限定符和bean id
  * 在声明的时候指定bean的id （默认id是首字母的小写的类名）。
  * 在装配的时候使用@Qualifier。
 ``` @Resource(name = "userServiceFestival")
    @Resource 注解相当于 
     @Component
     @Qualifier("festival")
 ``` 
####  设置组件扫描的基础包
```
//@ComponentScan(value = "com.xiyou.java.hello.hello3")
//使用此方式的话，如果挪动类的位置需要更改以下配置信息。
//@ComponentScan(basePackages = {"com.xiyou.java.hello.hello3.service","com.xiyou.java.hello.hello3.dao","com.xiyou.java.hello.hello3.web"})

@ComponentScan(basePackageClasses ={UserController.class, UserDaoImpl.class, UserServiceNormal.class} )

```
#### 使用xml启用组件扫描
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:cotext="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">

    <!-- 通过xml 启用组件扫描-->
 <!--   <cotext:component-scan base-package="com.xiyou.java.hello.hello3.service"/>
    <cotext:component-scan base-package="com.xiyou.java.hello.hello3.dao"/>
    <cotext:component-scan base-package="com.xiyou.java.hello.hello3.web"/>-->
    <cotext:component-scan base-package="com.xiyou.java.hello.hello3"/>
</beans>
```

### 显示装配（如第三方的库引入项目）
#####  Java装配
* `@Bean`的使用
* `@Bean`对象的注入，
#####  Xml装配
