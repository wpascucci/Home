<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>Prontuario Eletronico do Paciente | Cadastro de Paciente</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link rel="stylesheet" type="text/css" href="assets/global/plugins/select2/select2.css"/>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME STYLES -->
<link href="assets/global/css/components.css" rel="stylesheet" type="text/css"/>
<link href="assets/global/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="assets/admin/layout/css/layout.css" rel="stylesheet" type="text/css"/>
<link id="style_color" href="assets/admin/layout/css/themes/default.css" rel="stylesheet" type="text/css"/>
<link href="assets/admin/layout/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<!-- DOC: Apply "page-header-fixed-mobile" and "page-footer-fixed-mobile" class to body element to force fixed header or footer in mobile devices -->
<!-- DOC: Apply "page-sidebar-closed" class to the body and "page-sidebar-menu-closed" class to the sidebar menu element to hide the sidebar by default -->
<!-- DOC: Apply "page-sidebar-hide" class to the body to make the sidebar completely hidden on toggle -->
<!-- DOC: Apply "page-sidebar-closed-hide-logo" class to the body element to make the logo hidden on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-hide" class to body element to completely hide the sidebar on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-fixed" class to have fixed sidebar -->
<!-- DOC: Apply "page-footer-fixed" class to the body element to have fixed footer -->
<!-- DOC: Apply "page-sidebar-reversed" class to put the sidebar on the right side -->
<!-- DOC: Apply "page-full-width" class to the body element to have full width page without the sidebar menu -->
<body class="page-header-fixed page-quick-sidebar-over-content ">
<!-- BEGIN HEADER -->
<div class="page-header navbar navbar-fixed-top">
	<!-- BEGIN HEADER INNER -->
	<div class="page-header-inner">
		<!-- BEGIN LOGO -->
		<div class="page-logo">
			<a href="index.html">
			<img src="assets/admin/layout/img/logoM.png" alt="logo" class="logo-default"/>
			</a>
			<div class="menu-toggler sidebar-toggler hide">
				<!-- DOC: Remove the above "hide" to enable the sidebar toggler button on header -->
			</div>
		</div>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse">
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN TOP NAVIGATION MENU -->
		<div class="top-menu">
			<ul class="nav navbar-nav pull-right">
				<!-- BEGIN USER LOGIN DROPDOWN -->
				<li class="dropdown dropdown-user">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
					<img alt="" class="img-circle" src="assets/admin/layout/img/avatar3_small.jpg"/>
					<span class="username username-hide-on-mobile">
					Bob </span>
					<i class="fa fa-angle-down"></i>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a href="extra_profile.html">
							<i class="icon-user"></i> My Profile </a>
						</li>
						<li>
							<a href="page_calendar.html">
							<i class="icon-calendar"></i> My Calendar </a>
						</li>
						<li>
							<a href="inbox.html">
							<i class="icon-envelope-open"></i> My Inbox <span class="badge badge-danger">
							3 </span>
							</a>
						</li>
						<li>
							<a href="#">
							<i class="icon-rocket"></i> My Tasks <span class="badge badge-success">
							7 </span>
							</a>
						</li>
						<li class="divider">
						</li>
						<li>
							<a href="extra_lock.html">
							<i class="icon-lock"></i> Lock Screen </a>
						</li>
						<li>
							<a href="login.html">
							<i class="icon-key"></i> Log Out </a>
						</li>
					</ul>
				</li>
				<!-- END USER LOGIN DROPDOWN -->
			</ul>
		</div>
		<!-- END TOP NAVIGATION MENU -->
	</div>
	<!-- END HEADER INNER -->
