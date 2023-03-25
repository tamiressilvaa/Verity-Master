@tag
Feature: Validacao e Acesso ao Site 



@tag1
  Scenario: validacao de Titulo
  Given que o usuario acesse a url "https://www.verity.com.br/nosso-jeito"
  When selecionar a aba Verity
  Then sera exibido a mensagem Nossas soluções_

  @tag2
  Scenario: Acesso e validacao do site 
  Given que o usuario acesse a url "https://www.verity.com.br/nosso-jeito"
  And selecionar a aba Contato
  When preencher o formulario Vamos conversar
  And selecionar o checkbox Aceito receber mensagens da Verity
  And clicar no botao enviar 
  Then sera exibido a mensagem Obrigado!