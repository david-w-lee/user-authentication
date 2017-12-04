# user-authentication

## How to run app
Run App.java as a console application.

## How to test app
-Install Postman and Postman Interceptor extensions in Chrome.
-Turn on the interceptor in Postman and Postman Interceptor. All requests in Postman will go through Postman Interceptor.
-Refer to application.yml for password

## How to see the database
1. In chrome, go to localhost:8181/h2
2. Connect using the password in application.yml. It should be blank by default.
3. Create, delete, update data in UI.

## How to create/update/delete database table
-Create a new script in V#_newtask.sql

## Sample Requests
### create
POST http://localhost:8181/api/v1/users
```json
{
    "firstName": "jim",
    "lastName": "bob",
    "email": "jbob@test.com",
    "phoneNumber": "222-333-4444"
}
```

### get
GET http://localhost:8181/api/v1/users/1

### update
PUT http://localhost:8181/api/v1/users/1
```json
{
    "firstName": "jim",
    "lastName": "bob",
    "email": "jbob@test.com",
    "phoneNumber": "111-222-3333"
}
```

### delete
DELETE http://localhost:8181/api/v1/users/1