</div>
<!-- END HEADER -->
<div class="clearfix">
</div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
	<!-- BEGIN SIDEBAR -->
	<div class="page-sidebar-wrapper">
		<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
		<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
		<div class="page-sidebar navbar-collapse collapse">
			<!-- BEGIN SIDEBAR MENU -->
			<ul class="page-sidebar-menu " data-auto-scroll="true" data-slide-speed="200">
				<!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
				<li class="sidebar-toggler-wrapper">
					<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
					<div class="sidebar-toggler">
					</div>
					<!-- END SIDEBAR TOGGLER BUTTON -->
				</li>
				<!-- DOC: To remove the search box from the sidebar you just need to completely remove the below "sidebar-search-wrapper" LI element -->
				<li class="start ">
					<a href="javascript:;">
					<i class="icon-home"></i>
					<span class="title">Home</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="index.html">
							<i class="icon-bar-chart"></i>
							Default Dashboard</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-basket"></i>
					<span class="title">eCommerce</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="ecommerce_index.html">
							<i class="icon-home"></i>
							Dashboard</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-rocket"></i>
					<span class="title">Page Layouts</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="layout_horizontal_sidebar_menu.html">
							Horizontal & Sidebar Menu</a>
						</li>
					</ul>
				</li>
				<!-- BEGIN FRONTEND THEME LINKS -->
				<li>
					<a href="javascript:;">
					<i class="icon-star"></i>
					<span class="title">
					Frontend Themes </span>
					<span class="arrow">
					</span>
					</a>
					<ul class="sub-menu">
						<li class="tooltips" data-container="body" data-placement="right" data-html="true" data-original-title="Complete eCommerce Frontend Theme For Metronic Admin">
							<a href="http://keenthemes.com/preview/index.php?theme=metronic_frontend&page=shop-index.html" target="_blank">
							<span class="title">
							eCommerce Frontend </span>
							</a>
						</li>
						<li class="tooltips" data-container="body" data-placement="right" data-html="true" data-original-title="Complete Corporate Frontend Theme For Metronic Admin">
							<a href="http://keenthemes.com/preview/index.php?theme=metronic_frontend" target="_blank">
							<span class="title">
							Corporate Frontend </span>
							</a>
						</li>
						<li class="tooltips" data-container="body" data-placement="right" data-html="true" data-original-title="Complete One Page Parallax Frontend Theme For Metronic Admin">
							<a href="http://keenthemes.com/preview/index.php?theme=metronic_frontend&page=onepage-index.html" target="_blank">
							<span class="title">
							One Page Parallax Frontend </span>
							</a>
						</li>
					</ul>
				</li>
				<!-- END FRONTEND THEME LINKS -->
				<li>
					<a href="javascript:;">
					<i class="icon-diamond"></i>
					<span class="title">UI Features</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="ui_general.html">
							General Components</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-puzzle"></i>
					<span class="title">UI Components</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="components_pickers.html">
							Pickers</a>
						</li>
					</ul>
				</li>
				<li class="active open">
					<a href="javascript:;">
					<i class="icon-user"></i>
					<span class="title">Paciente</span>
					<span class="selected"></span>
					<span class="arrow open"></span>
					</a>
					<ul class="sub-menu">
						<li class="active">
							<a href="cadastro_paciente.html">
							Cadastro do Paciente</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-logout"></i>
					<span class="title">Quick Sidebar</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">

						<li>
							<a href="quick_sidebar_push_content.html">
							Push Content</a>
						</li>
						<li>
							<a href="quick_sidebar_over_content.html">
							Over Content</a>
						</li>
						<li>
							<a href="quick_sidebar_over_content_transparent.html">
							Over Content & Transparent</a>
						</li>
						<li>
							<a href="quick_sidebar_on_boxed_layout.html">
							Boxed Layout</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-envelope-open"></i>
					<span class="title">Email Templates</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="email_newsletter.html">
							Responsive Newsletter<br>
							 Email Template</a>
						</li>
						<li>
							<a href="email_system.html">
							Responsive System<br>
							 Email Template</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-docs"></i>
					<span class="title">Pages</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="page_portfolio.html">
							<i class="icon-feed"></i>
							<span class="badge badge-warning badge-roundless">new</span>Portfolio</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-present"></i>
					<span class="title">Extra</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="extra_profile.html">
							User Profile</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-folder"></i>
					<span class="title">Multi Level Menu</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="javascript:;">
							<i class="icon-settings"></i> Item 1 <span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li>
									<a href="javascript:;">
									<i class="icon-user"></i>
									Sample Link 1 <span class="arrow"></span>
									</a>
									<ul class="sub-menu">
										<li>
											<a href="#"><i class="icon-power"></i> Sample Link 1</a>
										</li>
										<li>
											<a href="#"><i class="icon-paper-plane"></i> Sample Link 1</a>
										</li>
										<li>
											<a href="#"><i class="icon-star"></i> Sample Link 1</a>
										</li>
									</ul>
								</li>
								<li>
									<a href="#"><i class="icon-camera"></i> Sample Link 1</a>
								</li>
								<li>
									<a href="#"><i class="icon-link"></i> Sample Link 2</a>
								</li>
								<li>
									<a href="#"><i class="icon-pointer"></i> Sample Link 3</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="javascript:;">
							<i class="icon-globe"></i> Item 2 <span class="arrow"></span>
							</a>
							<ul class="sub-menu">
								<li>
									<a href="#"><i class="icon-tag"></i> Sample Link 1</a>
								</li>
								<li>
									<a href="#"><i class="icon-pencil"></i> Sample Link 1</a>
								</li>
								<li>
									<a href="#"><i class="icon-graph"></i> Sample Link 1</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">
							<i class="icon-bar-chart"></i>
							Item 3 </a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-briefcase"></i>
					<span class="title">Data Tables</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="table_basic.html">
							Basic Datatables</a>
						</li>
						<li>
							<a href="table_responsive.html">
							Responsive Datatables</a>
						</li>
						<li>
							<a href="table_managed.html">
							Managed Datatables</a>
						</li>
						<li>
							<a href="table_editable.html">
							Editable Datatables</a>
						</li>
						<li>
							<a href="table_advanced.html">
							Advanced Datatables</a>
						</li>
						<li>
							<a href="table_ajax.html">
							Ajax Datatables</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-wallet"></i>
					<span class="title">Portlets</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="portlet_general.html">
							General Portlets</a>
						</li>
						<li>
							<a href="portlet_general2.html">
							<span class="badge badge-roundless badge-danger">new</span>New Portlets #1</a>
						</li>
						<li>
							<a href="portlet_general3.html">
							<span class="badge badge-roundless badge-danger">new</span>New Portlets #2</a>
						</li>
						<li>
							<a href="portlet_ajax.html">
							Ajax Portlets</a>
						</li>
						<li>
							<a href="portlet_draggable.html">
							Draggable Portlets</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="javascript:;">
					<i class="icon-pointer"></i>
					<span class="title">Maps</span>
					<span class="arrow "></span>
					</a>
					<ul class="sub-menu">
						<li>
							<a href="maps_google.html">
							Google Maps</a>
						</li>
						<li>
							<a href="maps_vector.html">
							Vector Maps</a>
						</li>
					</ul>
				</li>
				<li class="last ">
					<a href="charts.html">
					<i class="icon-bar-chart"></i>
					<span class="title">Visual Charts</span>
					</a>
				</li>
			</ul>
			<!-- END SIDEBAR MENU -->
		</div>
	</div>
	<!-- END SIDEBAR -->
	<!-- BEGIN CONTENT -->
	<div class="page-content-wrapper">
		<div class="page-content">
			<!-- BEGIN PAGE HEADER-->
			<h3 class="page-title">
			Prontuario Eletronico do Paciente <small>Cadastro do Paciente</small>
			</h3>
			<div class="page-bar">
				<ul class="page-breadcrumb">
					<li>
						<i class="fa fa-home"></i>
						<a href="index.html">Home</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<a href="#">Paciente</a>
						<i class="fa fa-angle-right"></i>
					</li>
					<li>
						<a href="#">Cadastro do Paciente</a>
					</li>
				</ul>
			</div>
			<!-- END PAGE HEADER-->
			<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-12">
					<div class="portlet box blue" id="form_wizard_1">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-gift"></i> Cadastro do Paciente - <span class="step-title"> Passo 1 de 4 </span>
							</div>
							<div class="tools hidden-xs">
								<a href="javascript:;" class="collapse">
								</a>
								<a href="#portlet-config" data-toggle="modal" class="config">
								</a>
								<a href="javascript:;" class="reload">
								</a>
								<a href="javascript:;" class="remove">
								</a>
							</div>
						</div>
						<div class="portlet-body form">
							<!-- #######COLOCAR A ACTION AQUI####### -->
							<form action="<c:url value='/PacienteSave'/>" class="form-horizontal" id="submit_form" method="POST">
								<div class="form-wizard">	
									<div class="form-body">
										<ul class="nav nav-pills nav-justified steps">
											<li>
												<a href="#tab1" data-toggle="tab" class="step">
												<span class="number">
												1 </span>
												<span class="desc">
												<i class="fa fa-check"></i>Criacao de Acesso</span>
												</a>
											</li>
											<li>
												<a href="#tab2" data-toggle="tab" class="step">
												<span class="number">
												2 </span>
												<span class="desc">
												<i class="fa fa-check"></i> Dados Pessoais </span>
												</a>
											</li>
											<li>
												<a href="#tab3" data-toggle="tab" class="step active">
												<span class="number">
												3 </span>
												<span class="desc">
												<i class="fa fa-check"></i> Endereco </span>
												</a>
											</li>
											<li>
												<a href="#tab4" data-toggle="tab" class="step">
												<span class="number">
												4 </span>
												<span class="desc">
												<i class="fa fa-check"></i> Confirmacao </span>
												</a>
											</li>
										</ul>
										<div id="bar" class="progress progress-striped" role="progressbar">
											<div class="progress-bar progress-bar-success">
											</div>
										</div>
										<div class="tab-content">
											<div class="alert alert-danger display-none">
												<button class="close" data-dismiss="alert"></button>
												Voce tem alguns erros no formulario. Verifique abaixo.
											</div>
											<div class="alert alert-success display-none">
												<button class="close" data-dismiss="alert"></button>
												Seu formulario foi validado com sucesso!
											</div>
											<div class="tab-pane active" id="tab1">
												<h3 class="block">Informe os dados para acesso</h3>
												<div class="form-group">
													<label class="control-label col-md-3">Nome de Usuario <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="text" class="form-control" name="username"/>
														<span class="help-block">
														Digite seu nome de usuario </span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Senha <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="password" class="form-control" name="password" id="submit_form_password"/>
														<span class="help-block">
														Digite sua senha. </span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Confirmacao da senha <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="password" class="form-control" name="rpassword"/>
														<span class="help-block">
														Confirme sua senha </span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Email <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="text" class="form-control" name="email"/>
														<span class="help-block">
														Digite seu endereco de email </span>
													</div>
												</div>
											</div>
											<div class="tab-pane" id="tab2">
												<h3 class="block">Informe seus dados pessoais</h3>
												<div class="form-group">
													<label class="control-label col-md-3">Nome completo <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="text" class="form-control" name="paciente.nome"/>
														<span class="help-block">
														Digite seu nome completo </span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">CPF <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="text" class="form-control" name="paciente.cpf"/>
														<span class="help-block">
														Digite seu CPF </span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Genero <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<div class="radio-list">
															<label>
															<input type="radio" name="paciente.genero" value="M" data-title="Male"/>
															Masculino </label>
															<label>
															<input type="radio" name="paciente.genero" value="F" data-title="Female"/>
															Feminino </label>
														</div>
														<div id="form_gender_error">
														</div>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Codigo de Registro <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="text" class="form-control" name="paciente.codigoRegistro"/>
														<span class="help-block">
														Digite o numero de Registro </span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Tipo Sanguineo</label>
													<div class="col-md-4">
														<select name="paciente.tipoSanguineo" id="tipo_sanguineo_list" class="form-control">
															<option value=""></option>
															<option value="O+">O+</option>
															<option value="A+">A+</option>
															<option value="B+">B+</option>
															<option value="AB+">AB+</option>
															<option value="O-">O-</option>
															<option value="A-">A-</option>
															<option value="B-">B-</option>
															<option value="AB-">AB-</option>
	                                                    </select>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Country</label>
													<div class="col-md-4">
														<select name="country" id="country_list" class="form-control">
															<option value=""></option>
															<option value="AF">Afghanistan</option>
															<option value="AL">Albania</option>
															<option value="DZ">Algeria</option>
															<option value="AS">American Samoa</option>
															<option value="AD">Andorra</option>
															<option value="AO">Angola</option>
															<option value="AI">Anguilla</option>
															<option value="AQ">Antarctica</option>
															<option value="AR">Argentina</option>
															<option value="AM">Armenia</option>
															<option value="AW">Aruba</option>
															<option value="AU">Australia</option>
															<option value="AT">Austria</option>
															<option value="AZ">Azerbaijan</option>
															<option value="BS">Bahamas</option>
															<option value="BH">Bahrain</option>
															<option value="BD">Bangladesh</option>
															<option value="BB">Barbados</option>
															<option value="BY">Belarus</option>
															<option value="BE">Belgium</option>
															<option value="BZ">Belize</option>
															<option value="BJ">Benin</option>
															<option value="BM">Bermuda</option>
															<option value="BT">Bhutan</option>
															<option value="BO">Bolivia</option>
															<option value="BA">Bosnia and Herzegowina</option>
															<option value="BW">Botswana</option>
															<option value="BV">Bouvet Island</option>
															<option value="BR">Brazil</option>
															<option value="IO">British Indian Ocean Territory</option>
															<option value="BN">Brunei Darussalam</option>
															<option value="BG">Bulgaria</option>
															<option value="BF">Burkina Faso</option>
															<option value="BI">Burundi</option>
															<option value="KH">Cambodia</option>
															<option value="CM">Cameroon</option>
															<option value="CA">Canada</option>
															<option value="CV">Cape Verde</option>
															<option value="KY">Cayman Islands</option>
															<option value="CF">Central African Republic</option>
															<option value="TD">Chad</option>
															<option value="CL">Chile</option>
															<option value="CN">China</option>
															<option value="CX">Christmas Island</option>
															<option value="CC">Cocos (Keeling) Islands</option>
															<option value="CO">Colombia</option>
															<option value="KM">Comoros</option>
															<option value="CG">Congo</option>
															<option value="CD">Congo, the Democratic Republic of the</option>
															<option value="CK">Cook Islands</option>
															<option value="CR">Costa Rica</option>
															<option value="CI">Cote d'Ivoire</option>
															<option value="HR">Croatia (Hrvatska)</option>
															<option value="CU">Cuba</option>
															<option value="CY">Cyprus</option>
															<option value="CZ">Czech Republic</option>
															<option value="DK">Denmark</option>
															<option value="DJ">Djibouti</option>
															<option value="DM">Dominica</option>
															<option value="DO">Dominican Republic</option>
															<option value="EC">Ecuador</option>
															<option value="EG">Egypt</option>
															<option value="SV">El Salvador</option>
															<option value="GQ">Equatorial Guinea</option>
															<option value="ER">Eritrea</option>
															<option value="EE">Estonia</option>
															<option value="ET">Ethiopia</option>
															<option value="FK">Falkland Islands (Malvinas)</option>
															<option value="FO">Faroe Islands</option>
															<option value="FJ">Fiji</option>
															<option value="FI">Finland</option>
															<option value="FR">France</option>
															<option value="GF">French Guiana</option>
															<option value="PF">French Polynesia</option>
															<option value="TF">French Southern Territories</option>
															<option value="GA">Gabon</option>
															<option value="GM">Gambia</option>
															<option value="GE">Georgia</option>
															<option value="DE">Germany</option>
															<option value="GH">Ghana</option>
															<option value="GI">Gibraltar</option>
															<option value="GR">Greece</option>
															<option value="GL">Greenland</option>
															<option value="GD">Grenada</option>
															<option value="GP">Guadeloupe</option>
															<option value="GU">Guam</option>
															<option value="GT">Guatemala</option>
															<option value="GN">Guinea</option>
															<option value="GW">Guinea-Bissau</option>
															<option value="GY">Guyana</option>
															<option value="HT">Haiti</option>
															<option value="HM">Heard and Mc Donald Islands</option>
															<option value="VA">Holy See (Vatican City State)</option>
															<option value="HN">Honduras</option>
															<option value="HK">Hong Kong</option>
															<option value="HU">Hungary</option>
															<option value="IS">Iceland</option>
															<option value="IN">India</option>
															<option value="ID">Indonesia</option>
															<option value="IR">Iran (Islamic Republic of)</option>
															<option value="IQ">Iraq</option>
															<option value="IE">Ireland</option>
															<option value="IL">Israel</option>
															<option value="IT">Italy</option>
															<option value="JM">Jamaica</option>
															<option value="JP">Japan</option>
															<option value="JO">Jordan</option>
															<option value="KZ">Kazakhstan</option>
															<option value="KE">Kenya</option>
															<option value="KI">Kiribati</option>
															<option value="KP">Korea, Democratic People's Republic of</option>
															<option value="KR">Korea, Republic of</option>
															<option value="KW">Kuwait</option>
															<option value="KG">Kyrgyzstan</option>
															<option value="LA">Lao People's Democratic Republic</option>
															<option value="LV">Latvia</option>
															<option value="LB">Lebanon</option>
															<option value="LS">Lesotho</option>
															<option value="LR">Liberia</option>
															<option value="LY">Libyan Arab Jamahiriya</option>
															<option value="LI">Liechtenstein</option>
															<option value="LT">Lithuania</option>
															<option value="LU">Luxembourg</option>
															<option value="MO">Macau</option>
															<option value="MK">Macedonia, The Former Yugoslav Republic of</option>
															<option value="MG">Madagascar</option>
															<option value="MW">Malawi</option>
															<option value="MY">Malaysia</option>
															<option value="MV">Maldives</option>
															<option value="ML">Mali</option>
															<option value="MT">Malta</option>
															<option value="MH">Marshall Islands</option>
															<option value="MQ">Martinique</option>
															<option value="MR">Mauritania</option>
															<option value="MU">Mauritius</option>
															<option value="YT">Mayotte</option>
															<option value="MX">Mexico</option>
															<option value="FM">Micronesia, Federated States of</option>
															<option value="MD">Moldova, Republic of</option>
															<option value="MC">Monaco</option>
															<option value="MN">Mongolia</option>
															<option value="MS">Montserrat</option>
															<option value="MA">Morocco</option>
															<option value="MZ">Mozambique</option>
															<option value="MM">Myanmar</option>
															<option value="NA">Namibia</option>
															<option value="NR">Nauru</option>
															<option value="NP">Nepal</option>
															<option value="NL">Netherlands</option>
															<option value="AN">Netherlands Antilles</option>
															<option value="NC">New Caledonia</option>
															<option value="NZ">New Zealand</option>
															<option value="NI">Nicaragua</option>
															<option value="NE">Niger</option>
															<option value="NG">Nigeria</option>
															<option value="NU">Niue</option>
															<option value="NF">Norfolk Island</option>
															<option value="MP">Northern Mariana Islands</option>
															<option value="NO">Norway</option>
															<option value="OM">Oman</option>
															<option value="PK">Pakistan</option>
															<option value="PW">Palau</option>
															<option value="PA">Panama</option>
															<option value="PG">Papua New Guinea</option>
															<option value="PY">Paraguay</option>
															<option value="PE">Peru</option>
															<option value="PH">Philippines</option>
															<option value="PN">Pitcairn</option>
															<option value="PL">Poland</option>
															<option value="PT">Portugal</option>
															<option value="PR">Puerto Rico</option>
															<option value="QA">Qatar</option>
															<option value="RE">Reunion</option>
															<option value="RO">Romania</option>
															<option value="RU">Russian Federation</option>
															<option value="RW">Rwanda</option>
															<option value="KN">Saint Kitts and Nevis</option>
															<option value="LC">Saint LUCIA</option>
															<option value="VC">Saint Vincent and the Grenadines</option>
															<option value="WS">Samoa</option>
															<option value="SM">San Marino</option>
															<option value="ST">Sao Tome and Principe</option>
															<option value="SA">Saudi Arabia</option>
															<option value="SN">Senegal</option>
															<option value="SC">Seychelles</option>
															<option value="SL">Sierra Leone</option>
															<option value="SG">Singapore</option>
															<option value="SK">Slovakia (Slovak Republic)</option>
															<option value="SI">Slovenia</option>
															<option value="SB">Solomon Islands</option>
															<option value="SO">Somalia</option>
															<option value="ZA">South Africa</option>
															<option value="GS">South Georgia and the South Sandwich Islands</option>
															<option value="ES">Spain</option>
															<option value="LK">Sri Lanka</option>
															<option value="SH">St. Helena</option>
															<option value="PM">St. Pierre and Miquelon</option>
															<option value="SD">Sudan</option>
															<option value="SR">Suriname</option>
															<option value="SJ">Svalbard and Jan Mayen Islands</option>
															<option value="SZ">Swaziland</option>
															<option value="SE">Sweden</option>
															<option value="CH">Switzerland</option>
															<option value="SY">Syrian Arab Republic</option>
															<option value="TW">Taiwan, Province of China</option>
															<option value="TJ">Tajikistan</option>
															<option value="TZ">Tanzania, United Republic of</option>
															<option value="TH">Thailand</option>
															<option value="TG">Togo</option>
															<option value="TK">Tokelau</option>
															<option value="TO">Tonga</option>
															<option value="TT">Trinidad and Tobago</option>
															<option value="TN">Tunisia</option>
															<option value="TR">Turkey</option>
															<option value="TM">Turkmenistan</option>
															<option value="TC">Turks and Caicos Islands</option>
															<option value="TV">Tuvalu</option>
															<option value="UG">Uganda</option>
															<option value="UA">Ukraine</option>
															<option value="AE">United Arab Emirates</option>
															<option value="GB">United Kingdom</option>
															<option value="US">United States</option>
															<option value="UM">United States Minor Outlying Islands</option>
															<option value="UY">Uruguay</option>
															<option value="UZ">Uzbekistan</option>
															<option value="VU">Vanuatu</option>
															<option value="VE">Venezuela</option>
															<option value="VN">Viet Nam</option>
															<option value="VG">Virgin Islands (British)</option>
															<option value="VI">Virgin Islands (U.S.)</option>
															<option value="WF">Wallis and Futuna Islands</option>
															<option value="EH">Western Sahara</option>
															<option value="YE">Yemen</option>
															<option value="ZM">Zambia</option>
															<option value="ZW">Zimbabwe</option>
														</select>
													</div>
												</div>
											</div>
											<div class="tab-pane" id="tab3">
												<h3 class="block">Provide your billing and credit card details</h3>
												<div class="form-group">
													<label class="control-label col-md-3">Card Holder Name <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="text" class="form-control" name="card_name"/>
														<span class="help-block">
														</span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Card Number <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="text" class="form-control" name="card_number"/>
														<span class="help-block">
														</span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">CVC <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="text" placeholder="" class="form-control" name="card_cvc"/>
														<span class="help-block">
														</span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Expiration(MM/YYYY) <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<input type="text" placeholder="MM/YYYY" maxlength="7" class="form-control" name="card_expiry_date"/>
														<span class="help-block">
														e.g 11/2020 </span>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Payment Options <span class="required">
													* </span>
													</label>
													<div class="col-md-4">
														<div class="checkbox-list">
															<label>
															<input type="checkbox" name="payment[]" value="1" data-title="Auto-Pay with this Credit Card."/> Auto-Pay with this Credit Card </label>
															<label>
															<input type="checkbox" name="payment[]" value="2" data-title="Email me monthly billing."/> Email me monthly billing </label>
														</div>
														<div id="form_payment_error">
														</div>
													</div>
												</div>
											</div>
											<div class="tab-pane" id="tab4">
												<h3 class="block">Confirme seu cadastro</h3>
												<h4 class="form-section">Acesso</h4>
												<div class="form-group">
													<label class="control-label col-md-3">Nome de Usuario:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="username">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Email:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="email">
														</p>
													</div>
												</div>
												<h4 class="form-section">Dados Pessoais</h4>
												<div class="form-group">
													<label class="control-label col-md-3">Nome Completo:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="paciente.nome">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">z:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="paciente.genero">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Phone:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="phone">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Address:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="address">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">City/Town:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="city">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Country:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="country">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Remarks:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="remarks">
														</p>
													</div>
												</div>
												<h4 class="form-section">Billing</h4>
												<div class="form-group">
													<label class="control-label col-md-3">Card Holder Name:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="card_name">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Card Number:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="card_number">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">CVC:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="card_cvc">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Expiration:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="card_expiry_date">
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Payment Options:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="payment">
														</p>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="form-actions">
										<div class="row">
											<div class="col-md-offset-3 col-md-9">
												<a href="javascript:;" class="btn default button-previous">
												<i class="m-icon-swapleft"></i> Voltar </a>
												<a href="javascript:;" class="btn blue button-next">
												Continue <i class="m-icon-swapright m-icon-white"></i>
												</a>
												<a href="javascript:;" class="btn green button-submit">
												Submit <i class="m-icon-swapright m-icon-white"></i>
												</a>
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- END PAGE CONTENT-->
		</div>
	</div>
	<!-- END CONTENT -->
	<!-- BEGIN QUICK SIDEBAR -->
	<a href="javascript:;" class="page-quick-sidebar-toggler"><i class="icon-close"></i></a>
	<div class="page-quick-sidebar-wrapper">
		<div class="page-quick-sidebar">
			<div class="nav-justified">
				<ul class="nav nav-tabs nav-justified">
					<li class="active">
						<a href="#quick_sidebar_tab_1" data-toggle="tab">
						Users <span class="badge badge-danger">2</span>
						</a>
					</li>
					<li>
						<a href="#quick_sidebar_tab_2" data-toggle="tab">
						Alerts <span class="badge badge-success">7</span>
						</a>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						More<i class="fa fa-angle-down"></i>
						</a>
						<ul class="dropdown-menu pull-right" role="menu">
							<li>
								<a href="#quick_sidebar_tab_3" data-toggle="tab">
								<i class="icon-bell"></i> Alerts </a>
							</li>
							<li>
								<a href="#quick_sidebar_tab_3" data-toggle="tab">
								<i class="icon-info"></i> Notifications </a>
							</li>
							<li>
								<a href="#quick_sidebar_tab_3" data-toggle="tab">
								<i class="icon-speech"></i> Activities </a>
							</li>
							<li class="divider">
							</li>
							<li>
								<a href="#quick_sidebar_tab_3" data-toggle="tab">
								<i class="icon-settings"></i> Settings </a>
							</li>
						</ul>
					</li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active page-quick-sidebar-chat" id="quick_sidebar_tab_1">
						<div class="page-quick-sidebar-chat-users" data-rail-color="#ddd" data-wrapper-class="page-quick-sidebar-list">
							<h3 class="list-heading">Staff</h3>
							<ul class="media-list list-items">
								<li class="media">
									<div class="media-status">
										<span class="badge badge-success">8</span>
									</div>
									<img class="media-object" src="assets/admin/layout/img/avatar3.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Bob Nilson</h4>
										<div class="media-heading-sub">
											 Project Manager
										</div>
									</div>
								</li>
								<li class="media">
									<img class="media-object" src="assets/admin/layout/img/avatar1.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Nick Larson</h4>
										<div class="media-heading-sub">
											 Art Director
										</div>
									</div>
								</li>
								<li class="media">
									<div class="media-status">
										<span class="badge badge-danger">3</span>
									</div>
									<img class="media-object" src="assets/admin/layout/img/avatar4.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Deon Hubert</h4>
										<div class="media-heading-sub">
											 CTO
										</div>
									</div>
								</li>
								<li class="media">
									<img class="media-object" src="assets/admin/layout/img/avatar2.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Ella Wong</h4>
										<div class="media-heading-sub">
											 CEO
										</div>
									</div>
								</li>
							</ul>
							<h3 class="list-heading">Customers</h3>
							<ul class="media-list list-items">
								<li class="media">
									<div class="media-status">
										<span class="badge badge-warning">2</span>
									</div>
									<img class="media-object" src="assets/admin/layout/img/avatar6.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Lara Kunis</h4>
										<div class="media-heading-sub">
											 CEO, Loop Inc
										</div>
										<div class="media-heading-small">
											 Last seen 03:10 AM
										</div>
									</div>
								</li>
								<li class="media">
									<div class="media-status">
										<span class="label label-sm label-success">new</span>
									</div>
									<img class="media-object" src="assets/admin/layout/img/avatar7.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Ernie Kyllonen</h4>
										<div class="media-heading-sub">
											 Project Manager,<br>
											 SmartBizz PTL
										</div>
									</div>
								</li>
								<li class="media">
									<img class="media-object" src="assets/admin/layout/img/avatar8.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Lisa Stone</h4>
										<div class="media-heading-sub">
											 CTO, Keort Inc
										</div>
										<div class="media-heading-small">
											 Last seen 13:10 PM
										</div>
									</div>
								</li>
								<li class="media">
									<div class="media-status">
										<span class="badge badge-success">7</span>
									</div>
									<img class="media-object" src="assets/admin/layout/img/avatar9.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Deon Portalatin</h4>
										<div class="media-heading-sub">
											 CFO, H&D LTD
										</div>
									</div>
								</li>
								<li class="media">
									<img class="media-object" src="assets/admin/layout/img/avatar10.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Irina Savikova</h4>
										<div class="media-heading-sub">
											 CEO, Tizda Motors Inc
										</div>
									</div>
								</li>
								<li class="media">
									<div class="media-status">
										<span class="badge badge-danger">4</span>
									</div>
									<img class="media-object" src="assets/admin/layout/img/avatar11.jpg" alt="...">
									<div class="media-body">
										<h4 class="media-heading">Maria Gomez</h4>
										<div class="media-heading-sub">
											 Manager, Infomatic Inc
										</div>
										<div class="media-heading-small">
											 Last seen 03:10 AM
										</div>
									</div>
								</li>
							</ul>
						</div>
						<div class="page-quick-sidebar-item">
							<div class="page-quick-sidebar-chat-user">
								<div class="page-quick-sidebar-nav">
									<a href="javascript:;" class="page-quick-sidebar-back-to-list"><i class="icon-arrow-left"></i>Back</a>
								</div>
								<div class="page-quick-sidebar-chat-user-messages">
									<div class="post out">
										<img class="avatar" alt="" src="assets/admin/layout/img/avatar3.jpg"/>
										<div class="message">
											<span class="arrow"></span>
											<a href="#" class="name">Bob Nilson</a>
											<span class="datetime">20:15</span>
											<span class="body">
											When could you send me the report ? </span>
										</div>
									</div>
									<div class="post in">
										<img class="avatar" alt="" src="assets/admin/layout/img/avatar2.jpg"/>
										<div class="message">
											<span class="arrow"></span>
											<a href="#" class="name">Ella Wong</a>
											<span class="datetime">20:15</span>
											<span class="body">
											Its almost done. I will be sending it shortly </span>
										</div>
									</div>
									<div class="post out">
										<img class="avatar" alt="" src="assets/admin/layout/img/avatar3.jpg"/>
										<div class="message">
											<span class="arrow"></span>
											<a href="#" class="name">Bob Nilson</a>
											<span class="datetime">20:15</span>
											<span class="body">
											Alright. Thanks! :) </span>
										</div>
									</div>
									<div class="post in">
										<img class="avatar" alt="" src="assets/admin/layout/img/avatar2.jpg"/>
										<div class="message">
											<span class="arrow"></span>
											<a href="#" class="name">Ella Wong</a>
											<span class="datetime">20:16</span>
											<span class="body">
											You are most welcome. Sorry for the delay. </span>
										</div>
									</div>
									<div class="post out">
										<img class="avatar" alt="" src="assets/admin/layout/img/avatar3.jpg"/>
										<div class="message">
											<span class="arrow"></span>
											<a href="#" class="name">Bob Nilson</a>
											<span class="datetime">20:17</span>
											<span class="body">
											No probs. Just take your time :) </span>
										</div>
									</div>
									<div class="post in">
										<img class="avatar" alt="" src="assets/admin/layout/img/avatar2.jpg"/>
										<div class="message">
											<span class="arrow"></span>
											<a href="#" class="name">Ella Wong</a>
											<span class="datetime">20:40</span>
											<span class="body">
											Alright. I just emailed it to you. </span>
										</div>
									</div>
									<div class="post out">
										<img class="avatar" alt="" src="assets/admin/layout/img/avatar3.jpg"/>
										<div class="message">
											<span class="arrow"></span>
											<a href="#" class="name">Bob Nilson</a>
											<span class="datetime">20:17</span>
											<span class="body">
											Great! Thanks. Will check it right away. </span>
										</div>
									</div>
									<div class="post in">
										<img class="avatar" alt="" src="assets/admin/layout/img/avatar2.jpg"/>
										<div class="message">
											<span class="arrow"></span>
											<a href="#" class="name">Ella Wong</a>
											<span class="datetime">20:40</span>
											<span class="body">
											Please let me know if you have any comment. </span>
										</div>
									</div>
									<div class="post out">
										<img class="avatar" alt="" src="assets/admin/layout/img/avatar3.jpg"/>
										<div class="message">
											<span class="arrow"></span>
											<a href="#" class="name">Bob Nilson</a>
											<span class="datetime">20:17</span>
											<span class="body">
											Sure. I will check and buzz you if anything needs to be corrected. </span>
										</div>
									</div>
								</div>
								<div class="page-quick-sidebar-chat-user-form">
									<div class="input-group">
										<input type="text" class="form-control" placeholder="Type a message here...">
										<div class="input-group-btn">
											<button type="button" class="btn blue"><i class="icon-paper-clip"></i></button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="tab-pane page-quick-sidebar-alerts" id="quick_sidebar_tab_2">
						<div class="page-quick-sidebar-alerts-list">
							<h3 class="list-heading">General</h3>
							<ul class="feeds list-items">
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-info">
													<i class="fa fa-check"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 You have 4 pending tasks. <span class="label label-sm label-warning ">
													Take action <i class="fa fa-share"></i>
													</span>
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 Just now
										</div>
									</div>
								</li>
								<li>
									<a href="#">
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-success">
													<i class="fa fa-bar-chart-o"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 Finance Report for year 2013 has been released.
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 20 mins
										</div>
									</div>
									</a>
								</li>
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-danger">
													<i class="fa fa-user"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 You have 5 pending membership that requires a quick review.
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 24 mins
										</div>
									</div>
								</li>
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-info">
													<i class="fa fa-shopping-cart"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 New order received with <span class="label label-sm label-success">
													Reference Number: DR23923 </span>
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 30 mins
										</div>
									</div>
								</li>
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-success">
													<i class="fa fa-user"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 You have 5 pending membership that requires a quick review.
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 24 mins
										</div>
									</div>
								</li>
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-info">
													<i class="fa fa-bell-o"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 Web server hardware needs to be upgraded. <span class="label label-sm label-warning">
													Overdue </span>
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 2 hours
										</div>
									</div>
								</li>
								<li>
									<a href="#">
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-default">
													<i class="fa fa-briefcase"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 IPO Report for year 2013 has been released.
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 20 mins
										</div>
									</div>
									</a>
								</li>
							</ul>
							<h3 class="list-heading">System</h3>
							<ul class="feeds list-items">
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-info">
													<i class="fa fa-check"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 You have 4 pending tasks. <span class="label label-sm label-warning ">
													Take action <i class="fa fa-share"></i>
													</span>
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 Just now
										</div>
									</div>
								</li>
								<li>
									<a href="#">
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-danger">
													<i class="fa fa-bar-chart-o"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 Finance Report for year 2013 has been released.
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 20 mins
										</div>
									</div>
									</a>
								</li>
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-default">
													<i class="fa fa-user"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 You have 5 pending membership that requires a quick review.
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 24 mins
										</div>
									</div>
								</li>
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-info">
													<i class="fa fa-shopping-cart"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 New order received with <span class="label label-sm label-success">
													Reference Number: DR23923 </span>
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 30 mins
										</div>
									</div>
								</li>
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-success">
													<i class="fa fa-user"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 You have 5 pending membership that requires a quick review.
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 24 mins
										</div>
									</div>
								</li>
								<li>
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-warning">
													<i class="fa fa-bell-o"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 Web server hardware needs to be upgraded. <span class="label label-sm label-default ">
													Overdue </span>
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 2 hours
										</div>
									</div>
								</li>
								<li>
									<a href="#">
									<div class="col1">
										<div class="cont">
											<div class="cont-col1">
												<div class="label label-sm label-info">
													<i class="fa fa-briefcase"></i>
												</div>
											</div>
											<div class="cont-col2">
												<div class="desc">
													 IPO Report for year 2013 has been released.
												</div>
											</div>
										</div>
									</div>
									<div class="col2">
										<div class="date">
											 20 mins
										</div>
									</div>
									</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="tab-pane page-quick-sidebar-settings" id="quick_sidebar_tab_3">
						<div class="page-quick-sidebar-settings-list">
							<h3 class="list-heading">General Settings</h3>
							<ul class="list-items borderless">
								<li>
									 Enable Notifications <input type="checkbox" class="make-switch" checked data-size="small" data-on-color="success" data-on-text="ON" data-off-color="default" data-off-text="OFF">
								</li>
								<li>
									 Allow Tracking <input type="checkbox" class="make-switch" data-size="small" data-on-color="info" data-on-text="ON" data-off-color="default" data-off-text="OFF">
								</li>
								<li>
									 Log Errors <input type="checkbox" class="make-switch" checked data-size="small" data-on-color="danger" data-on-text="ON" data-off-color="default" data-off-text="OFF">
								</li>
								<li>
									 Auto Sumbit Issues <input type="checkbox" class="make-switch" data-size="small" data-on-color="warning" data-on-text="ON" data-off-color="default" data-off-text="OFF">
								</li>
								<li>
									 Enable SMS Alerts <input type="checkbox" class="make-switch" checked data-size="small" data-on-color="success" data-on-text="ON" data-off-color="default" data-off-text="OFF">
								</li>
							</ul>
							<h3 class="list-heading">System Settings</h3>
							<ul class="list-items borderless">
								<li>
									 Security Level
									<select class="form-control input-inline input-sm input-small">
										<option value="1">Normal</option>
										<option value="2" selected>Medium</option>
										<option value="e">High</option>
									</select>
								</li>
								<li>
									 Failed Email Attempts <input class="form-control input-inline input-sm input-small" value="5"/>
								</li>
								<li>
									 Secondary SMTP Port <input class="form-control input-inline input-sm input-small" value="3560"/>
								</li>
								<li>
									 Notify On System Error <input type="checkbox" class="make-switch" checked data-size="small" data-on-color="danger" data-on-text="ON" data-off-color="default" data-off-text="OFF">
								</li>
								<li>
									 Notify On SMTP Error <input type="checkbox" class="make-switch" checked data-size="small" data-on-color="warning" data-on-text="ON" data-off-color="default" data-off-text="OFF">
								</li>
							</ul>
							<div class="inner-content">
								<button class="btn btn-success"><i class="icon-settings"></i> Save Changes</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- END QUICK SIDEBAR -->
