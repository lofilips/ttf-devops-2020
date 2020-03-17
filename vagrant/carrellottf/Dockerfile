FROM tomcat:9-jdk8

COPY . /carrellottf

WORKDIR /

RUN apt update

RUN apt install -y wget

RUN wget -O maven.tgz https://www-eu.apache.org/dist/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz

RUN tar -xzf maven.tgz

WORKDIR /carrellottf

RUN /apache-maven-3.6.3/bin/mvn -DskipTest=true clean package
