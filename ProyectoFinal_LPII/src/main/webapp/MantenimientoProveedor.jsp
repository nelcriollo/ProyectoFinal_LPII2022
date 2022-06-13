
<%
if (request.getSession().getAttribute("LISTAMenu") == null)
	response.sendRedirect("login.jsp");
%>

<jsp:include page="header.jsp" />

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mantenimiento Proveedor</title>

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

</head>

<body>
	<c:if test="${requestScope.MENSAJE!=null}">
			<div class="toast bg-black mx-auto mt-2" role="alert" aria-live="assertive"
				aria-atomic="true" data-bs-delay="3000">
				<div class="toast-header">

					<button type="button" class="btn-close" data-bs-dismiss="toast"
						aria-label="Close"></button>
				</div>
				<div class="toast-body text-light">${requestScope.MENSAJE}</div>
			</div>
	
	</c:if>

	<div class="container">

		<form id="idRegistrarProveedor" method="post"
			action="ServletProveedor?tipo=REGISTRAR" class="row mx-5 my-3 p-3">

			<div class="row mx-5 my-4">
				<div class="col-md-6 text-center p-3 lh-sm">
					<br>
					<h6 class="fw-bolder">Registro de Proveedores</h6>
					<p>Av Abancay cuadra. 5 S/N, Lima,Per�</p>
					<p>Telf: 990990215 - 989435229</p>
				</div>

				<div class="col-md-3 text-center p-3 lh-sm border border-secondary">
					<h5 class="fw-bolder">RUC:20401381291</h5>
					<h7>Registro de Proveeedores</h7>
					<div class="row">
						<div class="mb-2 row g-2 d-flex justify-content-center mr-3">
							<div class="col-auto">
								<label for="inputPassword6" class="col-form-label fw-bolder">NRO:</label>
							</div>
							<div class="col-auto">
								<input type="text" id="mpIdProveedor" name="mpIdProveedor"
									value="0" class="form-control"
									aria-describedby="passwordHelpInline">
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="row mx-4 my-2 mb-2">
				<h5 class="text-darck">Datos del Proveedor</h5>
			</div>

			<form class="row mx-5 my-2 p-2 border border-secondary">
				<!-- Primer nivel -->
				<div class="col-md-3 mb-2">

					<input type="text" class="form-control" id="mpRazonSocial"
						name="mpRazonSocial" requestFocus="true"
						placeholder="Raz�n Social">
				</div>
				<div class="col-md-1 mb-2"></div>
				<div class="col-md-5 mb-2">
					<input type="text" class="form-control" id="mpDireccion"
						name="mpDireccion" placeholder="Direcci�n">
				</div>
				<div class="col-md-1 mb-2"></div>
				<div class="col-md-2 mb-2">
					<button class="btn btn-dark m-1 mt-4 col-md-7 p-1" type="reset">Nuevo</button>
				</div>
				<!-- Segundo nivel -->
				<div class="col-md-3 mb-2">

					<input type="email" class="form-control" id="mpEmail"
						name="mpEmail" placeholder="Email">
				</div>
				<div class="col-md-1 mb-2"></div>
				<div class="col-md-3 mb-2">

					<input type="text" class="form-control" id="mpRuc" name="mpRuc"
						placeholder="RUC">
				</div>
				<div class="col-md-3 mb-2"></div>
				<div class="col-md-2 mb-2">
					<button class="btn btn-dark m-1 mt-4 col-md-7 p-1" type="submit">Grabar</button>
				</div>
				<!-- Tercer nivel -->
				<div class="col-md-3 mb-4">

					<input type="text" class="form-control" id="mpNombreComercial"
						name="mpNombreComercial" placeholder="Nombre Comercial">
				</div>
				<div class="col-md-1 mb-2"></div>
				<div class="col-md-3 mb-3">

					<input type="text" class="form-control" id="mpTelefono"
						name="mpTelefono" placeholder="Telefono">
				</div>
				<div class="col-md-5 mb-2"></div>
				<!-- Cuarto nivel -->
				<div class="col-md-3 mb-2">

					<input type="text" class="form-control" id="mpDepartamento"
						name="mpDepartamento" placeholder="Departamento">
				</div>
			</form>
		</form>

		<!-- modal para eliminar -->
		<div class="modal fade" id="modalEliminar" data-bs-backdrop="static"
			data-bs-keyboard="false" tabindex="-1"
			aria-labelledby="staticBackdropLabel" aria-hidden="true">
			<div class="modal-dialog modal-dialog-centered">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="staticBackdropLabel">Sistema</h5>
					</div>
					<div class="modal-body">
						<form id="idRegistrar" method="post"
							action="ServletProveedor?tipo=ELIMINAR">
							<input type="hidden" class="form-control" name="codigoEliminar"
								id="codigoEliminar">
							<h4>�Seguro de eliminar?</h4>
							<div class="modal-footer">
								<button type="submit" class="btn btn-primary">SI</button>
								<button type="button" class="btn btn-secondary"
									data-bs-dismiss="modal">NO</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>


		<div class="col mt-4">
			<table id="example" class="table table-striped" style="width: 100%">
				<thead class="table-dark">
					<tr>
						<th>C�DIGO</th>
						<th>RAZ�N SOCIAL</th>
						<th>NOMBRE COMERCIAL</th>
						<th>RUC</th>
						<th>EMAIL</th>
						<th>DIRECCI�N</th>
						<th>DEPARTAMENTO</th>
						<th>TELEFONO</th>
						<th>EDITAR</th>
						<th>ELIMINAR</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${requestScope.listaProveedor}" var="row">
						<tr>
							<td>${row.id_proveedor}</td>
							<td>${row.razon_social}</td>
							<td>${row.nombre_comercial}</td>
							<td>${row.numero_ruc}</td>
							<td>${row.email}</td>
							<td>${row.direccion}</td>
							<td>${row.departamento}</td>
							<td>${row.telefonos}</td>
							<td><button type="button" class="btn btn-success"
									data-bs-toggle="modal" data-bs-target="#staticBackdrop">Editar</button></td>
							<td><button type="button" class="btn btn-danger"
									data-bs-toggle="modal" data-bs-target="#modalEliminar">Eliminar</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<jsp:include page="footer.jsp" />


