# Demo of Continuous Deployment application entry using CRUD repository
CRUD repository demo with app packaging

### To run

```sh
$ mvn spring-boot:run
```

To try CRUD actions, you can import the Postman collection, or run the following in CLI

### Create/POST
```sh
curl -X POST \
  http://localhost:8080/appEntries/ \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
	"name": "cms",
	"version": "9.9",
	"state": "RC",
	"submitter": "jeff",
	"updatedTime": "2017-10-01T00:00:00-05:00"
}'
```

### Read/GET
Note: output will have appEntry ID# for the other update/delete methods
```sh
curl -X GET \
  http://localhost:8080/appEntries \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json'
```

### Update/PUT
Note: change ID# in path
```sh
curl -X PUT \
  http://localhost:8080/appEntries/1 \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
	"name": "cms",
	"version": "10.1",
	"state": "RELEASE",
	"submitter": "Austin",
	"updatedTime": "2017-10-06T14:00:00.000+0000"
}'
```

### DELETE
Note: change ID# in path
```sh
curl -X DELETE \
  http://localhost:8080/appEntries/2 \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json'
```
