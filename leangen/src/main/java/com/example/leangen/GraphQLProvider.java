package com.example.leangen;

import graphql.GraphQL;

public class GraphQLProvider {
	private GraphQL graphQL;

	private GraphQLDataFetchers graphQLDataFetchers;

	/*@Bean
	public GraphQL graphQL() {
		return graphQL;
	}

	@PostConstruct
	public void init() throws IOException {
		var url = Resources.getResource("schema.graphqls");
		String sdl = Resources.toString(url, Charsets.UTF_8);
		GraphQLSchema graphQLSchema = buildSchema(sdl);
		this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
	}



	private GraphQLSchema buildSchema(String sdl) {
		TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(sdl);
		RuntimeWiring runtimeWiring = buildWiring();
		SchemaGenerator schemaGenerator = new SchemaGenerator();
		return schemaGenerator.makeExecutableSchema(typeRegistry, runtimeWiring);
	}

	private RuntimeWiring buildWiring() {
		return RuntimeWiring.newRuntimeWiring()
				.type(TypeRuntimeWiring.newTypeWiring("Query")
						.dataFetcher("bookById", graphQLDataFetchers.getBookByIdDataFetcher()))
				.type(TypeRuntimeWiring.newTypeWiring("Book")
						.dataFetcher("author", graphQLDataFetchers.getAuthorDataFetcher()))
				.build();
	}*/

}
