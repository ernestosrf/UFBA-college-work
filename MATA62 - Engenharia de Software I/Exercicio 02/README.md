# Exercício sobre Diagrama de Classes: Sistema de Blogs

## Objetivo
Desenhar um diagrama de classes e implementar o código correspondente a um sistema de blogs, baseado nos requisitos descritos abaixo.

## Requisitos do Sistema

1. Um blog possui:
   - Título
   - Data de criação
   - Um conjunto de conteúdos

2. Tipos de conteúdos:
   - **Notas:** texto e data de criação
   - **Comentários:** texto e data de criação

3. Usuários:
   - Todo usuário possui um e-mail único (não pode haver dois usuários com o mesmo e-mail).

4. Funcionalidades do sistema:
   - Permitir a criação de blogs.
   - Permitir a utilização de blogs.
   - Qualquer usuário pode ler conteúdos.
   - Somente o dono do blog pode criar notas.
   - Qualquer usuário pode criar comentários (é necessário que o usuário leia as notas para criar um comentário).
   - Somente o dono do blog pode remover conteúdos. 
     - Para remover um conteúdo, o dono do blog precisa lê-lo.
     - Caso um comentário seja removido, o autor do comentário deve ser notificado por e-mail.

## Instruções para a Atividade

1. **Diagrama de Classes:**
   - Utilize uma ferramenta de sua preferência para criar o diagrama (sugestão: [draw.io](https://app.diagrams.net/)).
   - O diagrama deve incluir:
     - Classes e seus atributos
     - Relacionamentos
     - Multiplicidade
     - Navegabilidade
   - Não é necessário incluir métodos nas classes.

2. **Código Fonte:**
   - Escreva o código correspondente ao diagrama de classes em uma linguagem de programação orientada a objetos de sua escolha.
   - Certifique-se de que o código reflita os requisitos apresentados.

3. **Entrega:**
   - Faça o upload:
     - Da **imagem** do diagrama de classes (formato de imagem, como `.png` ou `.jpg`).
     - Dos **arquivos do código fonte** (não envie arquivos compactados, como `.zip` ou `.rar`).

---

## Exemplo de Implementação

### Etapas:
1. **Criar o diagrama de classes:** desenhe as classes representando os atributos e relacionamentos com base nos requisitos.
2. **Codificar as classes:** implemente as classes no código considerando as restrições (exemplo: validação de e-mails únicos).

---
