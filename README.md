# Tratamento de Dados DAD

Repositório para fazer as inserções dos dados para o projeto de web service com SOAP da disciplina de DAD.

Passos para fazer o banco do projeto:

1. Rodar o docker compose desse repositório, assim vai instanciar um banco MySQL;
2. No Package 'db' na pasta `sqls`, executar o arquivo `estados.sql` para criar tabela estados e inserir os dados;
3. No Package 'db' na pasta `sqls`, executar o arquivo `municipios.sql` para criar tabela municipios;
4. Para inserir os dados dos municípios, primeiro baixar no formato CSV a aba município da seguinte planilha: [Planilha CodigosIBGE](https://docs.google.com/spreadsheets/d/1YSIJMvxd2-pXVSV8q4clS22tYRNBv9NuQzxdFv-ZW1I/edit?gid=892123635#gid=892123635);
5. Colocar o CSV na pasta raiz do projeto;
6. Ajustar o caminho do arquivo e executar `MunicipioMain`;
7. No Package 'db' na pasta `sqls`, executar o arquivo `populacao.sql` para criar as tabelas populacao_total e populacao_faixa_etaria;
8. Para inserir os dados da tabela populacao_total, é necessário baixar no formato CSV a aba PopulaçãoTotal da seguinte planilha: [PopulaçãoTotal](https://docs.google.com/spreadsheets/d/13bxqy2-QjzNmPhpiFhxirkleJeSfiFE7jVaYBUP4ivg/edit?gid=1410854874#gid=1410854874);
9. Para inserir os dados da tabela populacao_faixa_etaria, é necessário baixar no formato CSV a aba total na seguinte planilha: [PopulaçãoFaixaEtaria](https://docs.google.com/spreadsheets/d/1SIuR-bfvAy5WM_nJzVwhu95EUr-UKA4KAuvoO5xHN1c/edit?gid=175398947#gid=175398947);
10. Colocar os CSV's na pasta raiz do projeto;
11. Agora, ajustar o caminho do arquivo e executar `PopulacaoMain` para inserir os dados na tabela populacao_total;
12. E depois ajustar o caminho do arquivo e executar `PopulacaoFaixaEtariaMain` para inserir os dados na tabela populacao_faixa_etaria;
13. Para a parte das UBS's, no Package 'db' na pasta `sqls`, executar o arquivo `unidades_basica_saude.sql` para criar a tabela unidades_basica_saude;
14. Para inserir os dados das UBS's, é necessário baixar o arquivo no formato CSV da planilha: [EstabelecimentosDeSaúde](https://docs.google.com/spreadsheets/d/1BLBvP5ypAomfVsYMCN5NPHtpW4p8mexqaO48O_8K9GY/edit?gid=2003975808#gid=2003975808);
15. Colocar o CSV na pasta raiz do projeto;
16. E depois executar o `UnidadeBasicaSaudeMain` para inserir os dados na tabela unidades_basica_saude;
17. Para inserir os profissionais de saúde, no Package 'db' na pasta `sqls`, executar o arquivo `profissionais_saude.sql` para criar a tabela profissionais_saude;
18. Primeiro vai ser preciso inserir os médicos, baixar o arquivo no formato CSV da planilha: [MedicosPorMunicipio](https://docs.google.com/spreadsheets/d/1_E_RW7rIOlqxXV6dOG1O5eXfpA3YzrXU/edit?gid=719777592#gid=719777592);
19. Colocar o CSV na pasta raiz do projeto;
20. E depois ajustar o caminho do arquivo e executar `MedicosMain` para inserir os dados na tabela profissionais_saude;
21. Segundo vai ser preciso inserir os enfermeiros, baixar o arquivo no formato CSV a aba de Enfermeiros da planilha: [EnfermeirosPorMunicipio](https://docs.google.com/spreadsheets/d/10LDUSo6tIPIGuICjyTv15YodRW6mWO2O/edit?gid=998201765#gid=998201765);
22. Colocar o CSV na pasta raiz do projeto;
23. E depois ajustar o caminho do arquivo e executar `EnfermeirosMain` para atualizar os dados na tabela profissionais_saude com a quantidade de enfermeiros por município;
24. Pronto! O banco de dados está populado com os dados necessários para os serviços web service SOAP.
