# Sample Spring Boot App 2

# Jar Build
`./gralew clean build`

produces: `./build/libs/sb2.jar`

# Docker Build
`docker build -t legnoban/sample-sb-app2 .`

# Docker Run
`docker run -p 8081:8080 legnoban/sample-sb-app2`

# Access
`localhost:8081`