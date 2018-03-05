

#mvn package:build


mvn clean package docker:build
sudo docker run -p 3300:3306 -d   --rm   --name demo-mysql     -e MYSQL_ROOT_PASSWORD=mysql     -e MYSQL_DATABASE=demo     -e MYSQL_USER=demo_user     -e MYSQL_PASSWORD=demo_pass     mysql:latest
docker run -p 8081:8080 -d -it   --rm   --name spring-boot-customer  --link demo-mysql:mysql gcr.io/first-kubernetes-195006/spring-boot-customer:latest


docker info
sudo service docker status
docker version
sudo nano  /lib/systemd/system/docker.service
sudo nano  /etc/init.d/docker
sudo service docker stop
sudo service docker start
sudo systemctl daemon-reload
docker ps -a
docker logs -f 70f7c451fc4b6b3cd29639172da3f6450e26210c1e22af38af0461b5c4d35217
