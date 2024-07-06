
## Bootcamp Spring 3.0 - Cap. 02 - Testes automatizados no back end,
![Web 2](https://github.com/williamsartijose/2024-Bootcamp-Spring-3.0/blob/main/Testes%20automatizados%20no%20back%20end/aulaJunit/img/4.png)

## Desafio: TDD-Event-City
* Desenvolvimento TDD de API Rest com Java e Spring Boot;
* Implementação de cenários de busca, inserção, deleção e atualização;
* Tratamento de exceções em API com respostas HTTP customizadas;
## :gear: - Endpoint's:

#### :house: - City:

``GET:`` <br />
* findById(id){} <br />
* findAllName(){}

``POST:`` <br />
* insert(){}

``DELETE:`` <br />
* delete(id){}

##

#### :microphone: - Event:

``PUT:`` <br />
* update(id){}

##

## :hourglass: - Tests:

#### :house: - City:

    - findAllShouldReturnAllResourcesSortedByName(){}
    - insertShouldInsertResource(){}
    - deleteShouldReturnNoContentWhenIndependentId(){}
    - deleteShouldReturnNotFoundWhenNonExistingId(){}

##

#### :microphone: - Event:

    - updateShouldUpdateResourceWhenIdExists(){}
    - updateShouldReturnNotFoundWhenIdDoesNotExists(){}

##

### :white_check_mark: - Critérios:

## 

- [x] - DELETE /cities/{id} deve retornar 404 Not Found quando id não existir;
- [x] - DELETE /cities/{id} deve retornar 204 No Content quando id for independente;
- [x] - DELETE /cities/{id} deve retornar 400 Bad Request quando id for dependente;
- [x] - POST /cities deve inserir recurso;
- [x] - GET /cities deve retornar recursos ordenados por nome;
- [x] - PUT /events deve atualizar recurso quando id existir;
- [x] - PUT /events deve retornar 404 Not Found quando id não existir;   
- 








