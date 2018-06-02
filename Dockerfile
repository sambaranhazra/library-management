FROM oracle/glassfish:5.0
COPY build/libs/library-management.war $GLASSFISH_HOME/glassfish/domains/domain1/autodeploy