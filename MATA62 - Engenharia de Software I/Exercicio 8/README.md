# Exercício de Diagrama de Sequência: Alugar Fita

## Objetivo
Desenhar o diagrama de sequência para o cenário de aluguel de uma fita no sistema e implementar o código correspondente às chamadas de métodos descritas no diagrama.

---

## Cenário

### Descrição do Cenário
- A classe `Sistema` possui o método `alugarFita(String nomeCliente, String tituloFita, int diasAlugada)`.
- O método recebe como parâmetros:
  - **Nome do cliente** (`String`) que deseja realizar o aluguel.
  - **Título da fita** (`String`) que será alugada.
  - **Número de dias** (`int`) que a fita ficará alugada.
- A classe `Sistema` mantém listas:
  - De todos os **clientes** do sistema.
  - De todas as **fitas** disponíveis.

### Fluxo do Aluguel
1. O método `alugarFita` localiza o cliente pelo nome na lista de clientes.
2. Localiza a fita pelo título na lista de fitas.
3. Cria uma instância da classe `Aluguel`, associando o cliente, a fita e o período de aluguel.
4. Adiciona o aluguel à lista de aluguéis do cliente.

---

## Requisitos

### Diagrama de Sequência
1. Utilize uma ferramenta de modelagem para criar o diagrama (ex.: [draw.io](https://app.diagrams.net/)).
2. Inclua no diagrama:
   - Objetos que participam no processo de aluguel.
   - Sequência de chamadas de métodos, com parâmetros detalhados.
   - Mensagens trocadas entre os objetos, incluindo retornos esperados.

### Código Fonte
1. Implemente as chamadas de métodos descritas no diagrama de sequência.
2. Certifique-se de que o código segue o padrão **Creator**:
   - A classe mais responsável pela criação de objetos deve ser encarregada de criar a instância da classe `Aluguel`.

---

## Fluxo do Diagrama de Sequência

1. O método `alugarFita` é chamado na classe `Sistema`.
2. A classe `Sistema` busca o cliente na lista de clientes.
3. A classe `Sistema` busca a fita na lista de fitas.
4. A classe `Cliente` é responsável por criar o objeto `Aluguel`, utilizando as informações da fita e do período de aluguel.
5. O objeto `Aluguel` é associado ao cliente e registrado no sistema.

---

## Exemplos de Métodos Criados

1. **Classe `Cliente`:**
   - Método `adicionarAluguel(Aluguel aluguel)` para associar um aluguel ao cliente.
   - Método para criar um objeto do tipo `Aluguel` (caso necessário).

2. **Classe `Sistema`:**
   - Métodos auxiliares para buscar clientes e fitas na lista pelo nome/título.

---

## Instruções para a Entrega

1. Faça o upload:
   - **Imagem** do diagrama de sequência (em formato `.png`, `.jpg`, ou outro compatível).
   - **Código-fonte** implementado com base no diagrama.
2. Certifique-se de que os arquivos sejam enviados separadamente (não envie arquivos compactados, como `.zip` ou `.rar`).

---