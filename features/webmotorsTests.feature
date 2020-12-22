# language: pt

	Funcionalidade: Testar página de usuário do Webmotors
	
		Um cliente deseja fazer login no site e verificar se está na página Minha Garagem
		
	@evidencia
	Cenario: Validar se o usuário faz login
	Dado que eu navego até a página de login do Webmotors
	Quando eu preencho os meus dados
	E clico no botão entrar
	Então eu estou logado
	
	
	@evidencia
	Cenario: Validar quando usuário faz login com user e senha errados
	Dado que eu navego até a página de login do Webmotors
	Quando eu preencho os campos com login e senha errada
	E clico no botão entrar
	Então eu devo ver a mensagem de erro, ou ser redirecionado pra um tela de trativa
	
	@evidencia
	Cenario: Validar botão de Pesquisa
	Dado que eu navego até a página Home do Webmotors
	Quando clico no botão Ver Ofertas
	Então devo ser redirecionado a pagina da busca
		
	@evidencia
	Cenario: Validar seleção do filtro Localização
	Dado que eu navego até a página Pesquisa
	Quando digito são paulo no input de texto do campo localização 
	Então devo ser redirecionado a pagina da busca em São Paulo

	@evidencia
	Cenario: Validar seleção do filtro Car Delivery
	Dado que eu navego até a página Pesquisa
	Quando Quando seleciono o filtro Car delivery
	Então devo ser redirecionado a pagina da busca em Car Delivery


@evidencia
	Cenario: Validar submenu no ver ofertas
	Dado que eu navego até a página home do Webmotors
	Quando eu clico no botão ver ofertas
	Então vejo os itens do submenu
	
	@evidencia
  Cenario: Validar elementos do menu home 
  Dado que eu navego até a página home do Webmotors
  E verifico que existe itens no  menu
  
 @evidencia
 Cenario: Validar elementos do menu de busca página home
    Dado que eu navego até a página home do Webmotors
    E verifico que existe o menu da barra de Busca
    
@evidencia
Cenario: Validar  Página quero Financiar 
Dado que eu navego até a página home do Webmotors
Então verifico que sou direcionada para página de quero financiar


