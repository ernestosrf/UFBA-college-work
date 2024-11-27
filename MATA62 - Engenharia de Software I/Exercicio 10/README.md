# Exercício sobre o Padrão Expert

## Objetivo
Analisar o código-fonte das classes fornecidas e identificar possíveis violações ao padrão **Expert**. Alterar o código para remover as violações e fazer upload dos arquivos corrigidos.

---

## O que é o Padrão Expert?
O padrão **Expert** atribui responsabilidades a classes que possuem a informação necessária para desempenhar a tarefa. Isso evita dependências desnecessárias e promove coesão dentro das classes.

---

## Tarefa

1. **Análise do Código-Fonte:**
   - Verifique onde as responsabilidades estão sendo atribuídas de forma inadequada.
   - Identifique trechos do código onde:
     - Uma classe realiza operações que pertencem logicamente a outra classe.
     - Métodos exigem informações que já deveriam estar encapsuladas em outra classe.

2. **Refatoração do Código:**
   - Reatribua as responsabilidades de maneira que as classes responsáveis pelas informações realizem as operações.
   - Certifique-se de que o código refatorado:
     - **Siga o padrão Expert.**
     - **Mantenha baixo acoplamento.**
     - **Promova alta coesão.**

3. **Testes:**
   - Após a refatoração, verifique se o código ainda funciona corretamente, atendendo aos requisitos originais.

---

## Instruções para a Entrega

1. Faça o upload dos arquivos do **código-fonte corrigido**.
2. Certifique-se de que os arquivos estão nomeados corretamente e organizados.

---