# Dockerfile for apollo-adminservice
# 1. Copy apollo-adminservice-${VERSION}-github.zip to current directory
# 2. Build with: docker build -t apollo-adminservice .
# 3. Run with: docker run -p 8090:8090 -d -v /tmp/logs:/opt/logs --name apollo-adminservice apollo-adminservice
######

FROM openjdk:8-jre-alpine
MAINTAINER ameizi <sxyx2008@163.com>

ENV VERSION 1.0-SNAPSHOT
ENV SERVER_PORT 8090
# DataSource Info
ENV DS_URL ""
ENV DS_USERNAME ""
ENV DS_PASSWORD ""

RUN echo "http://mirrors.aliyun.com/alpine/v3.8/main" > /etc/apk/repositories \
    && echo "http://mirrors.aliyun.com/alpine/v3.8/community" >> /etc/apk/repositories \
    && apk update upgrade \
    && apk add --no-cache procps unzip curl bash tzdata \
    && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone

ADD client-${VERSION}.zip /client/client-${VERSION}.zip

RUN unzip /client/client-${VERSION}.zip -d /client \
    && rm -rf /client/client-${VERSION}.zip \
    && sed -i '$d' /client/scripts/startup.sh \
    && chmod +x /client/scripts/startup.sh \
    && echo "tail -f /dev/null" >> /client/scripts/startup.sh

EXPOSE $SERVER_PORT

CMD ["/client/scripts/startup.sh"]
