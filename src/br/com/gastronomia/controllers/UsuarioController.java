package br.com.gastronomia.controllers;

import br.com.gastronomia.bo.dietoterapia.AvaliacaoAntropometricaBO;
import br.com.gastronomia.dto.AvaliacaoAntropometricaDTO;
import br.com.gastronomia.exception.PersistenciaException;
import br.com.gastronomia.exception.ValidationException;
import br.com.gastronomia.model.portocred.Usuario;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("usuarios")
    public class UsuarioController {
    private UsuarioBO usuarioBO = new UsuarioBO();

    @Context
    private HttpServletRequest request;


    @POST
    @Path("/")
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")

    public Response create(AvaliacaoAntropometricaDTO avaliacaoAntropometrica) throws PersistenciaException, ValidationException{
        try {
            Usuario resultado = avaliacaoBO.criarAtendimento(avaliacaoAntropometrica);
            return Response.ok().entity(resultado).status(Response.Status.ACCEPTED).build();
        } catch (final Exception e) {
            return Response.ok().status(Response.Status.BAD_REQUEST).build();
        }
    }

    @DELETE
    @Path("/{id}")
    @Produces("application/json; charset=UTF-8")
    //@JWTTokenNeeded
    public Response remove(@PathParam("id") long id) throws PersistenciaException, ValidationException {

        try {
            usuarioBO.deactivateAvaliacaoAntropometrica(id);
            return Response.ok().entity(new StandardResponseDTO(true, "Avaliação desativada com sucesso!")).status(Response.Status.ACCEPTED).build();
        } catch (Exception e) {
            return Response.ok().status(Response.Status.BAD_REQUEST).build();
        }

    }

    @GET
    @Path("/{id}")
    @Produces("application/json; charset=UTF-8")
    public Response searchById(@PathParam("id") long id) {
        try {
            return Response.ok().entity(avaliacaoBO.getById(id)).status(Response.Status.ACCEPTED).build();
        } catch (final Exception e) {
            return Response.ok().status(Response.Status.BAD_REQUEST).build();
        }
    }

    @GET
    @Path("/")
    @Produces("application/json; charset=UTF-8")
    public Response list()throws PersistenciaException, SQLException {
        try {
            return Response.ok().entity(avaliacaoBO.list()).status(Response.Status.ACCEPTED).build();
        } catch (final Exception e) {
            return Response.ok().status(Response.Status.BAD_REQUEST).build();
        }
    }

    @PUT
    @Path("/update")
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    public Response update(AvaliacaoAntropometricaDTO avaliacao) throws PersistenciaException, ValidationException {

        try {
            avaliacaoBO.atualizarAtendimento(avaliacao);
        } catch (ValidationException e) {
            return Response.ok().entity(e.getMessage()).status(Response.Status.BAD_REQUEST).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.ok().status(Response.Status.BAD_REQUEST).build();
        }
        return Response.ok().entity(new StandardResponseDTO(true, "AtendimentoNutricional " + avaliacao.getIdAtendimento() + " atualizado com sucesso!")).status(Response.Status.ACCEPTED).build();
    }
}

