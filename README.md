# Autofix Pipeline 🚀
[![CI](https://github.com/akashak121/autofix-pipeline/actions/workflows/ci.yml/badge.svg)](https://github.com/akashak121/autofix-pipeline/actions/workflows/ci.yml)
Spring Boot + DevOps project that demonstrates:
## CI/CD Pipeline Overview

- Code pushed to `main` branch
- GitHub Actions triggers CI pipeline
- Docker image is built automatically
- Image is tagged with version and commit SHA
- Image is pushed to Docker Hub
- CI status visible via badge

### Tech Stack
- GitHub Actions
- Docker
- Spring Boot
- Docker Hub
## Run Locally
```bash
./mvnw spring-boot:run
