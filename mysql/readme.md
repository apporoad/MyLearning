## clusters
Fabric
cobar
NDB
主从方案

to be continued
ndb
https://dev.mysql.com/doc/refman/5.7/en/mysql-cluster-install-linux-binary.html
fabric
https://dev.mysql.com/doc/mysql-utilities/1.5/en/fabric.html

https://dev.mysql.com/doc/mysql-utilities/1.5/en/fabric-install.html
主从
https://dev.mysql.com/doc/refman/5.6/en/replication.html




mysql + docker

#1    docker pull mysql

#2    docker run -v /data/var/mysql/:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123 mysql

#3    docker stop [CONTAINER ID]

#4    docker run -it -v /data/var/mysql/:/var/lib/mysql mysql /bin/bash

#5    mysqld_safe&

#6    grant all privileges on *.* to 'wuxiao'@'%' identified by 'password';

#7    docker cp [CONTAINER ID]:/etc/mysql/my.cnf /data/local/my.cnf

#8    docker stop [CONTAINER ID]

#9    docker run -d -p 3306:3306 -v /data/var/mysql/:/var/lib/mysql -v /data/local/my.cnf:/etc/mysql/my.cnf mysql

#10    add [CMD] to  /etc/rc.local

#11    OK!


使用mysql镜像
运行容器
runoob@runoob:~/mysql$ docker run -p 3306:3306 --name mymysql -v $PWD/conf/my.cnf:/etc/mysql/my.cnf -v $PWD/logs:/logs -v $PWD/data:/mysql_data -e MYSQL_ROOT_PASSWORD=123456 -d mysql
21cb89213c93d805c5bacf1028a0da7b5c5852761ba81327e6b99bb3ea89930e
runoob@runoob:~/mysql$ 
命令说明：
-p 3306:3306：将容器的3306端口映射到主机的3306端口
-v $PWD/conf/my.cnf:/etc/mysql/my.cnf：将主机当前目录下的conf/my.cnf挂载到容器的/etc/mysql/my.cnf
-v $PWD/logs:/logs：将主机当前目录下的logs目录挂载到容器的/logs
-v $PWD/data:/mysql_data：将主机当前目录下的data目录挂载到容器的/mysql_data
-e MYSQL_ROOT_PASSWORD=123456：初始化root用户的密码


right one 

docker run -p 3306:3306 --name mymysql  -e MYSQL_ROOT_PASSWORD=123456 -d mysql