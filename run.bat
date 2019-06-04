docker build -t mysql-api-db ./mysql
docker build -t starwarsapi ./starwars-api
docker build -t ribbon-server ./ribbon-server

docker-compose up