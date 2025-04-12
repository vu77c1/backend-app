  ____             _                  _   ____                  _           
 | __ )  __ _  ___| | _____ _ __   __| | / ___|  ___ _ ____   _(_) ___ ___  
 |  _ \ / _` |/ __| |/ / _ \ '_ \ / _` | \___ \ / _ \ '__\ \ / / |/ __/ _ \ 
 | |_) | (_| | (__|   <  __/ | | | (_| |  ___) |  __/ |   \ V /| | (_|  __/ 
 |____/ \__,_|\___|_|\_\___|_| |_|\__,_| |____/ \___|_|    \_/ |_|\___\___| 

# 🚀 Spring Boot Project

Một dự án backend được xây dựng bằng Spring Boot, hỗ trợ phát triển nhanh chóng các hệ thống RESTful API, dễ dàng mở rộng và triển khai.

---

## ✅ 1. Prerequisite – Yêu cầu trước khi chạy

Bạn cần cài đặt các công cụ sau để chạy được dự án:

- **JDK 17+**  
  👉 Tải tại: https://adoptium.net/

- **Maven 3.5+**  
  👉 Hướng dẫn cài đặt: https://maven.apache.org/install.html

- **IntelliJ IDEA (khuyên dùng Ultimate)**  
  👉 https://www.jetbrains.com/idea/download/

- **Docker**  
  👉 https://docs.docker.com/get-docker/

---

## ⚙️ 2. Technical Stacks – Công nghệ sử dụng

- Java 17
- Spring Boot 3.3.4
- Spring Web
- Spring Data JPA
- Spring Validation
- Lombok
- PostgreSQL hoặc MySQL (cấu hình linh hoạt)
- Spring Boot DevTools (hỗ trợ reload nhanh)
- Docker & Docker Compose (dùng để chạy DB và build image)

---

## 🔨 3. Build & Run Application – Cách chạy ứng dụng

### 👉 Chạy bằng Maven (dev nhanh)

```bash
cd backend-service
./mvnw spring-boot:run


🐳 Chạy bằng Docker
# 1. Build jar
mvn clean install -P dev

# 2. Build Docker image
docker build -t backend-service:latest .

# 3. Run Docker container
docker run -it -p 8080:8080 --name backend-service backend-service:latest
