# Exercício sobre Diagrama de Sequência: Listar Notas

## Objetivo
Desenhar o diagrama de sequência para o cenário de listagem dos textos de todas as notas de um blog e implementar o código correspondente às chamadas de métodos descritas no diagrama.

## Cenário

### Descrição do Cenário
- O método `obterTextosNotas(idBlog: int): List<String>` pertence à classe `SistemaBlog`.
- Esse método é chamado quando o usuário clica no título de um blog para visualizar as notas.
- O método recebe como parâmetro o **ID do blog** e retorna uma **lista de strings** contendo os textos das notas do blog.
- O diagrama deve seguir o padrão GRASP **Expert**, assegurando que as responsabilidades sejam atribuídas às classes que possuem a informação necessária para cumprir a tarefa.

---

## Requisitos

1. **Diagrama de Sequência:**
   - Utilize uma ferramenta de sua escolha para criar o diagrama (ex.: [draw.io](https://app.diagrams.net/)).
   - O diagrama deve incluir:
     - Objetos que participam no processo.
     - Chamadas de métodos, com parâmetros detalhados.
     - Mensagens trocadas entre os objetos.
     - Retornos esperados das chamadas.

2. **Código Fonte:**
   - Implemente as chamadas de métodos descritas no diagrama de sequência.
   - Use qualquer linguagem de programação orientada a objetos.
   - Certifique-se de que o código segue os princípios do padrão GRASP **Expert**.

---

## Fluxo do Diagrama de Sequência

1. O usuário aciona o método `obterTextosNotas` através da interface do sistema ao clicar no título de um blog.
2. A classe `SistemaBlog` identifica o blog a partir do `idBlog` fornecido.
3. O sistema delega à classe **Blog** a responsabilidade de recuperar suas notas.
4. A classe **Blog** retorna uma lista de objetos do tipo **Nota**.
5. A classe **SistemaBlog** coleta os textos das notas e os organiza em uma lista de strings.
6. A lista de strings é retornada ao chamador.

---

## Instruções para a Entrega

1. Faça o upload:
   - **Imagem** do diagrama de sequência (em formato `.png`, `.jpg` ou outro compatível).
   - **Código-fonte** com a implementação das chamadas de métodos do diagrama.
2. Certifique-se de que os arquivos sejam enviados separadamente (não envie arquivos compactados, como `.zip` ou `.rar`).

---

## Exemplo de Código

### Estrutura Geral:
1. Método `obterTextosNotas` na classe `SistemaBlog`.
2. Método na classe `Blog` para recuperar as notas associadas.
3. Uso da classe `Nota` para extrair os textos de cada nota.

---
