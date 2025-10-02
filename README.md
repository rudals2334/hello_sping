TEST
```
$ curl http://localhost:8080/hello | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   116    0   116    0     0  11583      0 --:--:-- --:--:-- --:--:-- 12888
{
  "koreatime": "2025-10-01T14:11:23.997125035+09:00[Asia/Seoul]",
  "timesptamp": 1759295483997,
  "message": "Hello, World!"
}
```

Build
```
$ ./gradlew clean bootJar
```
Run
```
$ java -jar build/lib/spring-rest-api-<VERSION>.jar
```

Remote Run
```
# scp -i <KEY.pem> start.sh ubuntu@<SERVER_IP>:~/app/spring-rest-api

$ ssh -i <KEY.pem> ubuntu@<SERVER_IP> \
"cd /home/ubuntu/app/spring-rest-api;pwd;./start.sh"
```

Remote Stop
```
# scp -i <KEY.pem> stop.sh ubuntu@<SERVER_IP>:~/app/spring-rest-api

$ ssh -i <KEY.pem> ubuntu@<SERVER_IP> \
"cd /home/ubuntu/app/spring-rest-api;pwd;./stop.sh"
```

##Dockerizing
-https://rudals2334.github.io/
