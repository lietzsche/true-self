FROM gradle:8.5-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle installDist

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/build/install/true-self-backend/ /app/
CMD ["bin/true-self-backend"]
