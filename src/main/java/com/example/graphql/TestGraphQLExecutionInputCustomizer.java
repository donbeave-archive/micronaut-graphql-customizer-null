package com.example.graphql;

import graphql.ExecutionInput;
import io.micronaut.configuration.graphql.GraphQLExecutionInputCustomizer;
import io.micronaut.core.async.publisher.Publishers;
import io.micronaut.http.HttpRequest;
import org.reactivestreams.Publisher;

import javax.inject.Singleton;

@Singleton
public class TestGraphQLExecutionInputCustomizer implements GraphQLExecutionInputCustomizer {
    @Override
    public Publisher<ExecutionInput> customize(ExecutionInput executionInput, HttpRequest httpRequest) {
        return Publishers.just(executionInput);
    }
}
