#enconding: utf-8
Feature: Buscar carros no site WebMotors 
	Como usu�ro
  Quero preencher informa��es
  Para continuar o processo de busca de autom�veis
  
Background: 
	Given que acesso o sistema "https://www.magazineluiza.com.br/" 
	
	
@ComprarLivro
Scenario: Deve comprar livro
	Given opto por pesquisar produto "Livro - A filosofia do sucesso" 
	And opto por validar resultado de pesquisa 
	And opto por selecionar livro "Livro - A filosofia do sucesso" 
	Then opto por clicar "Adicionar � sacola" 
	And opto por preencher cep "09663010" 
	Then opto por clicar em Ok 
	And opto por verificar valor 

	
	
	
