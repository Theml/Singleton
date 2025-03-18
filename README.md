# Padrão Singleton
```mermaid
classDiagram
  class Singleton {
    - static instance: Singleton
    - Singleton()
    + static getInstance(): Singleton
}
Singleton: - instance
Singleton: - Singleton()
Singleton: + static getInstance()
Singleton --> Singleton : "instance"
```


### Explicação
- **`-`** indica atributos métodos públicos.
- **`+`** indica métodos públicos.
- A classe `Singleton` possui um atributo estático `instance` e um método `getInstance()` para garantir um única instância.

### Diagrama do Código Exemplo
```mermaid
classDiagram
  class Loggers{
    - Loggers()
    + static getInstance()
}
Loggers --> Loggers : "instance"
```
