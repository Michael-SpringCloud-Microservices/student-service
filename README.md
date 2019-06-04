# student-service
Client Project To Test Zuul Gateway Service Proxy

#To run the service with multiple instances of different port 
# please pass the following VM arguments
-Dserver.port=8091
-Dserver.port=8092
-Dserver.port=8093

# How to access student-service endpoints via 'netflix-zuul-api-gateway-proxy-server'
# assume 'netflix-zuul-api-gateway-proxy-server' is been deployed at 8080
Endpoint - echoStudentName --> http://localhost:8080/student/echoStudentName/Philomin
Endpoint - getStudentDetails --> http://localhost:8080/student/getStudentDetails/Philomin