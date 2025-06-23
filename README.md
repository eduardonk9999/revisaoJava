Polimorfismo, trabalhar com o mesmo trecho de código para trabalhar com dois objetos ou mais ao mesmo tempo.

Encapsulamento: Uma forma de blindar nossos objetos, para não usar eles de forma errada.

Herança: É uma forma de reaproveitar código, onde uma classe herda características (atributos e métodos) de outra, criando uma relação de “é um tipo de”.


### Classes abstratas x interfaces
O que elas tem em comum?
Ambas não podem criar objetos, objetos só são criados com objetos comuns.

Classe abstrata: Serve como um molde com partes prontas. Pode ter métodos com ou sem corpo (implementação). Usada quando classes filhas compartilham uma base comum.

Interface: Um contrato 100% abstrato (só define o que deve ser feito, não como). Serve para garantir que diferentes classes tenham os mesmos métodos, mesmo sem herança direta.
Maior diferença: 
- Toda vez que voce cria uma interface todos os metodos que voce que voce colocar nessa interface ele é obrigatoriamente abstrato.
- e tudo automaticamente é final, vc nao pode setar os valores;

### ENUM
Uma forma de criar um conjunto fixo de constantes nomeadas, 
que deixam o código mais legível e seguro — por exemplo, em vez de usar strings ou números soltos, 
você usa algo como Status.PENDENTE.

### Records
Uma forma rápida e imutável de representar dados. Ideal pra criar classes simples que só armazenam
valores, sem precisar escrever getters, 
equals, hashCode ou toString na mão. Menos código, mais clareza.

### Atalhos
psvm