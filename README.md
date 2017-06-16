# Sistema de Controle de Produtos

Para utilizar o sistema é necessário:

- Um servidor MySQL

- JAVA SE 1.8

Foi utilizada a versão Neon do Eclipse para o desenvolvimento desse projeto.

# Banco de Dados

No seu banco de dados MySQL, utilize os seguintes comandos:
```
CREATE DATABASE produtopoo;

USE produtopoo;

CREATE TABLE IF NOT EXISTS `produtopoo`.`produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `nomeProduto` VARCHAR(45) NULL,
  `descricaoProduto` VARCHAR(200) NULL,
  `valorProduto` DOUBLE NULL,
  PRIMARY KEY (`idProduto`))
ENGINE = InnoDB;
```

## Edite as informações de login do MySQL

Após importar o projeto, entre em src > factory > ConexaoFactory.java

Nesse arquivo é necessário alterar as seguintes linhas de acordo com as suas informações de login no seu MySQL.
```
private static final String USUARIO = "seuNomeDeUsuário";
private static final String SENHA = "SuaSenha";
```