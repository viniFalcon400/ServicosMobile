# Servicos Mobile Rest

----------------
* ver container
docker ps -a

* deletar container
docker rm <CONTAINER ID> 

* ver images
docker images -a

* deletar image
docker rmi -f <IMAGE>
----------------

#-- iniciar banco de dados em docker. (postgres10)
Caminho: /home/vinicius/Documentos/dockerComposePostgres10
Comando: docker-compose up

* ver container no ar
docker-compose ps

* encerra e remove os containers
Comando: docker-compose down

* apenas para
docker-compose stop

* iniciar quando parado
docker-compose start
#--