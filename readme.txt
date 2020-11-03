开发顺序：从底层开始 约定》配置》编码
1、创建maven主模块，再api,provider,consumer三个子模块。
2、配置pom文件
3、配置yml文件、数据库连接、创建数据库、表等
4、写api层的entity实体类
5、写provide层的dao接口、mapper映射文件(dao实现)
6、写provide层的service接口serviceImpl；controller层
===============================================================

api公共模块（一块代码，使用了2次，就该提出来当公共)
1、存放实体

provider提供者
1、提供接口
2、

consumer消费者
1、

自测：
提供者
http://localhost:8001/dept/list
http://localhost:80/consumer/dept/list
http://localhost:7001


遇到的问题：
    提供者：
    service层：
        service的实现类未添加@Service注解
    mybatis配置问题
        1、config-location和mapper-locations不能同时使用，会冲突。
        2、mapper-locations指向的mapper文件，路径不对，找不到mapper错误。
        之前在classpath:mybatis/mapper/**/*.xml的冒号多写了//导致的

    消费者：
    controller层：
        使用Template调用提供层，报错No instances available for localhost。
        原因：提供者配置Template时，使用了@LoadBalanced负载均衡，url指向了eureka的服务注册名称，而不是localhost，去掉即可

    eureka服务注册中心
    启动：
        先启动服务注册中心，再启动服务端
