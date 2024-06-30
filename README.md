To Create a graphQl application the following steps have to be followed:
Create a springBoot application, by going into Spring initializr in the browser
Select  appropriate spring versions and add these basic dependencies
1. Spring Web dependency
2. Spring for GraphQL: this is the main dependency for graphql to perform. Once this is added a graphql folder is created in the resources.
This is the place where we have to add the schema

The difference between a rest API and the graphQL is that in the controller 
of rest API we have a GET call and POST calls whereas in graphQL we have a 
queries and mutations

Another key difference is that in case of RestApi the path parameters and the query parameters 
are mentioned as annotation before the variables in the function definition
for example 
@GetMapping({id})
void fun(@PathParameter String id)
But in case of graphQL all these variables are annotated as a arguments 
for example
@QueryMapping
void fun(@Argument String id)

NOTE::
//    the name of the variables in the argument and the schema name should be the same
//    here we have observed that the object has been converted from/to json

GraphQL takes care of serialising an object to a JSON and a deserialising JSON back to and object
