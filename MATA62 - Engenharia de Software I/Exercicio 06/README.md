# Exercício sobre Diagrama de Sequência: Criar Comentário

## Objetivo
Desenhar o diagrama de sequência para o cenário de criação de um novo comentário em uma nota e implementar o código correspondente às chamadas de métodos descritas no diagrama.

---

## Cenário

### Descrição do Cenário
- O método `criarComentario(texto: String, dataCriacao: String, idBlog: int, idNota: int, autor: Usuario)` pertence à classe `SistemaBlog`.
- Esse método é chamado após o usuário digitar o texto do comentário e clicar em "Salvar".
- Parâmetros do método:
  - **Texto do comentário** (`String`).
  - **Data de criação do comentário** (`String`).
  - **ID do blog** onde a nota está localizada (`int`).
  - **ID da nota** que será comentada (`int`).
  - **Autor do comentário**, representado como um objeto da classe `Usuario`.
- A classe `Nota` possui um atributo `id` (`int`) como identificador único.
- O diagrama e o código devem seguir os padrões GRASP **Expert**, **Creator** e **Baixo Acoplamento**.

---

## Requisitos

### Diagrama de Sequência
1. Utilize uma ferramenta de sua escolha para criar o diagrama (ex.: [draw.io](https://app.diagrams.net/)).
2. O diagrama deve incluir:
   - Objetos envolvidos no processo de criação do comentário.
   - Sequência de chamadas de métodos, com os parâmetros detalhados.
   - Mensagens trocadas entre objetos, incluindo os retornos esperados.

### Código Fonte
1. Implemente as chamadas de métodos descritas no diagrama de sequência.
2. Use qualquer linguagem de programação orientada a objetos.
3. Siga os princípios dos padrões GRASP:
   - **Expert:** Atribua responsabilidades às classes que possuem a informação necessária.
   - **Creator:** Delegue a criação do comentário à classe mais apropriada.
   - **Baixo Acoplamento:** Mantenha dependências mínimas entre as classes.

---

## Fluxo do Diagrama de Sequência

1. O usuário aciona o método `criarComentario` ao digitar o texto do comentário e clicar em "Salvar".
2. A classe `SistemaBlog` localiza o blog com base no `idBlog`.
3. A classe `Blog` identifica a nota com base no `idNota`.
4. A classe `Nota` é responsável por criar o comentário e adicioná-lo à sua lista de comentários.
5. O comentário é associado ao autor (`Usuario`) e armazenado na nota.
6. O sistema confirma o sucesso da operação.

---

## Estrutura do Código

### Exemplos de Métodos
1. **Classe `SistemaBlog`:**
   - Método `criarComentario` que delega a busca do blog e da nota.
2. **Classe `Blog`:**
   - Método para localizar uma nota por `idNota`.
3. **Classe `Nota`:**
   - Método para criar e armazenar o comentário.

---

## Instruções para a Entrega

1. Faça o upload:
   - **Imagem** do diagrama de sequência (em formato `.png`, `.jpg` ou outro compatível).
   - **Código-fonte** com a implementação das chamadas de métodos descritas.
2. Certifique-se de que os arquivos sejam enviados separadamente (não envie arquivos compactados, como `.zip` ou `.rar`).

---
