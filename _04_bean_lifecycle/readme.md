# Bean 生命周期
1. 初始化容器:
   1. 创建对象(内存分配)
   2. 执行构造方法
   3. 执行属性注入(set操作)
   4. 执行bean初始化方法

2. 使用bean 执行业务操作
3. 关闭/销毁容器: 执行bean销毁方法

# Spring中对bean生命周期控制

两种方式
- 在配置文件中的bean标签中添加init-method和destroy-method属性
- 类实现InitializingBean与DisposableBean接口
