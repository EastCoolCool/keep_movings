mvn clean package -Dmaven.tst.skip=true -U

docker build -t registry.cn-shanghai.aliyuncs.com/eastcool/helloworld .

docker push docker build -t registry.cn-shanghai.aliyuncs.com/eastcool/helloworld%