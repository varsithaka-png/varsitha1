FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac Area.java
CMD ["java", "Area"]
