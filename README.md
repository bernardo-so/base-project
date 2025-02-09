🏗️ Sobre o Projeto
Este é um projeto modularizado com base em Kotlin utilizando Gradle e seguindo os princípios da Clean Architecture. Ele foi criado para facilitar o desenvolvimento de aplicações com foco na regra de negócio seja ela qual for.

A estrutura se divide em camadas independentes, sendo elas domain, application, infrastructure e interface.
Sinta-se a vontade para restruturar conforme sua necessidade.

📂 domain          # 📌 Regras de negócio
 ┣ 📂 entities     # Entidades do domínio
   ┣ 📂 interfaces     # Interface da entidade
   ┣ 📂 valueobjects     # Objetos de valor da entidade (Objetos que tem regras de negócio, mas não chegam a ser uma entidade)
 ┣ 📂 repositories # Interfaces de persistência
 ┗ 📂 exceptions   # Exceções do domain

📂 application     # 📌 Orquestração da aplicação
 ┣ 📂 usecases     # Casos de uso com acesso a repositórios
 ┣ 📂 dtos         # Objetos de transferência de dados
 ┣ 📂 mappers      # Conversão entre DTOs e Entidades
 ┣ 📂 services     # Serviços intermediários
 ┗ 📂 exceptions   # Exceções do application

📂 infrastructure  # 📌 Implementação técnica (Banco, Mensageria, Config)
 ┣ 📂 persistence  # Implementação dos repositórios
 ┣ 📂 messaging    # Publicação de eventos (Kafka, RabbitMQ, etc.)
 ┣ 📂 config       # Configurações da aplicação
 ┗ 📂 exceptions   # Exceções do infrastructure

📂 interface       # 📌 Pontos de entrada (API, Consumidores, Handlers)
 ┣ 📂 controllers  # Exposição de APIs REST
 ┣ 📂 messaging    # Consumidores de eventos (Kafka, RabbitMQ)
 ┗ 📂 handlers     # Tratamento de exceções globais

 src/main/kotlin/ ├── domain/ # 📌 Camada de domínio (Regra de Negócio) │ ├── entities/ # 🔹 Entidades do domínio │ ├── repositories/ # 🔹 Interfaces para persistência │ ├── usecases/ # 🔹 Casos de uso puros │ ├── exceptions/ # 🔹 Exceções específicas do domínio │ ├── application/ # 📌 Camada de aplicação (Orquestração) │ ├── usecases/ # 🔹 Casos de uso que acessam repositórios │ ├── dtos/ # 🔹 Data Transfer Objects (DTOs) │ ├── mappers/ # 🔹 Converte DTOs para Entidades │ ├── services/ # 🔹 Serviços de aplicação │ ├── infrastructure/ # 📌 Camada de infraestrutura (Tecnologias externas) │ ├── persistence/ # 🔹 Implementação dos repositórios │ ├── messaging/ # 🔹 Implementação de mensageria (Kafka, RabbitMQ, etc.) │ ├── config/ # 🔹 Configurações globais do projeto │ ├── interface/ # 📌 Camada de interface (Pontos de entrada) │ ├── controllers/ # 🔹 API REST (Spring, Ktor, etc.) │ ├── messaging/ # 🔹 Consumidores de eventos (Kafka, RabbitMQ, etc.) │ ├── handlers/ # 🔹 Tratamento de exceções │ ├── build.gradle.kts # 📌 Arquivo de configuração do Gradle (Kotlin DSL) ├── settings.gradle.kts # 📌 Configuração dos módulos do projeto ├── README.md # 📌 Documentação do projeto
