$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/ComprarProdutos.feature");
formatter.feature({
  "name": "Buscar carros no site WebMotors",
  "description": "\tComo usu�ro\n  Quero preencher informa��es\n  Para continuar o processo de busca de autom�veis",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesso o sistema \"https://www.magazineluiza.com.br/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.stepDefinition.que_acesso_o_sistema(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deve comprar livro",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ComprarLivro"
    }
  ]
});
formatter.step({
  "name": "opto por pesquisar produto \"Livro - A filosofia do sucesso\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.stepDefinition.opto_por_pesquisar_produto(java.lang.String)"
});
