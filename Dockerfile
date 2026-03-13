FROM openjdk:21

WORKDIR /app

COPY PatternGenerator.java .

RUN javac PatternGenerator.java

CMD ["java", "PatternGenerator"]