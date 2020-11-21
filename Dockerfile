FROM oracle/graalvm-ce:20.2.0-java8 as graalvm
RUN gu install native-image

COPY . /home/app/aawp-rest
WORKDIR /home/app/aawp-rest

RUN native-image -cp target/aawp-rest-*.jar

FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++
EXPOSE 8080
COPY --from=graalvm /home/app/aawp-rest/aawp-rest /app/aawp-rest
ENTRYPOINT ["/app/aawp-rest"]
