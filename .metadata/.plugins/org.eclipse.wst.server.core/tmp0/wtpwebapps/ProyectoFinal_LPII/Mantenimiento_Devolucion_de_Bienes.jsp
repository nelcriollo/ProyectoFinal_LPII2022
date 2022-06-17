<%
if (request.getSession().getAttribute("LISTAMenu") == null)
	response.sendRedirect("login.jsp");
%>

<jsp:include page="header.jsp"/>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mantenimiento Devolucion</title>

<!--  jquery-->
<link rel="stylesheet"
	href=" https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link
	href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap5.min.css"
	rel="stylesheet">

<style type="text/css">

.help-block {
    color: red;
}
.form-group.has-error .form-control-label {
	color: red;
}

.form-group.has-error .form-control {
	border: 1px solid red;
	box-shadow: 0 0 0 0.2rem rgba(250, 16, 0, 0.18);
}
</style>


</head>
<body>

<c:if test="${requestScope.MENSAJE!=null}">
		<div class="toast bg-black mx-auto mt-2" role="alert"
			aria-live="assertive" aria-atomic="true" data-bs-delay="3000">
			<div class="toast-header">

				<button type="button" class="btn-close" data-bs-dismiss="toast"
					aria-label="Close"></button>
			</div>
			<div class="toast-body text-light">${requestScope.MENSAJE}</div>
		</div>

	</c:if>
	
<div class="container">


<div class="mt-5 p-5 bg-light">
<button type="button" class="btn btn-dark" data-bs-toggle="modal" data-bs-target="#exampleModal">Genera Ficha de Devoluci�n</button>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-fullscreen">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Mantenimiento de Devoluci�n</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
      
   <form id="IdRegistrarDevol" method="post" action="ServletBien?tipo=REGISTRAR"  class="form-horizontal border mt-1 mb-3">
	<div class="row mx-3 my-1">
			
					<div class="row mx-3 my-3">
				<div class="col-md-6 text-center p-2 lh-sm">
					<br>
					<h6 class="fw-bolder">Registro de Devoluci�n</h6>
					<p>Av Abancay cuadra. 5 S/N, Lima,Per�</p>
					<p>Telf: 990990215 - 989435229</p>
				</div>

				<div class="col-md-3 text-center p-3 lh-sm border border-secondary">
					<h5 class="fw-bolder">RUC:20401381291</h5>
					<h7>Ficha de Devoluci�n</h7>
					<div class="row">
						<div class="mb-2 row g-2 d-flex justify-content-center mr-3">
							<div class="col-auto">
								<label for="inputPassword6" class="col-form-label fw-bolder">NRO:</label>
							</div>
							<div class="col-auto">
								<input type="text" id="idnumerodev" name="numerodev"
									value="0" class="form-control"readonly="readonly"
									aria-describedby="passwordHelpInline">
							</div>
						</div>
					</div>
				</div>
			</div>

		<div class="col-md-2"></div>
	</div>

	<div class="row px-3">
		<h5>Datos de Cabecera</h5>
		
			<div class="row p-3">
				<div class="col-md-10 col-12">
					<div class="row">
						<div class="col-md-6 col-12">
							<div class="row my-1">
								<label for="txtFechaDevolucion" class=" col-6 col-form-label">Fecha
									de Devoluci�n</label>
								<div class="col-6">
									<input type="date" id="txtFechaDevolucion" class="form-control">
								</div>
							</div>
						</div>
						<div class="col-md-6 col-12">
							<div class="row my-1">
								<label for="mpDepartamento" class="col-6 col-form-label">Remitente</label>
								<div class="col-6">
									<input type="text" id="idRemitente" name="remitente" class="form-control">
								</div>

							</div>

						</div>

					</div>
					
					<div class="row">
						<div class="col-md-6 col-12">
							<div class="row my-1">
								<label for="txtProveedor" class=" col-6 col-form-label">Proveedor</label>
								<div class="col-6">
									<select id="txtProveedor" class="form-select">
										<option selected>Seleccionar</option>
										
									</select>
								</div>
							</div>
						</div>
						
						<div class="col-md-6 col-12">
							<div class="row my-1">
								<label for="mpDepartamento" class="col-6 col-form-label">Total
									cr�dito adeudado</label>
								<div class="col-6">
									<input type="text" id="mpDepartamento" class="form-control">
								</div>

							</div>

						</div>


					</div>
				</div>
	
			</div>

</div>

<div class="row p-3  mb-3">
		<h5 class="">Datos del Detalle</h5>
		
		  <div class="col-md-2">
    <label for="validationDefault01" class="form-label">Nro Ficha</label>
    <input type="text" class="form-control" id="validationDefault01" value="" required>
  </div>
  <div class="col-md-2">
    <label for="validationDefault02" class="form-label">C�digo de Bien</label>
    <input type="text" class="form-control" id="idBien" name="codBien" value="" required>
  </div>
    <div class="col-md-3">
    <label for="validationDefault02" class="form-label">Nombre del Bien</label>
    <input type="text" class="form-control" id="idNomBien" name="nomBien" value="" required>
  </div>
  
    <div class="col-md-5">
	    <div class="form-floating">
		  <textarea class="form-control" placeholder="" id="idDescrip" name="descripcionDano" style="height: 100px"></textarea>
		  <label for="floatingTextarea2">Descrpci�n del Da�o</label>
		</div>
  </div>
  
  <div class="col-md-4">
    <label for="validationDefaultUsername" class="form-label">Precio</label>
    <div class="input-group">
      <span class="input-group-text" id="inputGroupPrepend2">S/.</span>
      <input type="text" class="form-control" id="idprecio" name="precio"  aria-describedby="inputGroupPrepend2" required>
    </div>
  </div>
  
 <div class="col-md-4">
    <label for="validationDefault02" class="form-label">Cantidad</label>
    <input type="text" class="form-control" id="idcantidad" name="cantidad" value="" required>
  </div>
  
  <div class="col-md-4">
    <label for="validationDefaultUsername" class="form-label">Cr�dito Adeudado</label>
    <div class="input-group">
      <span class="input-group-text" id="inputGroupPrepend2">S/.</span>
      <input type="text" class="form-control" id="idcreditoAdeudado" name="creditoAdeudado"  aria-describedby="inputGroupPrepend2" required>
    </div>
  </div>


