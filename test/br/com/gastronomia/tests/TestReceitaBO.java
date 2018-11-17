package br.com.gastronomia.tests;


import br.com.gastronomia.dao.ReceitaDAO;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static  org.junit.Assert.assertEquals;

public class TestReceitaBO {

    @Mock
    private Receita receita;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        ReceitaBO receitaBO = new ReceitaBO();

    }

    @Test
    public void testActivateReceita() {

    }
//
//    @Test
//    public void testListReceita(){
//        ReceitaDAO receitaDAO = new ReceitaDAO();
//        assertEquals(, receitaDAO.findReceitaByIdUsuario(1));
//    }
}
