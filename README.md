READ ME 

O projeto foi dividido em duas partes : frontend e backend.
O frontend foi desenvolvido em Angular
O backend foi desenvolvido em Java

Repositório backend: https://github.com/tanywii/buscarcep-backend
Repositório frontend: https://github.com/tanywii/buscarcep-frontend


Será necessário ter instalado :
XAMPP
Workbench Mysql
Java (JDK) versão 11
Maven
NPM
Angular
Git
Visual studio code
Eclipse/Intellij/Spring tools suite (ou qualquer uma de sua preferencia)


Como rodar o projeto 

1. Rode o XAMPP para o mysql (porta 3306)
2. Inicie o workbench, configure um host 127.0.0.1 com porta 3306, usuario root e senha vazia, e aí rode os seguintes scripts : 
create database db;
use db;
CREATE TABLE endereco (
    id INT PRIMARY KEY,
    cep VARCHAR(9),
    logradouro VARCHAR(255),
    cidade VARCHAR(255),
    bairro VARCHAR(255),
    uf VARCHAR(2),
    complemento VARCHAR(255),
    data_hora_consulta timestamp
);

3. Importar o projeto backend na sua IDE, rodar como projeto spring boot
4. Importar o projeto frontend no Visual Studio Code, abrir um terminal e rodar os seguintes comandos (em ordem) : 
npm install
ng serve
5. Acessar no navegador com o seguinte endereço  : http://localhost:4200

