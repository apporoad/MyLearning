 
 
 docker pull
 docker ps 
 docker ps --all
 docker rm XX
 docker images
 docker exec -it mymysql /bin/bash



others

 docker run -p 3306:3306 --name mymysql  -e MYSQL_ROOT_PASSWORD=123456 -d mysql