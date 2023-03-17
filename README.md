## Micronaut 3.9.0-SNAPSHOT Documentation

- [User Guide](https://docs.micronaut.io/snapshot/guide/index.html)
- [API Reference](https://docs.micronaut.io/snapshot/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/snapshot/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Handler

Handler: io.micronaut.function.aws.proxy.MicronautLambdaHandler

[AWS Lambda Handler](https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html)

## Requisites

- [AWS Account](https://aws.amazon.com/free/)
- [CDK CLI](https://docs.aws.amazon.com/cdk/v2/guide/cli.html)
- [AWS CLI](https://aws.amazon.com/cli/)

## How to deploy

### Generate the deployable artifact

```
./gradlew :app:shadowJar
./gradlew test
```

### Deploy

The `infra/cdk.json` file tells the CDK Toolkit how to execute your app.

`cd infra`
`cdk synth` - emits the synthesized CloudFormation template
`cdk deploy` - deploy this stack to your default AWS account/region
`cd ..`

Other useful commands:

`cdk diff` - compare deployed stack with current state
`cdk docs`- open CDK documentation

### Cleanup

```
cd infra
cdk destroy
cd ..
```


- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)


## Feature aws-cdk documentation

- [https://docs.aws.amazon.com/cdk/v2/guide/home.html](https://docs.aws.amazon.com/cdk/v2/guide/home.html)


## Feature crac documentation

- [Micronaut Support for CRaC (Coordinated Restore at Checkpoint) documentation](https://micronaut-projects.github.io/micronaut-crac/latest/guide)

- [https://wiki.openjdk.org/display/CRaC](https://wiki.openjdk.org/display/CRaC)


## Feature snapstart documentation

- [https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html](https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html)


## Feature amazon-api-gateway-http documentation

- [Micronaut Amazon API Gateway HTTP documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#amazonApiGateway)

- [https://docs.aws.amazon.com/apigateway/](https://docs.aws.amazon.com/apigateway/)


