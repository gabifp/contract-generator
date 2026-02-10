
---

# 🔹 BACKEND - (Português)

# 📄 Contract Generator

API REST responsável pela geração de contratos a partir de templates reutilizáveis.

Este backend fornece os endpoints necessários para criar, consultar e utilizar templates de contrato, além de gerar contratos finais a partir de dados dinâmicos enviados pelo frontend.

---

## 🏗️ Responsabilidades

- Gerenciamento de templates de contrato
- Geração de contratos a partir de campos dinâmicos
- Integração com API externa de CEP (ViaCEP)
- Persistência de dados em banco relacional

---

## 🧪 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL

---

## 📌 Principais endpoints

- `POST /api/templates`
- `GET /api/templates`
- `GET /api/templates/{id}`
- `POST /api/contracts/generate`
- `GET /api/address/{cep}`

---

## ▶️ Como rodar o projeto

1. Configure um banco PostgreSQL
2. Ajuste as variáveis em `application.properties`
3. Execute a aplicação Spring Boot

---

## 🖥️ Frontend

A interface do usuário está disponível em:
👉 https://github.com/gabifp/contract-generator-front

---

# 🔹 BACKEND - (English)

---

# 📄 Contract Generator

REST API responsible for generating contracts based on reusable templates.

This backend provides endpoints to manage contract templates and generate final contracts from dynamic data sent by the frontend.

---

## 🏗️ Responsibilities

- Contract template management
- Contract generation from dynamic fields
- Integration with external address API (ViaCEP)
- Relational database persistence

---

## 🧪 Technologies

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL

---

## 📌 Main endpoints

- `POST /api/templates`
- `GET /api/templates`
- `GET /api/templates/{id}`
- `POST /api/contracts/generate`
- `GET /api/address/{cep}`

---

## ▶️ How to run the project

1. Configure a PostgreSQL database
2. Update `application.properties`
3. Run the Spring Boot application

---

## 🖥️ Frontend

The user interface is available at:
👉 https://github.com/gabifp/contract-generator-front

