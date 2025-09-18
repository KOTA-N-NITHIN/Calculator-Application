# 🚀 Java Calculator Application with Jenkins CI/CD

## 📌 Project Overview
This project is a **Java-based console calculator application** that performs:
- Addition
- Subtraction
- Multiplication
- Division
- Exit option  

The application is built and packaged with **Maven**, containerized with **Docker**, and the entire process is automated using a **Jenkins Declarative Pipeline**.

---

## ⚙️ Tech Stack
- **Java** (Console Application)
- **Maven** (Build Tool)
- **Jenkins** (CI/CD Automation)
- **Docker** (Containerization)
- **GitHub** (Source Code Management)

---

## 🔄 CI/CD Pipeline Workflow
The pipeline is fully defined in the `Jenkinsfile`. It consists of the following stages:

1. **Checkout**  
   - Pulls the latest code from GitHub.  

2. **Build with Maven**  
   - Executes `mvn clean package -DskipTests` to build and package the application JAR.  

3. **Build Docker Image**  
   - Builds a Docker image containing the application JAR.  

4. **Push Docker Image**  
   - Tags and pushes the image to **Docker Hub** using Jenkins credentials.  

---

## Prerequisites
- Java 8+  
- Maven  
- Docker  
- Jenkins

## 🐳 Docker Hub Repository
The final image is pushed to Docker Hub:  
👉 [kotannithin/java-calculator](https://hub.docker.com/r/kotannithin/java-calculator)

---

## 🖥️ How to Run the Application
### Option 1: Run Locally with Maven
```bash
git clone https://github.com/KOTA-N-NITHIN/Calculator-Application.git
cd Calculator-Application
mvn clean package -DskipTests
java -jar target/calculator-1.0-SNAPSHOT.jar


Option 2: Run with Docker

docker pull kotannithin/java-calculator:latest
docker run -it kotannithin/java-calculator:latest

✅ Sample Output
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit


📜 License

This project is for learning and demonstration purposes.

**Java Calculator Application – CI/CD with Jenkins & Docker**  
- Built a Java-based console calculator application.  
- Automated build and deployment using **Jenkins Declarative Pipeline** with the following stages: GitHub checkout → Maven build → Docker image build → Docker Hub push.  
- Containerized the application using **Docker** and published the image to Docker Hub.  

---

👉 pipeline flow (GitHub → Jenkins → Maven Build → Docker Build → Docker Hub)
