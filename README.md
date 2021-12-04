# AvaliacaoHearthStone

Para compilar o projeto execute o comando 
- "mvn clean install" na pasta do projeto
- em seguida acesse a pasta "target" 
- e executar o comando Java -jar .\HearthStone-0.0.1-SNAPSHOT.jar (É necessario ter o Java na versão 11 e o maven instalados.) 

As rotas estão distribuidas da seguinte forma.
- GET em "/carta" -> lista todas as cartas.
- POST em "/carta" passando um json no corpo sem o id -> adiciona uma nova carta
- DELETE em "/carta/{id}" passando o id diretamente na URL(Sem ser por parametro) -> deleta a carta referente ao id.

Esses são as pesquisas disponiveis
- GET em "/carta/id/{id}" passando o id diretamente na URL(Sem ser por parametro) -> Pesquisa uma carta por id.
- GET em "/carta/nome/{nome}" passando o nome diretamente na URL(Sem ser por parametro) -> Pesquisa uma carta por nome.
- GET em "/carta/tipo/{tipo}" passando o tipo diretamente na URL(Sem ser por parametro) -> Pesquisa uma carta por tipo(Tipo precisa ser "CRIATURA ou MAGIA").
- GET em "/carta/classe/{classe}" passando a classe diretamente na URL(Sem ser por parametro) -> Pesquisa uma carta por classe(Classe precisa ser "MAGO, PALADINO, CACADOR, DRUIDA, QUALQUER").
