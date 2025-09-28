# Sistema de Cálculo de Custo de Frete
Um sistema de cálculo de custo de frete para simular uma empresa de logística. O custo total de uma entrega é a soma de duas partes: o custo do veículo e o pagamento do entregador. Ambos variam conforme o tipo.


## Sumário

- [1. Estrutura](#1-estrutura)
- [2. Descrição das Classes](#2-descricao_das_classes)


## Estrutura <a name="1-estrutura"></a>
```
Sistema_de_Calculo_de_Custo_de_Frete/
├── lab_extra.entregadores/
│   └── src/
│       ├── com/exemplo/entregadores/
│       │   ├── Autonomo.java
│       │   └── Funcionario.java
│       └── module-info.java
├── lab_extra.main/
│   └── src/
│       ├── com/exemplo/main/
│       │   └── Main.java
│       └── module-info.java
├── lab_extra.modelo/
│   └── src/
│       ├── com/exemplo/modelo/
│       │   ├── Entregador.java
│       │   ├── Fretavel.java
│       │   └── Veiculo.java
│       └── module-info.java
├── lab_extra.servico/
│   └── src/
│       ├── com/exemplo/servico/
│       │   └── ServicoDeEntrega.java
│       └── module-info.java
├── lab_extra.veiculos/
│   └── src/
│       ├── com/exemplo/veiculos/
│       │   ├── Carro.java
│       │   └── Motocicleta.java
│       └── module-info.java
├── .gitignore
└── README.md
```


## Descrição das Classes <a name="2-descricao_das_classes"></a>

### a) public interface Fretavel
Interface `Fretavel` que serve para definir que classes que implementem-no devem também implementar seu método `calcularCustoFrete()`.

#### -> public double calcularCustoFrete(double distanciaEmKm)
Método para calcular custo do serviço fretável - este último sendo a classe que irá implementá-lo -. Ele deve receber a `distanciaEmKm` como parâmetro e deve retornar o custo do frete em formato de número flutuante.
- private double `distanciaEmKm`: Número flutuante que representa a distância em quilômetros da localidade de entrega de um pedido até seu destino final.

---

### b) public abstract class Entregador
Classe abstrata `Entregador` que serve como classe pai para os tipos de entregadores (`Autonomo` e `Funcionario`) da empressa de logística hipotética.

### + public class Autonomo extends Entregador implements Fretavel
Classe `Autonomo` que representa um entregador do tipo autônomo.

#### -> public double calcularCustoFrete(double distanciaEmKm)
Método com a implementação de `Autonomo` para o método da interface `Fretavel`. O custo retornado é a `distanciaEmKm` vezes `0.95`.

### + public class Funcionario extends Entregador implements Fretavel
Classe `Funcionario` que representa um entregador que é funcionário da empresa.

#### -> public double calcularCustoFrete(double distanciaEmKm)
Método com a implementação de `Funcionario` para o método da interface `Fretavel`. O custo retornado é constante: `5`.

---

### c) public abstract class Veiculo
Classe abstrata `Veiculo` que serve como classe pai para os tipos de entregadores (`Carro` e `Motocicleta`) da empressa de logística hipotética.
- protected String `placa`: String que representa a placa do veículo.
- protected int `ano`: Número inteiro que representa o ano de fabricação do veículo.

#### -> public Veiculo(String placa, int ano)
Construtor para criar um objeto `Veiculo` que atribui a `placa` e o `ano` aos atributos do objeto `Veiculo`.
- String `placa`: String o qual deseja-se definir como a placa do veículo.
- int `ano`: Número inteiro o qual deseja-se definir como o ano de fabricação do veículo.

#### -> public String getPlaca()
Método para acessar o atributo `placa` do veículo. Retornando a placa do veículo em formato de String.

#### -> public int getAno()
Método para acessar o atributo `ano` do veículo. Retornando o ano de fabricação do veículo em formato de número inteiro.

### + public class Carro extends Veiculo implements Fretavel
Classe `Carro` que representa um veículo do tipo carro.

#### -> public Carro(String placa, int ano)
Construtor para criar um objeto `Carro` que atribui a `placa` e o `ano` aos atributos do objeto `Carro`. Implementada a partir da chamada do construtor da superclasse. 

#### -> public double calcularCustoFrete(double distanciaEmKm)
Método com a implementação de `Carro` para o método da interface `Fretavel`. O custo retornado é a `distanciaEmKm` vezes `1.25`.

### + public class Motocicleta extends Veiculo implements Fretavel
Classe `Motocicleta` que representa um veículo do tipo motocicleta.

#### -> public Motocicleta(String placa, int ano)
Construtor para criar um objeto `Motocicleta` que atribui a `placa` e o `ano` aos atributos do objeto `Motocicleta`. Implementada a partir da chamada do construtor da superclasse. 

#### -> public double calcularCustoFrete(double distanciaEmKm)
Método com a implementação de `Motocicleta` para o método da interface `Fretavel`. O custo retornado é a `distanciaEmKm` vezes `0.45`.

---

### d) public class ServicoDeEntrega
Classe `ServicoDeEntrega` que representa o serviço de entrega que um dado cliente pode ter solicitado.
- private ArrayList<Item> `Lista`: A lista dinâmica (ArrayList) de entidades fretáveis que foram usados no serviço de entrega.
- private double `distanciaEmKm`: Número flutuante que representa a distância em quilômetros da localidade de entrega desse serviço até seu destino final.

#### -> public ServicoDeEntrega(double distanciaEmKm, ArrayList<Fretavel> Lista)
Construtor para criar um objeto `ServicoDeEntrega` que atribui a `distanciaEmKm` e a `Lista` aos atributos do objeto `ServicoDeEntrega`.
- private ArrayList<Item> `Lista`: Uma lista dinâmica (ArrayList) de entidades fretáveis que deseja-se empregar no serviço de entrega.
- private double `distanciaEmKm`: Número flutuante que deseja-se definir como a distância em quilômetros da localidade de entrega desse serviço até seu destino final.

### + public double calcularCustoTotal()
Método para somar o custo de total dos serviços fretáveis na `Lista` de um `ServicoDeEntrega`. Retornando o custo total do frete em formato de número flutuante.

### + public ArrayList<Fretavel> getLista()
Método para acessar o atributo `Lista` do serviço de entrega. Retornando a lista em formato de lista dinâmica (ArrayList) de entidades fretáveis.

### + public double getDistanciaEmKm()
Método para acessar o atributo `distanciaEmKm` do serviço de entrega. Retornando a distância em quilômetros em formato de número flutuante.
