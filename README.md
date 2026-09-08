**1. Qual era o principal problema do código original?**
O código sofria com baixa legibilidade devido ao uso de variáveis sem significado semântico (como `n`, `a`, `b` e `c`) e falta de organização, pois toda a execução e lógica estavam acopladas no único método principal.

**2. Quais melhorias você realizou?**
As variáveis foram renomeadas para refletir seu conteúdo, como `nomeAluno` e `mediaFinal`. O código também foi padronizado e dividido em três novos métodos: `calcularMedia`, `verificarSituacao` e `apresentarResultados`.

**3. Como a modularização facilitou a organização do código?**
A modularização garantiu que cada parte do sistema tivesse uma responsabilidade única e específica. Isso facilita a leitura (código auto-comentado), a manutenção futura e eventuais testes isolados de cada função.

**4. Como o Git ajudou a controlar as alterações realizadas no sistema?**
O Git permitiu manter um histórico seguro através do primeiro commit e isolar o ambiente de refatoração criando a branch `melhoria-boas-praticas`. O Pull Request garantiu que as alterações fossem documentadas e revisadas antes de serem mescladas na branch principal (`main`).