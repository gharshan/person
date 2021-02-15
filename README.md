# Getting Started
This project is setup for exposing the Person entity as a resource using Springboot.

## Instructions
1. Build the code using below command : gradle build

2. Now run the dockerfile to deploy the application on Docker : docker build -t gharshanpersonapi .

3. Run the docker with deployed application : docker run  -p 3000:8080 gharshanpersonapi

4. Now open the swagger page using below url. This page have details of api and you can test the api as well using swagger page. : http://localhost:3000/swagger-ui.html
