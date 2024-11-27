# Exercício sobre Diagrama de Sequência: Criar Nota

## Objetivo
Desenhar o diagrama de sequência para o cenário de criação de uma nova nota em um blog e implementar o código correspondente às chamadas de métodos do diagrama de sequência.

## Cenário

### Descrição do Cenário
- O método `criarNota(texto: String, dataCriacao: String, idBlog: int)` pertence à classe `SistemaBlog`.
- Esse método é chamado após o usuário digitar o texto da nota e clicar em "Salvar".
- O método recebe como parâmetros:
  - **Texto da nota**
  - **Data de criação**
  - **ID do blog** onde a nota será criada.
- Com base no diagrama de classes fornecido (anexo), projete o diagrama de sequência que representa o fluxo de criação de uma nota.
- É permitido criar novos métodos em classes conforme necessário para atender ao fluxo.

---

## Requisitos

1. **Diagrama de Sequência:**
   - Use uma ferramenta de sua escolha para criar o diagrama (ex.: [draw.io](https://app.diagrams.net/)).
   - O diagrama deve incluir:
     - Objetos que participam do processo.
     - Chamadas de métodos, com parâmetros detalhados.
     - Fluxo de mensagens entre os objetos.
     - Retornos esperados das chamadas.

2. **Código Fonte:**
   - Implemente as chamadas de métodos projetadas no diagrama de sequência.
   - Use qualquer linguagem de programação orientada a objetos.

---

## Instruções para a Entrega

1. Faça o upload:
   - **Imagem** do diagrama de sequência (em formato `.png`, `.jpg` ou outro compatível).
   - **Código-fonte** com as implementações das chamadas de métodos descritas no diagrama.
2. Certifique-se de que os arquivos sejam enviados separadamente (não envie arquivos compactados, como `.zip` ou `.rar`).

---

## Exemplo de Fluxo do Diagrama de Sequência

1. O usuário aciona o método `criarNota` através da interface do sistema.
2. A classe `SistemaBlog` identifica o blog com base no `idBlog`.
3. Verifica-se se o usuário tem permissão para criar uma nota no blog.
4. Uma nova instância de `Nota` é criada e adicionada ao blog.
5. O blog armazena a nova nota em sua lista de conteúdos.

---