<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
			<scripts
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

	<script>
		var popoverTriggerList = [].slice.call(document
				.querySelectorAll('[data-bs-toggle="popover"]'))
		var popoverList = popoverTriggerList.map(function(popoverTriggerEl) {
			return new bootstrap.Popover(popoverTriggerEl)
		})
	</script>

	<script>
		$(document)
				.on(
						"click",
						".btn-EditarDatos",
						function() {
							let id_proveedor, razon_social, nombre_comercial, numero_ruc, email, direccion, departamento, telefonos;

							id_proveedor = $(this).parents("tr").find("td")[0].innerHTML;
							razon_social = $(this).parents("tr").find("td")[1].innerHTML;
							nombre_comercial = $(this).parents("tr").find("td")[2].innerHTML;
							numero_ruc = $(this).parents("tr").find("td")[3].innerHTML;
							email = $(this).parents("tr").find("td")[4].innerHTML;
							direccion = $(this).parents("tr").find("td")[5].innerHTML;
							departamento = $(this).parents("tr").find("td")[6].innerHTML;
							telefonos = $(this).parents("tr").find("td")[7].innerHTML;

							$("#mpIdProveedor").val(id_proveedor);
							$("#mpRazonSocial").val(razon_social);
							$("#mpNombreComercial").val(nombre_comercial);
							$("#mpRuc").val(numero_ruc);
							$("#mpEmail").val(email);
							$("#mpDireccion").val(direccion);
							$("#mpDepartamento").val(departamento);
							$("#mpTelefono").val(telefonos);

						})

		$(document).on("click", ".btn-danger", function() {
			//variable
			let id_proveedor;
			//obtener el c�digo del docente seg�n el bot�n eliminar que se a pulsado
			id_proveedor = $(this).parents("tr").find("td")[0].innerHTML;
			//asignar a la caja con id "codigoEliminar" el valor de la variable "cod"
			$("#codigoEliminar").val(id_proveedor);

		})
	</script>

	<script>
		$(document).ready(function() {
			$('.toast').toast('show');
		});
	</script>
		<script>
$(document).ready(function() {
	
    $('#example').DataTable();
   
} );

</script>
</body>
</html>