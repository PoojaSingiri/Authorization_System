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

--> To signin, create POST request on Postman
url: http://localhost:8080/api/v1/Signin
In body -> raw -> json
{
"username":"username",
"password":"password"
}

you get a JSON token which has to be saved and pass this Token in View and add Post

--> To Post Something, You must Signin with your ADMIN credentials
Create a POST request on Postman
url: http://localhost:8080/api/v1/admin/post
In body -> raw -> json
{
"description":"Post_description"
}

If you want to see all the Post, Create a GET request in Postman and must be SignIn with either like ADMIN or USER url: http://localhost:8080/api/v1/getAllPost
