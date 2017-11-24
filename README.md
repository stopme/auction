# auction
微信小程序后台
根据自己的mybatis-generator-core版本生成代码
命令如下：src同级目录执行该命令
  java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite 自动生成 mapper domain

自动生成的mapper.xml文件在编译后不能复制到classes中，需要添加如下信息
# <build>
#   <finalName>auction-web</finalName>
#    <resources>
#      <resource>
#       <directory>src/main/java</directory>
#       <includes>
#         <include>**/*.xml</include>
#        </includes>
#        <filtering>true</filtering>
#      </resource>
#    </resources>
# </build>