</div>

	<div class="row mt-5 p-3">	
      		<div class="col-lg-6 col-sm-12 mt-4 table-responsive">
			<table id="tableBienes" class="table table-striped table-sm" style="width: 100%">
						<thead class="table-dark">
				<tr >
					<th >CODIGO</th>
					<th >NOMBRE</th>
					<th >DESCRPCION</th>
					<th >PRECIO</th>
					<th ></th>
			
						</tr>
					</thead>
					<tbody>
					
					</tbody>
				</table>
			</div>
	
	<div class="col-lg-6 col-sm-12 mt-4 table-responsive">
			<table id="tableDetalle" class="table table-striped table-sm" style="width: 100%">
						<thead class="table-dark">
				<tr class="table-success">
					<th >CODIGO</th>
					<th >NOMBRE</th>
					<th >DESCRPCION</th>
					<th >Remitente</th>
					<th>Total</th>
					<th ></th>
				</tr>
			</thead>
			<tbody>
				
			</tbody>
			</table>
		</div>
     </div>
						<div class="col-md-12 text-center mt-4 mb-5"> 										
								<button type="submit" id="Guardar" class="btn btn-primary me-2"><i class="fas fa-save"></i> Registrar</button>
								<button type="button" id="Cancelar" class="btn btn-danger ms-2" data-dismiss="modal"><i class="fas fa-undo-alt"></i> Cancelar</button>
						</div> 

		</form>
      </div>
      		
      
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>


	


	<div class="col mt-4">
			<table id="tbexample" class="table table-striped" style="width: 100%">
						<thead class="table-dark">
				<tr class="table-success">
					<th >Num. de Devoluci�n</th>
					<th >Fecha de Devoluci�n</th>
					<th >Proveedor</th>
					<th >Remitente</th>
					<th>Total de Devoluci�n</th>
					<th ></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><i class="bi bi-trash-fill" style="font-size: 1.2rem;"></i>
						<button class="btn btn-secondary float-end mx-1">Eliminar</button>
						<button class="btn btn-secondary float-end mx-1">Actualizar</button>
						<button class="btn btn-secondary float-end mx-1">Generar detalle</button></td>
			</tbody>
		</table>
	</div>	
		
		
</div>
<br>
<br>

<jsp:include page="footer.jsp"/>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
			<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>


	<script
		src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js"></script>

	<!-- JS para validaci�n-->
	<script
		src="https://cdn.bootcdn.net/ajax/libs/bootstrap-validator/0.4.0/js/bootstrapValidator.js"></script>
		
		
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/toastr.min.js"></script>
		
			
		<script>
		
		cargarBines();

		
		function cargarBines(){
		
			$.get("ServletBienesJSON",function(response){
				$.each(response,function(index,item){
					$("#tableBienes").append("<tr><td>"+item.cod_bien+"</td><td>"+item.nombre+"</td><td>"+item.descripcion+"</td><td>"+
						"<button type='button' class='btn btn-outline-success btn-adicionar'><i class=' text-write fas fa-plus-circle'></i></button></td></tr>");
				})
				$('#tableBienes').DataTable();
			})
			
			
		}
		
		//asignar evento click a todos los botones con clase "btn-adicionar"
		$(document).on("click",".btn-adicionar",function(){
			let cod,des,cant,prec,creditoAdeu;
			cod=$("#idBien").val();
			des=$("#idDescrip").val();
			cant=$("#idcantidad").val();
			prec=$("#idprecio").val();
			creditoAdeu=$("#idcreditoAdeudado").val();
			$.get("ServletDevolucionBien?tipo=ADICIONAR",{"codigo":cod,"descripcionDano":des,"cantidad":cant,"precio":prec,"creditoAdeudado":creditoAdeu},function(response){
				console.log(response);
				$("#tableDetalle tbody").empty();
				$.each(response,function(index,item){
					$("#tableDetalle").append("<tr><td>"+item.id_Bien+"</td><td>"+item.descripcion_del_dano+"</td><td>"+item.precioCompra+"</td><td>"+item.cantidad+"</td><td>"+item.credito_adeudado+"</td><td>"+
						"<button type='button' class='btn btn-outline-danger btn-eliminar'><i class='fas fa-backspace'></i></button></td></tr>");
				})
				
			})
			
		})
		
		
		</script>	
		
		 
	<script>
		var popoverTriggerList = [].slice.call(document
				.querySelectorAll('[data-bs-toggle="popover"]'))
		var popoverList = popoverTriggerList.map(function(popoverTriggerEl) {
			return new bootstrap.Popover(popoverTriggerEl)
		})
	</script>

	<script>
$(document).ready(function() {
	
    $('#tbexample').DataTable();
    $('#tableDetalle').DataTable();
    $('#tableBienes').DataTable();
   
} );

</script>
	<script>
		$(document).ready(function() {
			$('.toast').toast('show');
		});
	</script>

</body>
</html>