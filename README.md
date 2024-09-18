# micronaut-spring-bug-demo

Demo for a bug when enable eager initialization and running spring applications as micronaut applications.

This demo uses pretty much the generated files by Micronaut launch when selecting `spring` and `spring-boot` features. Only difference is that the `org.springframework.boot:spring-boot-starter-web`.
However the issue remains even when the dependency is added back.

## Running demo

The following command should be enough to see the exception:

```bash
./mnvw clean mn:run
```

## Micronaut 4.6.2 Documentation

- [User Guide](https://docs.micronaut.io/4.6.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.6.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.6.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)

---

- [Micronaut Maven Plugin documentation](https://micronaut-projects.github.io/micronaut-maven-plugin/latest/)

## Feature maven-enforcer-plugin documentation

- [https://maven.apache.org/enforcer/maven-enforcer-plugin/](https://maven.apache.org/enforcer/maven-enforcer-plugin/)

## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)

## Feature spring documentation

- [Micronaut Spring Framework Annotations documentation](https://micronaut-projects.github.io/micronaut-spring/latest/guide/index.html)

## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)
