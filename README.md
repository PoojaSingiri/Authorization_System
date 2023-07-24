# Authorization_System

-> Run authorizationSystemAPI class.

--> Create a User, create POST request on Postman
url: http://localhost:8080/api/v1/Signup
and in Body -> raw -> json
{
"name":"name",
"username":"username",
"password":"password"
}

--> Create a Admin, create POST request on Postman
url: http://localhost:8080/api/v1/Signup
in name write _admin to identify this is a admin
In Body -> raw -> json
{
"name":"name_admin",
"username":"username",
"password":"password"
}
