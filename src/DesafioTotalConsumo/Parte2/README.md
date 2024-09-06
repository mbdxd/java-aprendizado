# Descrição

Desenvolva um sistema para monitorar o consumo mensal de dados móveis de clientes, verificando se o consumo excede o limite do plano adquirido. O sistema deve comparar o limite mensal, recebido em gigabytes (GB), com o consumo total de dados acumulado até o momento, fornecido em megabytes (MB). Se o consumo total ultrapassar o limite mensal, o sistema deverá informar ao cliente para adquirir ou renovar o pacote; caso contrário, deve retornar quanto, em megabytes (MB), ainda está disponível para uso no mês.

# Entrada

A entrada do programa é fornecida em duas linhas:

1. A primeira linha contém o limite mensal de dados em gigabytes (GB).
2. A segunda linha contém o consumo total de dados móveis em megabytes (MB).

# Saída

O programa deve produzir uma das seguintes saídas:

- Se o consumo total ultrapassar o limite mensal, exibir: **"Limite de dados excedido. Compre ou renove seu pacote."**
- Se o consumo total estiver dentro do limite, exibir a quantidade de dados disponíveis, em MB: **"Você ainda possui X MB disponíveis."**

# Exemplos

| Entrada        | Saída                                                   |
| -------------- | ------------------------------------------------------- |
| 10<br>11264    | Limite de dados excedido. Compre ou renove seu pacote.  |
| 25<br>20480    | Você ainda possui 5120 MB disponíveis.                  |
| 20<br>19456    | Você ainda possui 1024 MB disponíveis.                  |
