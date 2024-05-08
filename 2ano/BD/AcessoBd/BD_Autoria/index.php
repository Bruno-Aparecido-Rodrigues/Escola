<html>
<head>   
<link rel="stylesheet" href="css/stylesheet.css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">  
<script language=javascript>
           
           function blokletras(keypress)
           {
           //campo senha - bloqueia letras
           
              if(keypress>=48 && keypress<=57)
                 {
                     return true;
                 }
              else
                 {
                     return false;
                 }
              }  
          </script>    
</head>

<body>
    <form name="cliente"  method = "POST" action = "">
    <div class='container'>
  <div class='card'>
    <h1> Tela de Log-in</h1>
    
    <div id='msgError'></div>
    <div id='msgSuccess'></div>
    
            <div class="label-float">
               <input name="txtnome" type="text" id="codau" placeholder=" " required>
               <label id="labelTitulo" for="titulo">Nome do Usuário</label>
            </div>

            <div class="label-float">
               <input name="txtsenha" type="password" id="codli" placeholder=" " required onkeypress="return blokletras(window.event.keyCode)">
               <label id="labelSenha" for="senha">Senha</label>
            </div>

            
            <div class='justify-center'>
            <button name="btnenviar" type="submit" value="Cadastrar">Conectar</button> &nbsp;&nbsp;&nbsp;&nbsp;
            <button name="limpar" type="reset" value="Cadastrar">Limpar</button>
            </div>

    
  </div>
  </div>

  </form>

     <?php
     extract($_POST, EXTR_OVERWRITE);
     if(isset($btnenviar))
      {
        include_once 'php/usuario.php';
        $u=new Usuario();
        $u->setUsu ($txtnome);
        $u->setSenha($txtsenha);
        $pro_bd=$u->logar();

        $existe = false;
        foreach($pro_bd as $pro_mostrar)
          {
              $existe = true;
              ?>
                <center>
                 <br><b> <?php echo "<font color='white'>Bem vindo! Usuário: ".$pro_mostrar[0]."</font>"; ?></b> <br><br>

                 
                 <a href="php/menu.html"><button name="btnenviar" type="submit" value="Cadastrar">Entrar</button></a>
                 </center>
                 <?php
                  }
          if($existe==false)
          {
              header("location:php/LoginInvalido.html");
          }        
      }
      ?>
   </body>
</html>