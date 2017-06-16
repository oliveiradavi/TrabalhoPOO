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

# Edite as informações de login do MySQL

Após importar o projeto, entre em src > factory > ConexaoFactory.java

Nesse arquivo é necessário alterar as seguintes linhas de acordo com as suas informações de login no seu MySQL.
```
private static final String USUARIO = "seuNomeDeUsuário";
private static final String SENHA = "SuaSenha";
```

# Utilizando o sistema

Entre em Boundary > MenuPrincipal para rodar o programa.
	
Ao abrir o programa, podemos observar no canto esquerdo da tela um menu com 4 botões. 
Utilize esses botões para navegar entre as telas do programa.
	
- Listar Produtos: 
	Mostra automaticamente uma lista de todos os produtos já cadastrados no banco de dados especificado
	
- Adicionar Produtos: É necessário digitar o nome do produto (texto), a descrição do produto(texto) e o preço do produto (double).
	Exemplo: Produto: Prod
	 Descrição: Desc
	 Preço: 5.5
				 
- Editar Produtos:
	É necessário digitar o ID do produto e clicar em Procurar (os IDs podem ser visualizados ao clicar em Listar Produtos).
	Ao digitar um ID válido, os campos referentes ao produto procurado serão preenchidos na tela.
	Altere os campos que desejar (exceto o ID) e clique em Editar Produto.
	É possível observar a alteração verificado a lista de produtos cadastrados clicando em Listar Produtos.
					   
- Excluir Produtos:
	É necessário digitar o ID do produto e clicar em Procurar.
	Ao digitar um ID válido, os campos referentes ao produto procurado serão preenchidos na tela.
	Clique em Excluir Produto.
	Uma janela de confirmação será aberta. Clique em "Yes" para confirmar a exclusão.
	É possível observar a alteração verificado a lista de produtos cadastrados clicando em Listar Produtos.					   
