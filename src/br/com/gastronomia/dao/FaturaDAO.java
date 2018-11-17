package br.com.gastronomia.dao;

import br.com.gastronomia.db.GenericHibernateDAO;
import br.com.gastronomia.exception.ValidationException;
import br.com.gastronomia.model.Fatura;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FaturaDAO extends GenericHibernateDAO<Fatura> {
    public long criarAvaliacaoAntropometrica(Fatura fatura) throws ValidationException {
        return  save(fatura);
    }

    public Fatura findRefeicaoByID(long id) {
        return (Fatura) findSingleObject("id", Fatura.class, id);
    }

    public long alterStatus(long id, boolean status) throws ValidationException  {
        Fatura fatura = findRefeicaoByID(id);
        fatura.setStatus(status);
        return merge(fatura);
    }

    public long update(Fatura fatura) throws ValidationException {
        return merge(fatura);
    }



}