</div>
<!-- END CONTAINER -->
<!-- BEGIN FOOTER -->
<div class="page-footer">
	<div class="page-footer-inner">
		 2014 &copy; TCC FIAP.
	</div>
	<div class="page-footer-tools">
		<span class="go-top">
		<i class="fa fa-angle-up"></i>
		</span>
	</div>
</div>
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="assets/global/plugins/respond.min.js"></script>
<script src="assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->
<script src="assets/global/plugins/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui-1.10.3.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="assets/global/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="assets/global/plugins/jquery-validation/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="assets/global/plugins/jquery-validation/js/additional-methods.min.js"></script>
<script type="text/javascript" src="assets/global/plugins/bootstrap-wizard/jquery.bootstrap.wizard.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="assets/global/plugins/select2/select2.min.js"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="assets/global/scripts/metronic.js" type="text/javascript"></script>
<script src="assets/admin/layout/scripts/layout.js" type="text/javascript"></script>
<script src="assets/admin/layout/scripts/quick-sidebar.js" type="text/javascript"></script>
<script src="assets/admin/layout/scripts/demo.js" type="text/javascript"></script>
<script src="assets/admin/pages/scripts/form-wizard.js"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
jQuery(document).ready(function() {       
   // initiate layout and plugins
   Metronic.init(); // init metronic core components
Layout.init(); // init current layout
QuickSidebar.init(); // init quick sidebar
Demo.init(); // init demo features
   FormWizard.init();
});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>