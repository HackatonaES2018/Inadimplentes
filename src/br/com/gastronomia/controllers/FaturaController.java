package br.com.gastronomia.controllers;



import br.com.gastronomia.dto.FaturaDTO;
import br.com.gastronomia.dto.StandardResponseDTO;
import br.com.gastronomia.exception.PersistenciaException;
import br.com.gastronomia.exception.ValidationException;
import br.com.gastronomia.model.Fatura;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;

@Path("faturas")
public class FaturaController {
    private br.com.gastronomia.bo.dietoterapia.FaturaBO faturaBO = new br.com.gastronomia.bo.dietoterapia.FaturaBO();

    @POST
    @Path("/")
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    public Response create(FaturaDTO dto, @Context UriInfo uriInfo) {
        try {
            Fatura resultado = faturaBO.criarFatura(dto);
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
            faturaBO.deactivateRefeicao(id);
            return Response.ok().entity(new StandardResponseDTO(true, "Avaliação desativada com sucesso!")).status(Response.Status.ACCEPTED).build();
        } catch (Exception e) {
            return Response.ok().status(Response.Status.BAD_REQUEST).build();
        }

    }

    @GET
    @Path("/")
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    public Response list() {
        return Response.ok().entity(faturaBO.list()).build();
    }


    @PUT
    @Path("/update")
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    public Response update(FaturaDTO dto) {
        try {
            faturaBO.update(dto);
            return Response.noContent().build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }
    }




}