#!/bin/bash

_PWD=`pwd`
CopyLibs=$_PWD/lib/org-netbeans-modules-java-j2seproject-copylibstask.jar

CLASSPATH=$CLASSPATH:$_PWD/lib/ant-contrib-1.0b3.jar:$CopyLibs:$_PWD\glassfish3\glassfish\lib\appserv-rt.jar:$_PWD\glassfish3\glassfish\lib\gf-client.jar
export CLASSPATH
echo "CLASSPATH:"$CLASSPATH

wget -nv -T 10 -t 0 "http://dlc.sun.com.edgesuite.net/glassfish/3.1.2/release/glassfish-3.1.2.zip"
# já cria um diretório chamado glassfish3
unzip -q glassfish-3.1.2.zip

echo " "
ant
antReturnCode=$?

echo $antReturnCode
if [ $antReturnCode = 0 ];then
	ant -buildfile substituicao.xml	
	ant -buildfile substituicao.xml
	java -jar lib/jpm4j.jar -u init
	curl https://www.jpm4j.org/install/script | sh
	jpm install com.codacy:codacy-coverage-reporter:assembly
	codacy-coverage-reporter -l Java -r build/coverage.xml
	
else
	ant -buildfile substituicao.xml
	sudo curl https://www.jpm4j.org/install/script | sh
	sudo apt-get install nodejs-legacy
	sudo npm install jpm --global
	sudo jpm install com.codacy:codacy-coverage-reporter:assembly
	codacy-coverage-reporter -l Java -r build/coverage.xml
		
fi
exit $?	
	



