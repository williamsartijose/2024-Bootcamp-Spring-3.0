package tests.entitites;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import entitites.Account;
import tests.factory.AccountFactory;

public class AccountTests {

    // Nome do método de teste deve seguir o padrão: <AÇÃO> should <EFEITO> [when <CENÁRIO>]
    // Isso ajuda a entender claramente o que o teste está verificando.
    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        
        // Seguindo o padrão AAA (Arrange, Act, Assert):
        
        // 1. Arrange: Configurar os objetos necessários para o teste.
        double amount = 200.0;  // Valor a ser depositado na conta
        double expectedValue = 196.0;  // Valor esperado após o depósito (200 - taxa de 2%)
        Account acc =  AccountFactory.createEmptyAccount(); // Conta inicializada com saldo zero e ID 1
        
        // 2. Act: Executar a ação que está sendo testada.
        acc.deposit(amount);  // Realizar o depósito na conta
        
        // 3. Assert: Verificar se o resultado é o esperado.
        // Comparamos o saldo atual da conta com o valor esperado.
        Assertions.assertEquals(expectedValue, acc.getBalance());  
    }
    
   //Teste deposito deveria fazer nada quando quantia for negativa
    
    
    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
    	
    	  // Seguindo o padrão AAA (Arrange, Act, Assert):
    	
    	// 1. Arrange: Configurar os objetos necessários para o teste.
    	 double expectedValue = 100.0;  // Valor esperado após o depósito (100)
    	 Account acc = AccountFactory.creatAccount(expectedValue);  // Conta inicializada com saldo 100
    	 double amount = - 200.0;  // Valor a ser depositado na conta - 200
          
          
           
           
           // 2. Act: Executar a ação que está sendo testada.
           acc.deposit(amount);  // Realizar o depósito na conta
           
           // 3. Assert: Verificar se o resultado é o esperado.
           // Comparamos o saldo atual da conta com o valor esperado.
           Assertions.assertEquals(expectedValue, acc.getBalance());  
    }
    
    //Teste saque total deveria limpar saldo e retornar todo saldo 
    
    
    @Test
    public void fullWithdrawShouldClearBalance() {
    	
 // Seguindo o padrão AAA (Arrange, Act, Assert):
    	
    	// 1. Arrange: Configurar os objetos necessários para o teste.
    	 double expectedValue = 0.0;  // Valor esperado após o depósito (0)   
    	 double initialBalance = 800.0;
    	 Account acc = AccountFactory.creatAccount(initialBalance);  // Conta inicializada com saldo 800
    	
    	 
    	
          
          
           
           
           // 2. Act: Executar a ação que está sendo testada.
    	 double result = acc.fullWirhdraw();   // Realizar o depósito na conta
           
           // 3. Assert: Verificar se o resultado é o esperado.
           // Comparamos o saldo atual da conta com o valor esperado.
           Assertions.assertTrue(expectedValue == acc.getBalance());  
           Assertions.assertTrue(result ==  initialBalance);  
    	
    	
    }
    
    
    //Testes para método withdraw

    
    public void withdrawShouldThrowExceptionWenInsufficientBalance() {
    	
    	Assertions.assertThrows(IllegalArgumentException.class, () -> {
    		Account acc = AccountFactory.creatAccount(800.0);
    	acc.wirhdraw(801.0);
    	});
    }

}
