package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Product;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@DataJpaTest // Anotação para configurar o teste com um contexto JPA em memória
public class ProductRepositoryTests {

    @Autowired
    private ProductRepository repository; // Injeta o repositório que será testado
    private long exintingId;
   private long nonExistingId;

   @BeforeEach
   void setUp() throws  Exception{
       exintingId = 1L;
       nonExistingId = 1000L;
   }

    @Test
    public void deleteShouldDeleteObjectWhenIdExists() { // <AÇÃO> should <EFEITO> [when <CENÁRIO>]
        // Descrição do método de teste:
        // Teste o método deleteById para garantir que ele remove um produto corretamente quando o ID fornecido existe.


        // --- Arrange: Preparar os dados para o teste ---

        long existingId = 1L; // ID de um produto que deve existir no banco de dados de teste
        // Assumimos que antes do teste ser executado, existe um produto com ID 1 no banco de dados

        // --- Act: Executar a ação que está sendo testada ---

        repository.deleteById(existingId); // Chama o método de exclusão no repositório para o ID especificado

        // --- Assert: Verificar se os resultados são os esperados ---

        Optional<Product> result = repository.findById(existingId); // Tenta buscar o produto deletado
        Assertions.assertFalse(result.isPresent());
        // Verifica se o produto não está presente (o que significa que foi deletado com sucesso)
    }


    @Test
    public void deleteShouldThrowsEmptyResultDataAccessExceptionWhenIdDoesNotExist() {
        Assertions.assertThrows(EmptyResultDataAccessException.class, () -> {
            repository.deleteById(nonExistingId);
        });
    }


    //-------findById deveria
    @Test
    public void findByIdShouldReturnNonEmptyOptionalWhenExists(){
        //retornar um Optional<Product> não vazio quando o id existir

        long nonExistingIdnonExistingId = 1000L;
        Optional<Product> result = repository.findById(exintingId);
        Assertions.assertTrue(result.isPresent());
    }

    @Test
    public void findByIdShouldReturnOptionalWhenIdDoesNoExist(){
        // retornar um Optional<Product> vazio quando o id não existir
        Optional<Product> result = repository.findById(nonExistingId);
        Assertions.assertTrue(result.isEmpty());
    }
}
