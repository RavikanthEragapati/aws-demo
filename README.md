# Elastic Beanstalk:
A managed platform that simplifies deployment, providing a wizard-like experience. You can deploy your application with a few clicks, and it handles underlying infrastructure.

**GitHub** ->>> **AWS CodePipeline**(detects the change) ->>> **AWS CodeBuild** (compiles your Spring Boot app into a JAR) ->>> **Elastic Beanstalk** automatically deploys the built application.

# EC2:
Provides virtual machines (VMs) on which you can deploy your Spring Boot application. You have more control over the infrastructure, but also more responsibility for managing it.

# Lambda with API Gateway using SAM(serverless Application Model):
Lambda is a serverless compute service, and API Gateway is a managed service that allows you to create RESTful APIs. This approach is good for handling individual API requests, and scales automatically.

# ECS (Elastic Container Service):
A managed container service that allows you to run containers on your own VMs or using Fargate (serverless). ECS offers more control over the container environment compared to Beanstalk or Lambda.

# EKS (Elastic Kubernetes Service):
A managed Kubernetes service, offering a more powerful orchestration environment. EKS is a good choice if you need to manage a complex application with multiple containers. 