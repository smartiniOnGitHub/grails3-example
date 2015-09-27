# web: cd build ; java $JAVA_OPTS -Dgrails.env=prod -jar ../build/server/jetty-runner-*.jar --expand-war --port $PORT libs/*.war
# web: cd build ; java $JAVA_OPTS -Dgrails.env=prod -jar ../build/server/webapp-runner-*.jar --expand-war --port $PORT libs/*.war
web: cd build ; java $JAVA_OPTS -Dgrails.env=prod -Dserver.port=$PORT -jar libs/*.war
