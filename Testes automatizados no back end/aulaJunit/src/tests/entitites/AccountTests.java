package tests.entitites;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import entitites.Account;

public class AccountTests {

    // Nome do método de teste deve seguir o padrão: <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    // Isso ajuda a entender claramente o que o teste está verificando.
    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        
        // Seguindo o padrão AAA (Arrange, Act, Assert):
        
        // 1. Arrange: Configurar os objetos necessários para o teste.
        double amount = 200.0;  // Valor a ser depositado na conta
        double expectedValue = 196.0;  // Valor esperado após o depósito (200 - taxa de 2%)
        Account acc = new Account(1L, 0.0);  // Conta inicializada com saldo zero e ID 1
        
        // 2. Act: Executar a ação que está sendo testada.
        acc.deposit(amount);  // Realizar o depósito na conta
        
        // 3. Assert: Verificar se o resultado é o esperado.
        // Comparamos o saldo atual da conta com o valor esperado.
        Assertions.assertEquals(expectedValue, acc.getBalance());  
    }
}
